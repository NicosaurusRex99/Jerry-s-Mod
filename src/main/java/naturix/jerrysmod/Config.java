package naturix.jerrysmod;

import naturix.jerrysmod.proxy.CommonProxy;
import net.minecraftforge.common.config.Configuration;

public class Config {
	private static final String CATEGORY_GENERAL = "general";
	private static final String CATEGORY_ORE = "Ore Gen";
	public static int slimeVeinSize;
    public static int slimeMax;
    public static int slimeMin;
    public static int slimeSpawnTries;
	public static int dimensionId;
	public static int maxDimensionHeight;
	public static int waterHeight;
	public static int saplingDrop;
	public static int slimeBiomeID;
	public static boolean slimeBiomePos;
	public static int treeChances;
	public static int OLIVE_GEN_CHANCE;
	public static int TreeHeight;
	public static int SlimeBiomeWeight;

	
	public static void readConfig() {
        Configuration cfg = CommonProxy.config;
        try {
            cfg.load();
            initGeneralConfig(cfg);
        } catch (Exception e1) {
            JerrysMod.logger.info("Problem loading config file!");
        } finally {
            if (cfg.hasChanged()) {
                cfg.save();
            }
        }
    }
	 private static void initGeneralConfig(Configuration cfg) {
	        cfg.addCustomCategoryComment(CATEGORY_GENERAL, "General configuration");
	        cfg.addCustomCategoryComment(CATEGORY_ORE, "Generation of ore");
	        slimeVeinSize = cfg.getInt("slimeVeinSize", CATEGORY_ORE, 2, 1, 1000, "Choose a number between 1 and 1000 to change the size of slime ore veins");
	        slimeMin = cfg.getInt("slimeMin", CATEGORY_ORE, 1, 1, 255, "Choose a number between 1 and 255 to choose the min slime ore height");
	        slimeMax = cfg.getInt("slimeMax", CATEGORY_ORE, 15, 1, 256, "Choose a number between 1 and 256 to choose the max slime ore height");
	        slimeSpawnTries = cfg.getInt("slimeSpawnTries", CATEGORY_ORE, 1, 1, 100, "Choose a number between 1 and 100 to change how often you see slime ore");
	        dimensionId = cfg.getInt("dimensionId", CATEGORY_GENERAL, 502, -10000, 10000, "Slime Dimension ID");
	        maxDimensionHeight = cfg.getInt("maxDimensionHeight", CATEGORY_GENERAL, 63, 0, 512, "Max build height in the Slime Dimension");
	        waterHeight = cfg.getInt("waterHeight", CATEGORY_GENERAL, 63, 0, Config.maxDimensionHeight, "Height of natural water level");
	        saplingDrop = cfg.getInt("saplingDrop", CATEGORY_GENERAL, 20, 0, 100, "Chance of a sapling dropping");
	        slimeBiomeID = cfg.getInt("slimeBiomeID", CATEGORY_GENERAL, 500, -4000, 4000, "Slime Biome ID");
	        slimeBiomePos = cfg.getBoolean("slimeBiomePos", CATEGORY_GENERAL, false, "set to true to see where the biome is");
	        treeChances = cfg.getInt("treeChances", CATEGORY_GENERAL, 12, -4000, 4000, "how frequent trees spawn");
	        OLIVE_GEN_CHANCE = cfg.getInt("OliveGenChance", CATEGORY_GENERAL, 80, 1, 100, "Generation of olive trees");
	        TreeHeight = cfg.getInt("OliveHeight", CATEGORY_GENERAL, 5, 1, 256, "Height of olive trees");
	        SlimeBiomeWeight = cfg.getInt("WeightOfSlimeBiome", CATEGORY_GENERAL, 3, 1, 256, "Changes how frequent slime biomes spawn");
	        
	 
	 }
}
