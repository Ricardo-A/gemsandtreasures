package com.github.detoner.gemsandtreasures.handler.registration;

import java.util.ArrayList;
import java.util.List;

import com.github.detoner.gemsandtreasures.block.base.ItemBlockBase;
import com.github.detoner.gemsandtreasures.item.ItemBase;
import com.github.detoner.gemsandtreasures.settings.GemsSettings;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class AgateRegistration extends BaseRegistration{

    /*
     * Items
     */
    public static ItemBase agate;

    public void init() {
        if (GemsSettings.settings.agateEnabled) {
            agate = new ItemBase("agate");
            items.add(agate);
        }
    }
}
