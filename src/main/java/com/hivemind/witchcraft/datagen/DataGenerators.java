/*
 * SPDX-FileCopyrightText: 2022 klikli-dev
 *
 * SPDX-License-Identifier: MIT
 */

package com.hivemind.witchcraft.datagen;

import com.hivemind.witchcraft.Witchcraft;
import com.hivemind.witchcraft.datagen.lang.EnUsProvider;
import com.klikli_dev.modonomicon.Modonomicon;
import net.minecraft.data.DataGenerator;
import net.minecraft.world.entity.monster.Witch;
import net.minecraftforge.data.event.GatherDataEvent;

public class DataGenerators {

    public static void gatherData(GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();

        var lang =  new EnUsProvider(generator, Witchcraft.MOD_ID);
        generator.addProvider(event.includeServer(), new DemoBookProvider(generator, Witchcraft.MOD_ID, lang));
        //Important: Lang provider needs to be added after the book provider to process the texts added by the book provider
        generator.addProvider(event.includeClient(), lang);
    }
}