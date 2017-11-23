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
package naturix.jerrysmod.items;

import naturix.jerrysmod.JerrysMod;
import naturix.jerrysmod.blocks.JMPortal;
import naturix.jerrysmod.helpers.JerryHelpers;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.oredict.OreDictionary;

public class Phone extends Item {

	public Phone() {
		super();
		setRegistryName("phone");
        setUnlocalizedName(JerrysMod.MODID + ".phone");
		setCreativeTab(JerrysMod.JerrysMod);
		setMaxStackSize(1);
	}

	
	public void initOreDict() {
		OreDictionary.registerOre("phone", this);
	}
	@SideOnly(Side.CLIENT)
    public void initModel() {
        ModelLoader.setCustomModelResourceLocation(this, 0, new ModelResourceLocation(getRegistryName(), "inventory"));
	}
	@Override
	public EnumActionResult onItemUse(EntityPlayer par2EntityPlayer, World par3World, BlockPos pos, EnumHand hand, EnumFacing side, float par8,
			float par9, float par10) {

		ItemStack par1ItemStack = par2EntityPlayer.getHeldItem(hand);

		int par4 = pos.getX();
		int par5 = pos.getY();
		int par6 = pos.getZ();

		int par7 = side.getIndex();

		if (par7 == 0) {
			par5--;
		}
		if (par7 == 1) {
			par5++;
		}
		if (par7 == 2) {
			par6--;
		}
		if (par7 == 3) {
			par6++;
		}
		if (par7 == 4) {
			par4--;
		}
		if (par7 == 5) {
			par4++;
		}
		if (!par2EntityPlayer.canPlayerEdit(new BlockPos(par4, par5, par6), side, par1ItemStack)) {
			return EnumActionResult.FAIL;
		}
		Block i1 = JMPortal.getBlock(par3World, par4, par5, par6);
		if (i1 == Blocks.AIR) {
			par3World.playSound(par2EntityPlayer, new BlockPos(par4, par5, par6), SoundEvents.ITEM_FLINTANDSTEEL_USE, SoundCategory.BLOCKS, 1.0F,
					itemRand.nextFloat() * 0.4F + 0.8F);
			JerryHelpers.tryToCreatePortal(par3World, par4, par5, par6);
		}
		par1ItemStack.damageItem(1, par2EntityPlayer);
		return EnumActionResult.SUCCESS;
	}
}
	