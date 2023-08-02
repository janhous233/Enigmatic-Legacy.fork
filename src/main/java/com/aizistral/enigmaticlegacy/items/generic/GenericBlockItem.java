package com.aizistral.enigmaticlegacy.items.generic;

import org.jetbrains.annotations.Nullable;

import com.aizistral.enigmaticlegacy.EnigmaticLegacy;
import com.aizistral.enigmaticlegacy.api.items.ICreativeTabMember;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.level.block.Block;

public class GenericBlockItem extends BlockItem implements ICreativeTabMember {
	private final CreativeModeTab tab;

	public GenericBlockItem(Block blockIn) {
		this(blockIn, GenericBlockItem.getDefaultProperties());
	}

	public GenericBlockItem(Block blockIn, Properties props) {
		this(blockIn, props, EnigmaticLegacy.MAIN_TAB);
	}

	public GenericBlockItem(Block blockIn, Properties props, @Nullable CreativeModeTab tab) {
		super(blockIn, props);
		this.tab = tab;
	}

	@Override
	public CreativeModeTab getCreativeTab() {
		return this.tab;
	}

	public static Properties getDefaultProperties() {
		Properties props = new Item.Properties();

		props.stacksTo(64);
		props.rarity(Rarity.COMMON);

		return props;
	}

}