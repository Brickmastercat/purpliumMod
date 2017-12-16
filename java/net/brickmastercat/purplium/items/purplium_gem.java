package net.brickmastercat.purplium.items;

import net.brickmastercat.purplium.purplium;
import net.brickmastercat.purplium.lib.names;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.world.World;

public class purplium_gem extends Item {
	
	public purplium_gem() {
		this.setCreativeTab(purplium.CREATIVE_TAB);
	}
	
	@Override
	public String getUnlocalizedName(ItemStack stack) {
		return "item." + purplium.RESOURCE_PREFIX + names.purplium_gem; // item.purplium:purplium_gem.name
	}
	
	@Override
	public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn)
    {
		playerIn.sendMessage(new TextComponentString("This is a purplium gem!"));
        return super.onItemRightClick(worldIn, playerIn, handIn);
    }
	
	

}
