package naturix.jerrysmod.blocks;

import java.util.Random;

import naturix.jerrysmod.JerrysMod;
import naturix.jerrysmod.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.entity.Entity;
import net.minecraft.item.Item;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.Explosion;
import net.minecraft.world.World;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class OliveLeaves extends Block {


	public OliveLeaves(Material materialIn) {
		super(Material.LEAVES);
        setUnlocalizedName(JerrysMod.MODID + ".oliveleaves");
        setRegistryName("oliveleaves");
        setCreativeTab(JerrysMod.JerrysMod);
        setHardness(0.3f);
		setResistance(1f);
	}
	@SideOnly(Side.CLIENT)
    public void initModel() {
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(this), 0, new ModelResourceLocation(getRegistryName(), "inventory"));
    }
	public Object get() {
		// TODO Auto-generated method stub
		return null;
	}
	public boolean canSilkHarvest(IBlockState state) {
		return true;
	}
	public boolean canDropFromExplosion(Explosion explosionIn)
    {
        return true;
    }
	public void onLanded(World worldIn, Entity entityIn)
    {
        entityIn.motionY = 2.0D;
    }
	public void onFallenUpon(World worldIn, BlockPos pos, Entity entityIn, float fallDistance)
    {
        entityIn.fall(fallDistance, 0.0F);
    }
	public Item getItemDropped(IBlockState state, Random rand, int fortune)
    {
        return ModBlocks.olivesapling(this);
    }

}