package com.github.detoner.gemsandtreasures.handler.registration;

import com.github.detoner.gemsandtreasures.block.carpets.BlockCrystalCarpet;
import com.github.detoner.gemsandtreasures.block.carpets.BlockRubyCarpet;
import com.github.detoner.gemsandtreasures.block.carpets.BlockTigersEyeCarpet;

public class CarpetRegistration extends BaseRegistration {

    /*
     * Blocks
     */

    public void init() {
        blocks.add(new BlockCrystalCarpet("crystal_carpet"));
        blocks.add(new BlockTigersEyeCarpet("tigers_eye_carpet"));
        blocks.add(new BlockRubyCarpet("ruby_carpet"));
    }
}