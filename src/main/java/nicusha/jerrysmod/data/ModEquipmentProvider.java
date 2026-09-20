package nicusha.jerrysmod.data;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import net.minecraft.data.CachedOutput;
import net.minecraft.data.DataProvider;
import net.minecraft.data.PackOutput;
import nicusha.jerrysmod.JerrysMod;

import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ModEquipmentProvider implements DataProvider {
    private final PackOutput packOutput;

    public ModEquipmentProvider(PackOutput packOutput) {
        this.packOutput = packOutput;
    }

    private CompletableFuture<?> generateEquipmentJson(CachedOutput cachedOutput, String equipmentId) {
        JsonObject root = new JsonObject();
        JsonObject layers = new JsonObject();
        JsonArray humanoidLayerArray = new JsonArray();
        JsonObject humanoidLayer = new JsonObject();
        humanoidLayer.addProperty("texture", JerrysMod.MODID + ":" + equipmentId);
        humanoidLayerArray.add(humanoidLayer);
        layers.add("humanoid", humanoidLayerArray);
        JsonArray humanoidLeggingsLayerArray = new JsonArray();
        JsonObject humanoidLeggingsLayer = new JsonObject();
        humanoidLeggingsLayer.addProperty("texture", JerrysMod.MODID + ":" + equipmentId);
        humanoidLeggingsLayerArray.add(humanoidLeggingsLayer);
        layers.add("humanoid_leggings", humanoidLeggingsLayerArray);
        root.add("layers", layers);
        return DataProvider.saveStable(cachedOutput, root, getEquipmentModelPath(equipmentId));
    }

    private Path getEquipmentModelPath(String equipmentId) {
        return packOutput.getOutputFolder(PackOutput.Target.RESOURCE_PACK).resolve(JerrysMod.MODID).resolve("equipment").resolve(equipmentId + ".json");
    }

    @Override
    public CompletableFuture<?> run(CachedOutput cachedOutput) {
        List<CompletableFuture<?>> futures = new ArrayList<>();
        futures.add(generateEquipmentJson(cachedOutput, "slime"));
        futures.add(generateEquipmentJson(cachedOutput, "jerry"));
        return CompletableFuture.allOf(futures.toArray(CompletableFuture[]::new));
    }

    @Override
    public String getName() {
        return "Jerry's Mod Additional Equipment Generator";
    }
}