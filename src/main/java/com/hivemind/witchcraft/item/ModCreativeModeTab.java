package com.hivemind.witchcraft.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab Witchcraft_Tab = new CreativeModeTab("witchcraft_tab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.MERCURY.get());
        }
    };
}
