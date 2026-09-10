package com.github.detoner.gemsandtreasures.settings;

import com.github.detoner.gemsandtreasures.GemsAndTreasures;

import net.minecraftforge.common.config.Config;
import net.minecraftforge.common.config.Config.Comment;
import net.minecraftforge.common.config.Config.Name;

@Config(modid = GemsAndTreasures.MODID, category = "", name = "GemsAndTreasures/Gems/Ruby")
public class RubySettings {

    @Name("ruby")
    public static BasicSettingsClass settings = new BasicSettingsClass();

    public static class BasicSettingsClass {

        @Name("rubyCarpetEnabled")
        @Comment("True if ruby carpet should be enabled")
        public boolean rubyCarpetEnabled = true;
    }
}
