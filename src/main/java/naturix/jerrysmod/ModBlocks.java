package naturix.jerrysmod;

import naturix.jerrysmod.blocks.OliveLeaves;
import naturix.jerrysmod.blocks.OliveLog;
import naturix.jerrysmod.blocks.OlivePlanks;
import naturix.jerrysmod.blocks.OliveSapling;
import naturix.jerrysmod.blocks.SlimeOre;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ModBlocks {

	@GameRegistry.ObjectHolder("jerrysmod:slimeore")
    public static SlimeOre slimeore;
	@GameRegistry.ObjectHolder("jerrysmod:olivelog")
	public static OliveLog olivelog;
	@GameRegistry.ObjectHolder("jerrysmod:olivesapling")
	public static OliveSapling olivesapling;
	@GameRegistry.ObjectHolder("jerrysmod:oliveleaves")
	public static OliveLeaves oliveleaves;
	@GameRegistry.ObjectHolder("jerrysmod:oliveplanks")
	public static OlivePlanks oliveplanks;
	
	@SideOnly(Side.CLIENT)
    public static void initModels() {
        slimeore.initModel();
        olivelog.initModel();
        olivesapling.initModel();
        oliveleaves.initModel();
        oliveplanks.initModel();
}


}