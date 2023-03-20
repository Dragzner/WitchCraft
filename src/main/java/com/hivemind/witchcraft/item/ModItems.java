package com.hivemind.witchcraft.item;

import com.hivemind.witchcraft.item.WitchCraftCreativeModeTab;
import com.hivemind.witchcraft.Witchcraft;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Witchcraft.MOD_ID);
    public static final RegistryObject<Item> MERCURY = ITEMS.register("mercury",
            () -> new Item(new Item.Properties().tab(WitchCraftCreativeModeTab.WITCHCRAFT_TAB)) {
                // Additional item properties and methods can be added here
            });

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
