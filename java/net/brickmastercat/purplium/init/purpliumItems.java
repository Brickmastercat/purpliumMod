package net.brickmastercat.purplium.init;

import java.util.List;

import com.google.common.collect.Lists;

import net.brickmastercat.purplium.purplium;
import net.brickmastercat.purplium.items.purplium_gem;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.registries.IForgeRegistry;

@GameRegistry.ObjectHolder(purplium.MOD_ID)
@EventBusSubscriber(modid = purplium.MOD_ID)
public class purpliumItems {
	
	private static List<Item> items = Lists.newArrayList();
	
	@GameRegistry.ObjectHolder("purplium_gem")
	public static final Item purplium_gem = Items.AIR;
	
	@SubscribeEvent
	public static void registerItems(RegistryEvent.Register<Item> event) {
		IForgeRegistry<Item> reg = event.getRegistry();
		
		register(reg, new purplium_gem().setRegistryName("purplium_gem"));
	}
	
	public static void register(IForgeRegistry<Item> reg, Item item) {
		items.add(item);
		reg.register(item);
	}
	
	@SubscribeEvent
	@SideOnly(Side.CLIENT)
	public static void registerModels(ModelRegistryEvent event) {
		for(Item item : items)
			if (item.getRegistryName() != null)
				ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
	}
	
}
