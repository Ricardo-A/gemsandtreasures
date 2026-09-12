package com.github.detoner.gemsandtreasures.settings;

import com.github.detoner.gemsandtreasures.GemsAndTreasures;
import net.minecraftforge.common.config.Config;
import net.minecraftforge.common.config.Config.Comment;
import net.minecraftforge.common.config.Config.Name;

@Config(modid = GemsAndTreasures.MODID, category = "", name = "GemsAndTreasures/Gems/TigersEye")
public class TigersEyeSettings {
	
	@Name("tigersEye")
	public static BasicSettingsClass settings = new BasicSettingsClass();
	
	public static class BasicSettingsClass {
		@Name("stoneTigersEyeEnabled")
		@Comment("True if tigers eye should generate on stone")
		public boolean stoneTigersEyeEnabled = true;
		
		@Name("sandTigersEyeEnabled")
		@Comment("True if tigers eye should generate on sand")
		public boolean sandTigersEyeEnabled = true;

		@Name("shardTigersEyeEnabled")
		@Comment("True if ores that drop tigers eye dust and shards should generate on sand")
		public boolean shardTigersEyeEnabled = true;

		@Name("stoneTigersEyeWeight")
		@Comment("Sets how frequent you can find Tiger's eye in the world (only for stone variation), higher numbers means more frequent.")
		public int stoneTigersEyeWeight = 20;

		@Name("sandTigersEyeWeight")
		@Comment("Sets how frequent you can find Tiger's eye in the sand, higher numbers means more frequent.")
		public int sandTigersEyeWeight = 30;

		@Name("shardTigersEyeWeight")
		@Comment("Sets how frequent you can find Tiger's eye shard ore in the sand, higher numbers means more frequent.")
		public int shardTigersEyeWeight = 60;

		@Name("stoneTigersEyeVeinSize")
		@Comment("Sets how many ores you can find clumped together on stone.")
		public int stoneTigersEyeVeinSize = 2;

		@Name("sandTigersEyeVeinSize")
		@Comment("Sets how many ores you can find clumped together on sand.")
		public int sandTigersEyeVeinSize = 2;

		@Name("shardTigersEyeVeinSize")
		@Comment("Sets how many shard ores you can find clumped together.")
		public int shardTigersEyeVeinSize = 3;

		@Name("stoneTigersEyeMinHeight")
		@Comment("Sets how low in the world the ore can be generated")
		public int stoneTigersEyeMinHeight = 0;

		@Name("stoneTigersEyeMaxHeight")
		@Comment("Sets how high in the world the ore can be generated")
		public int stoneTigersEyeMaxHeight = 150;

		@Name("sandTigersEyeMinHeight")
		@Comment("Sets how low in the world the ore can be generated")
		public int sandTigersEyeMinHeight = 0;

		@Name("sandTigersEyeMaxHeight")
		@Comment("Sets how high in the world the ore can be generated")
		public int sandTigersEyeMaxHeight = 150;

		@Name("shardTigersEyeMinHeight")
		@Comment("Sets how low in the world the ore can be generated")
		public int shardTigersEyeMinHeight = 0;

		@Name("shardTigersEyeMaxHeight")
		@Comment("Sets how high in the world the ore can be generated")
		public int shardTigersEyeMaxHeight = 150;
	}
}