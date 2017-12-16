package net.brickmastercat.purplium;

import java.util.Random;

import net.brickmastercat.purplium.init.purpliumItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;


@Mod(modid = purplium.MOD_ID, name = purplium.MOD_NAME, version = purplium.VERSION, dependencies = purplium.DEPENDENCIES)
public class purplium {
	
	// Constants
	public static final String MOD_ID = "purplium";
	public static final String MOD_NAME = "Purplium Resource Mod";
	public static final String VERSION = "0.0";
	public static final String DEPENDENCIES = "required-after:forge@[14.23.1.2555,)";
	public static final String RESOURCE_PREFIX = MOD_ID + ":"; // purplium:
	public static final CreativeTabs CREATIVE_TAB = new CreativeTabs("purpliumCreativeTab") {
		@Override
		public ItemStack getTabIconItem() {
			return new ItemStack(purpliumItems.purplium_gem);
		}
	};
	
	// Local Variables
	public static Random random = new Random();
	
	@Instance(MOD_ID)
	public static purplium instance;
	
	@SidedProxy(clientSide = "net.brickmastercat.purplium.ClientProxy", serverSide = "net.brickmastercat.purplium.CommonProxy")
	public static CommonProxy proxy;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event){
		
		proxy.preInit(event);
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event){
		
		proxy.init(event);
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event){
		
		proxy.postInit(event);
	}
	
}
