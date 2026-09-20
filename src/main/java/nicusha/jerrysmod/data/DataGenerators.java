package nicusha.jerrysmod.data;

import net.minecraft.core.HolderLookup;
import net.minecraft.core.RegistrySetBuilder;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.neoforged.neoforge.common.data.DatapackBuiltinEntriesProvider;
import net.neoforged.neoforge.data.event.GatherDataEvent;
import nicusha.jerrysmod.JerrysMod;

import java.util.Set;
import java.util.concurrent.CompletableFuture;


public class DataGenerators {

    public static void genData(GatherDataEvent.Client event) {
        PackOutput output = event.getGenerator().getPackOutput();
        CompletableFuture<HolderLookup.Provider> world = event.getWorldLookupProvider();
        CompletableFuture<HolderLookup.Provider> reloadable = event.getReloadableLookupProvider();
        DataGenerator generator = event.getGenerator();

        generator.addProvider(true, new ModLangProvider(event.getGenerator().getPackOutput(), "en_us"));
        String[] popularLanguages = {"es_es", "fr_fr", "de_de", "zh_cn", "ja_jp", "ru_ru", "hi_in", "ar_sa", "th_th", "tk_ph", "sv_se", "pt_pt", "it_it"};
        for (String lang : popularLanguages) {
            generator.addProvider(true, new ModLangProvider(event.getGenerator().getPackOutput(), lang));
        }

        event.createProvider(ModModelProvider::new);
        generator.addProvider(true, new ModEquipmentProvider(output));
        event.createBlockAndItemTags(ModBlockTagsProvider::new, (packOutput, lookup, blockTags) -> new ModItemTagsProvider(packOutput, lookup));
        event.addProvider(DatapackBuiltinEntriesProvider.forReloadableLayer(output, "Jerry's Mod Reloadable", world, reloadable, new RegistrySetBuilder().add(Registries.LOOT_TABLE, new ModLootTableProvider()), Set.of(JerrysMod.MODID)));

        generator.addProvider(true, DatapackBuiltinEntriesProvider.forReloadableLayer(output, "Jerry's Mod Recipes", world, reloadable, new RegistrySetBuilder().add(RecipeProvider.asBootstrap(ModRecipeProvider::new)), Set.of(JerrysMod.MODID)));
    }
}