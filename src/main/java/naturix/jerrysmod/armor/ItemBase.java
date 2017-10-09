package naturix.jerrysmod.armor;

import java.util.ArrayList;
import java.util.List;

import naturix.jerrysmod.JerrysMod;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

public class ItemBase extends Item
{
	public static List<Item> JerrysItemList = new ArrayList<>(30);
	
	public ItemBase(String name)
	{
		registerItem(name, this);
		
	}

	public static void registerItem(String name, Item item)
	{
		item.setRegistryName(name);
		item.setCreativeTab(JerrysMod.JerrysMod);
		item.setUnlocalizedName(name);
		item.setMaxStackSize(1);

		ForgeRegistries.ITEMS.register(item);
		
		JerrysItemList.add(item);
	}
}