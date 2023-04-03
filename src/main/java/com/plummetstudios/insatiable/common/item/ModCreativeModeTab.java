package com.plummetstudios.insatiable.common.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab INSATIABLE_TAB = new CreativeModeTab("insatiable_tab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.RAW_GAME_MEAT.get());
        }
    };
}
