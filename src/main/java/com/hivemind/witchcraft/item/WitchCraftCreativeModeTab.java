package com.hivemind.witchcraft.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class WitchCraftCreativeModeTab {
    public static final CreativeModeTab WITCHCRAFT_TAB = new CreativeModeTab(CreativeModeTab.TABS.length, "witchcraft_tab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.MERCURY.get());
        }
    };
}
