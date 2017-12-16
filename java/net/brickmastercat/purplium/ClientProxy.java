package net.brickmastercat.purplium;

import net.brickmastercat.purplium.init.purpliumItems;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;


public class ClientProxy extends CommonProxy {
	
	@Override// Do what common does and everything client needs to know
	public void preInit(FMLPreInitializationEvent event){
		
		super.preInit(event);
		
	}
	
	@Override
	public void init(FMLInitializationEvent event){
		
		super.init(event);
		
		
		//purpliumItems(Minecraft.getMinecraft().getRenderItem().getItemModelMesher());
	}
	
	@Override
	public void postInit(FMLPostInitializationEvent event){
		
		super.postInit(event);
	}

}
