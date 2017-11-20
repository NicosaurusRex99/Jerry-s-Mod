/*
    Jerry's Mod - A Minecraft Mod
    Copyright (C) 2016-2017 Hawaii_Beach
    This program Is free software: you can redistribute it And/Or modify
    it under the terms Of the GNU General Public License As published by
    the Free Software Foundation, either version 3 Of the License, Or
    (at your option) any later version.
    This program Is distributed In the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty Of
    MERCHANTABILITY Or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License For more details.
    You should have received a copy Of the GNU General Public License
    along with this program.  If Not, see <http://www.gnu.org/licenses/>.
    */
package naturix.jerrysmod.registries;

import naturix.jerrysmod.blocks.OliveLeaves;
import naturix.jerrysmod.blocks.OliveLog;
import naturix.jerrysmod.blocks.OlivePlanks;
import naturix.jerrysmod.blocks.OliveSapling;
import naturix.jerrysmod.blocks.SlimeGrass;
import naturix.jerrysmod.blocks.SlimeOre;
import naturix.jerrysmod.blocks.SlimeStone;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ModBlocks {

	@GameRegistry.ObjectHolder("jerrysmod:slimeore")
    public static SlimeOre slimeore;
	@GameRegistry.ObjectHolder("jerrysmod:olivelog")
	public static OliveLog olivelog;
	@GameRegistry.ObjectHolder("jerrysmod:oliveleaves")
	public static OliveLeaves oliveleaves;
	@GameRegistry.ObjectHolder("jerrysmod:oliveplanks")
	public static OlivePlanks oliveplanks;
	@GameRegistry.ObjectHolder("jerrysmod:slimestone")
	public static SlimeStone slimestone;
	@GameRegistry.ObjectHolder("jerrysmod:slimegrass")
	public static SlimeGrass slimegrass;
	@GameRegistry.ObjectHolder("jerrysmod:olivesapling")
	public static OliveSapling olivesapling; 
	
	@SideOnly(Side.CLIENT)
    public static void initModels() {
        slimeore.initModel();
        olivelog.initModel();
        oliveleaves.initModel();
        oliveplanks.initModel();
        slimestone.initModel();
        slimegrass.initModel();
        olivesapling.initModel();
} 
	public static void initOreDict() {
		slimegrass.initOreDict();
		slimestone.initOreDict();
		oliveplanks.initOreDict();
		olivelog.initOreDict();
	}


}