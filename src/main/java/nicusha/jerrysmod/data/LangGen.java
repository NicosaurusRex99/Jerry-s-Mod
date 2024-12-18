package nicusha.jerrysmod.data;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import net.minecraft.data.CachedOutput;
import net.minecraft.data.DataProvider;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import nicusha.jerrysmod.JerrysMod;
import nicusha.jerrysmod.registry.BlockRegistry;
import nicusha.jerrysmod.registry.ItemRegistry;

import java.nio.file.Path;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

public class LangGen implements DataProvider {
    private final PackOutput packOutput;
    private final Map<String, String> enTranslations = new HashMap<>();
    private final Map<String, String> ruTranslations = new HashMap<>();
    private final Gson gson = new GsonBuilder().setPrettyPrinting().create();

    public LangGen(PackOutput packOutput) {
        this.packOutput = packOutput;
    }

    @Override
    public CompletableFuture<?> run(CachedOutput cachedOutput) {
        addTranslations();

        validateTranslations(enTranslations, "en_us");
        validateTranslations(ruTranslations, "ru_ru");

        return CompletableFuture.allOf(
                saveTranslations(cachedOutput, enTranslations, "en_us"),
                saveTranslations(cachedOutput, ruTranslations, "ru_ru")
        );
    }

    private void addTranslations() {
        // English translations
        BlockRegistry.BLOCKS.getEntries().forEach(regObj -> {
            ResourceLocation blockId = regObj.getId();
            enTranslations.put(
                    "block." + JerrysMod.MODID + "." + blockId.getPath(),
                    generateLocalizedNameFromPath(blockId.getPath())
            );
        });

        ItemRegistry.ITEMS.getEntries().forEach(regObj -> {
            ResourceLocation itemId = regObj.getId();
            enTranslations.put(
                    "item." + JerrysMod.MODID + "." + itemId.getPath(),
                    generateLocalizedNameFromPath(itemId.getPath())
            );
        });

        enTranslations.put("itemGroup.jerry", "Jerry's Mod");
        enTranslations.put("jerrysmod.advancement.root", "Jerry's Mod");
        enTranslations.put("jerrysmod.advancement.root.desc", "Jerry lives on!");
        enTranslations.put("jerrysmod.advancement.captain_of_light", "Jerry's Fury");
        enTranslations.put("jerrysmod.advancement.captain_of_light.desc", "Use the Captain of Light");
        enTranslations.put("tooltip.jerrysmod.wip", "WORK IN PROGRESS, THIS DOES NOT WORK");

        // Russian translations
        ruTranslations.put("item.jerrysmod.slime_gem", "Слизневый самоцвет");
        ruTranslations.put("item.jerrysmod.jerry_gem", "Самоцвет Джерри");
        ruTranslations.put("item.jerrysmod.slime_chunk", "Слизневый кусок");
        ruTranslations.put("item.jerrysmod.slime_drop", "Слизневая капля");
        ruTranslations.put("item.jerrysmod.slime_head", "Голова слизня");
        ruTranslations.put("item.jerrysmod.slime_shard", "Слизневый осколок");
        ruTranslations.put("item.jerrysmod.slime_helmet", "Слизневый шлем");
        ruTranslations.put("item.jerrysmod.slime_chestplate", "Слизневый нагрудник");
        ruTranslations.put("item.jerrysmod.slime_leggings", "Слизневые поножи");
        ruTranslations.put("item.jerrysmod.slime_boots", "Слизневые ботинки");
        ruTranslations.put("item.jerrysmod.jerry_helmet", "Шлем Джерри");
        ruTranslations.put("item.jerrysmod.jerry_chestplate", "Нагрудник Джерри");
        ruTranslations.put("item.jerrysmod.jerry_leggings", "Поножи Джерри");
        ruTranslations.put("item.jerrysmod.jerry_boots", "Ботинки Джерри");
        ruTranslations.put("item.jerrysmod.jerry_axe", "Топор Джерри");
        ruTranslations.put("item.jerrysmod.jerry_hoe", "Мотыга Джерри");
        ruTranslations.put("item.jerrysmod.jerry_pickaxe", "Кирка Джерри");
        ruTranslations.put("item.jerrysmod.jerry_shovel", "Лопата Джерри");
        ruTranslations.put("item.jerrysmod.jerry_sword", "Меч Джерри");
        ruTranslations.put("item.jerrysmod.slime_axe", "Слизневый топор");
        ruTranslations.put("item.jerrysmod.slime_hoe", "Слизневая мотыга");
        ruTranslations.put("item.jerrysmod.slime_pickaxe", "Слизневая кирка");
        ruTranslations.put("item.jerrysmod.slime_shovel", "Слизневая лопата");
        ruTranslations.put("item.jerrysmod.slime_sword", "Слизневый меч");
        ruTranslations.put("item.jerrysmod.slime_stick", "Слизневая палка");
        ruTranslations.put("item.jerrysmod.captain_of_light", "Громобой");
        ruTranslations.put("item.jerrysmod.olives", "Оливки");
        ruTranslations.put("item.jerrysmod.grapes", "Виноград");

        ruTranslations.put("block.jerrysmod.slime_ore", "Слизневая руда");
        ruTranslations.put("block.jerrysmod.slime_log", "Оливковое бревно");
        ruTranslations.put("block.jerrysmod.slime_log_stripped", "Обтёсанное оливковое бревно");
        ruTranslations.put("block.jerrysmod.slime_leaves", "Оливковая листва");
        ruTranslations.put("block.jerrysmod.slime_sapling", "Оливковый саженец");
        ruTranslations.put("block.jerrysmod.olive_planks", "Оливковые доски");
        ruTranslations.put("block.jerrysmod.olive_stairs", "Оливковые ступеньки");
        ruTranslations.put("block.jerrysmod.olive_button", "Оливковая кнопка");
        ruTranslations.put("block.jerrysmod.olive_slab", "Оливковая плита");
        ruTranslations.put("block.jerrysmod.olive_pressure_plate", "Оливковая нажимная плита");
        ruTranslations.put("block.jerrysmod.olive_fence", "Оливковый забор");
        ruTranslations.put("block.jerrysmod.olive_fence_gate", "Оливковая калитка");
        ruTranslations.put("block.jerrysmod.olive_trap_door", "Оливковый люк");
        ruTranslations.put("block.jerrysmod.olive_door", "Оливковая дверь");
        ruTranslations.put("item.jerrysmod.slime_ore", "Слизневая руда");
        ruTranslations.put("item.jerrysmod.slime_log", "Оливковое бревно");
        ruTranslations.put("item.jerrysmod.slime_log_stripped", "Обтёсанное оливковое бревно");
        ruTranslations.put("item.jerrysmod.slime_leaves", "Оливковая листва");
        ruTranslations.put("item.jerrysmod.slime_sapling", "Оливковый саженец");
        ruTranslations.put("item.jerrysmod.olive_planks", "Оливковые доски");
        ruTranslations.put("item.jerrysmod.olive_stairs", "Оливковые ступеньки");
        ruTranslations.put("item.jerrysmod.olive_button", "Оливковая кнопка");
        ruTranslations.put("item.jerrysmod.olive_slab", "Оливковая плита");
        ruTranslations.put("item.jerrysmod.olive_pressure_plate", "Оливковая нажимная плита");
        ruTranslations.put("item.jerrysmod.olive_fence", "Оливковый забор");
        ruTranslations.put("item.jerrysmod.olive_fence_gate", "Оливковая калитка");
        ruTranslations.put("item.jerrysmod.olive_trap_door", "Оливковый люк");
        ruTranslations.put("item.jerrysmod.olive_door", "Оливковая дверь");

        ruTranslations.put("itemGroup.jerry", "Мод Джерри");
    }

