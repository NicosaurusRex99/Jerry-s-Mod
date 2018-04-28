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

import naturix.jerrysmod.Config;
import naturix.jerrysmod.JerrysMod;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.command.CommandResultStats;
import net.minecraft.entity.Entity;
import net.minecraft.entity.effect.EntityLightningBolt;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.World;
import net.minecraft.world.WorldServer;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class CaptainOfLight extends Item {
	private BlockPos blockPos;
	private EntityPlayer player;
    public CaptainOfLight() {
        setRegistryName("captainoflight");        // The unique name (within your mod) that identifies this item
        setUnlocalizedName(JerrysMod.MODID + ".captainoflight");     // Used for localization (en_US.lang)
        setCreativeTab(JerrysMod.JerrysMod);
        setMaxStackSize(1);
    }

    @SideOnly(Side.CLIENT)
    public void initModel() {
        ModelLoader.setCustomModelResourceLocation(this, 0, new ModelResourceLocation(getRegistryName(), "inventory"));
    }
    
    @Override
	public ActionResult<ItemStack> onItemRightClick(World world, EntityPlayer entity, EnumHand hand) {
		float var4 = 1.0F;
		ActionResult<ItemStack> ar = super.onItemRightClick(world, entity, hand);
		
		RayTraceResult pos = entity.rayTrace(100, 20);

			double i = pos.getBlockPos().getX();
			double j = pos.getBlockPos().getY();
			double k = pos.getBlockPos().getZ();

		
		
		if (true) {
			world.spawnEntity(new EntityLightningBolt(world, i, j, k, false));
			if(Config.colDayTime == true) {
				if (world.isDaytime() == false) {
					world.setWorldTime(((world.getWorldTime() / 24000) * 24000 + 1000));
				}
				}
		}

		return ar;
	}
}