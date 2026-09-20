package nicusha.jerrysmod.data;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import net.minecraft.data.PackOutput;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.common.data.LanguageProvider;
import nicusha.jerrysmod.JerrysMod;
import nicusha.jerrysmod.registry.BlockRegistry;
import nicusha.jerrysmod.registry.ItemRegistry;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class ModLangProvider extends LanguageProvider {
    protected final String locale;
    private final Map<String, String> existingTranslations = new HashMap<>();
    private static final Gson GSON = new Gson();

    public ModLangProvider(PackOutput output, String locale) {
        super(output, JerrysMod.MODID, locale);
        this.locale = locale;
        loadExistingTranslations(output);
    }

    @Override
    protected void addTranslations() {
        addAuto(BlockRegistry.deepslate_slime_ore, "Deepslate Slime Ore");
        addAuto(BlockRegistry.slime_ore, "Slime Ore");
        addAuto(BlockRegistry.deepslate_slime_ore.asItem(), "Deepslate Slime Ore");
        addAuto(BlockRegistry.slime_ore.asItem(), "Slime Ore");
        addAuto(ItemRegistry.captain_of_light, "Captain Of Light");
        addAuto(ItemRegistry.jerry_axe, "Jerry Axe");
        addAuto(ItemRegistry.jerry_boots, "Jerry Boots");
        addAuto(ItemRegistry.jerry_chestplate, "Jerry Chestplate");
        addAuto(ItemRegistry.jerry_gem, "Jerry Gem");
        addAuto(ItemRegistry.jerry_helmet, "Jerry Helmet");
        addAuto(ItemRegistry.jerry_hoe, "Jerry Hoe");
        addAuto(ItemRegistry.jerry_leggings, "Jerry Leggings");
        addAuto(ItemRegistry.jerry_pickaxe, "Jerry Pickaxe");
        addAuto(ItemRegistry.jerry_shovel, "Jerry Shovel");
        addAuto(ItemRegistry.jerry_sword, "Jerry Sword");
        addAuto(ItemRegistry.slime_axe, "Slime Axe");
        addAuto(ItemRegistry.slime_boots, "Slime Boots");
        addAuto(ItemRegistry.slime_chestplate, "Slime Chestplate");
        addAuto(ItemRegistry.slime_gem, "Slime Gem");
        addAuto(ItemRegistry.slime_helmet, "Slime Helmet");
        addAuto(ItemRegistry.slime_hoe, "Slime Hoe");
        addAuto(ItemRegistry.slime_leggings, "Slime Leggings");
        addAuto(ItemRegistry.slime_pickaxe, "Slime Pickaxe");
        addAuto(ItemRegistry.slime_shard, "Slime Shard");
        addAuto(ItemRegistry.slime_shovel, "Slime Shovel");
        addAuto(ItemRegistry.slime_sword, "Slime Sword");
        addAuto("itemGroup.jerry", "Jerry's Mod");
        addAuto("jerrysmod.advancement.captain_of_light", "Jerry's Fury");
        addAuto("jerrysmod.advancement.captain_of_light.desc", "Use the Captain of Light");
        addAuto("jerrysmod.advancement.root", "Jerry's Mod");
        addAuto("jerrysmod.advancement.root.desc", "Jerry lives on!");
        addAuto("tooltip.jerrysmod.wip", "WORK IN PROGRESS, THIS DOES NOT WORK");
    }

    private void addAuto(Object key, String englishValue) {
        String translationKey = getTranslationKey(key);
        if (translationKey == null) return;
        if (existingTranslations.containsKey(translationKey)) {
            add(translationKey, existingTranslations.get(translationKey));
            return;
        }
        String targetText = englishValue;
        if (!locale.equals("en_us")) {
            String langCode = locale.split("_")[0];
            targetText = translate(langCode, englishValue);
        }
        add(translationKey, targetText);
    }

    private String getTranslationKey(Object key) {
        if (key instanceof Supplier<?> s) {
            Object val = s.get();
            if (val instanceof Block b) return b.getDescriptionId();
            if (val instanceof Item i) return i.getDescriptionId();
            if (val instanceof EntityType<?> e) return e.getDescriptionId();
        } else {
            if (key instanceof Block b) return b.getDescriptionId();
            if (key instanceof Item i) return i.getDescriptionId();
            if (key instanceof EntityType<?> e) return e.getDescriptionId();
            if (key instanceof String s) return s;
        }
        return null;
    }

    private void loadExistingTranslations(PackOutput output) {
        try {
            Path path = output.getOutputFolder()
                    .resolve("assets")
                    .resolve(JerrysMod.MODID)
                    .resolve("lang")
                    .resolve(locale + ".json");

            if (Files.exists(path)) {
                try (Reader reader = Files.newBufferedReader(path)) {
                    JsonObject json = GSON.fromJson(reader, JsonObject.class);
                    if (json != null) {
                        json.entrySet().forEach(entry ->
                                existingTranslations.put(entry.getKey(), entry.getValue().getAsString())
                        );
                    }
                }
            }
        } catch (Exception e) {
            System.out.printf("Could not load existing translations for {}: {}", locale, e.getMessage());
        }
    }

    @Override
    public String getName() {
        return "Languages: " + JerrysMod.MODID + " (" + locale + ")";
    }

    public static String translate(String langTo, String text) {
        try {
            String urlStr = "https://translate.googleapis.com/translate_a/single?client=gtx&sl=en&tl=" + langTo + "&dt=t&q=" + URLEncoder.encode(text, StandardCharsets.UTF_8);
            URL url = new URL(urlStr);
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setRequestProperty("User-Agent", "Mozilla/5.0");
            BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream(), StandardCharsets.UTF_8));
            String inputLine;
            StringBuilder response = new StringBuilder();
            while ((inputLine = in.readLine()) != null) response.append(inputLine);
            in.close();
            String result = response.toString();
            return result.substring(4, result.indexOf("\"", 4));
        } catch (Exception e) {
            return text;
        }
    }
}