    private void validateTranslations(Map<String, String> translations, String language) {
        getExpectedKeys().forEach(key -> {
            if (!translations.containsKey(key)) {
                System.out.println("Warning: Missing translation for " + key + " in " + language);
            }
        });
    }

    private CompletableFuture<?> saveTranslations(CachedOutput cachedOutput, Map<String, String> translations, String language) {
        JsonObject langJson = new JsonObject();
        translations.forEach(langJson::addProperty);
        Path langPath = getTranslationPath(language);
        return DataProvider.saveStable(cachedOutput, langJson, langPath);
    }

    private Path getTranslationPath(String language) {
        return packOutput.getOutputFolder(PackOutput.Target.RESOURCE_PACK)
                .resolve(JerrysMod.MODID)
                .resolve("lang")
                .resolve(language + ".json");
    }

    private String generateLocalizedNameFromPath(String path) {
        String[] words = path.split("_");
        StringBuilder localizedName = new StringBuilder();
        for (String word : words) {
            localizedName.append(word.substring(0, 1).toUpperCase())
                    .append(word.substring(1).toLowerCase())
                    .append(" ");
        }
        return localizedName.toString().trim();
    }

    private Iterable<String> getExpectedKeys() {
        return enTranslations.keySet();
    }

    @Override
    public String getName() {
        return "Translation generator";
    }
}
