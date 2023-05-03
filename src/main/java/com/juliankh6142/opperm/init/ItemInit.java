package com.juliankh6142.opperm.init;

import com.google.common.base.Supplier;
import com.juliankh6142.opperm.OpPermission;
import com.juliankh6142.opperm.item.OpPermItem;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ItemInit {
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, OpPermission.MOD_ID);
	
	public static final RegistryObject<Item> OPPERM_ITEM = register("opperm_item", () -> new OpPermItem(new Item.Properties().tab(OpPermission.OPPERM_TAB).stacksTo(1).rarity(Rarity.EPIC).fireResistant()));
	
	private static <T extends Item> RegistryObject<T> register(final String name, final Supplier<T> item) {
		return ITEMS.register(name, item);
	}
}
