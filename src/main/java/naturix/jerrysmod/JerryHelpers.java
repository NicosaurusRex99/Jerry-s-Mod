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
package naturix.jerrysmod;

import naturix.jerrysmod.blocks.JMPortal;
import net.minecraft.block.Block;
import net.minecraft.block.BlockPortal;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class JerryHelpers {
	public static Block getBlock(IBlockAccess world, int i, int j, int k) {
		return world.getBlockState(new BlockPos(i, j, k)).getBlock();
	}

	public static boolean tryToCreatePortal(World par1World, int par2, int par3, int par4) {
		byte b0 = 0;
		byte b1 = 0;
		if (getBlock(par1World, par2 - 1, par3, par4) == Blocks.SLIME_BLOCK || getBlock(par1World, par2 + 1, par3, par4) == Blocks.SLIME_BLOCK) {
			b0 = 1;
		}
		if (getBlock(par1World, par2, par3, par4 - 1) == Blocks.SLIME_BLOCK || getBlock(par1World, par2, par3, par4 + 1) == Blocks.SLIME_BLOCK) {
			b1 = 1;
		}
		if (b0 == b1) {
			return false;
		} else {
			if (getBlock(par1World, par2 - b0, par3, par4 - b1) == Blocks.AIR) {
				par2 -= b0;
				par4 -= b1;
			}
			int l;
			int i1;
			for (l = -1; l <= 2; ++l) {
				for (i1 = -1; i1 <= 3; ++i1) {
					boolean flag = l == -1 || l == 2 || i1 == -1 || i1 == 3;
					if (l != -1 && l != 2 || i1 != -1 && i1 != 3) {
						Block j1 = getBlock(par1World, par2 + b0 * l, par3 + i1, par4 + b1 * l);
						if (flag) {
							if (j1 != Blocks.SLIME_BLOCK) {
								return false;
							}
						}
						/*
						 * else if (j1 != 0 && j1 !=
						 * Main.TutorialFire.blockID) { return false; }
						 */
					}
				}
			}
			for (l = 0; l < 2; ++l) {
				for (i1 = 0; i1 < 3; ++i1) {
					IBlockState iblockstate = JMPortal.portal.getDefaultState().withProperty(BlockPortal.AXIS,
							b0 == 0 ? EnumFacing.Axis.Z : EnumFacing.Axis.X);
					par1World.setBlockState(new BlockPos(par2 + b0 * l, par3 + i1, par4 + b1 * l), iblockstate, 3);
				}
			}
			return true;
		}
	}
	
}
