package com.github.detoner.gemsandtreasures.settings;

import com.github.detoner.gemsandtreasures.GemsAndTreasures;
import net.minecraftforge.common.config.Config;
import net.minecraftforge.common.config.Config.Comment;
import net.minecraftforge.common.config.Config.Name;

@Config(modid = GemsAndTreasures.MODID, category = "", name = "GemsAndTreasures/Treasures")
public class TreasuresSettings {
	
	@Name("treasures")
	public static SettingsClass settings = new SettingsClass();
	
	public static class SettingsClass {
		@Name("tigersEyeTreasuresEnabled")
		@Comment("True if the tiger's eye treasures should be available in the game.")
		public boolean tigersEyeTreasuresEnabled = true;

		@Name("scrollOfReturnEnabled")
		@Comment("True if the scroll of return should be available in the game.")
		public boolean scrollOfReturnEnabled = true;

		@Name("bookOfReturnEnabled")
		@Comment("True if the book of return should be available in the game.")
		public boolean bookOfReturnEnabled = true;

		@Name("bookOfReturnMaxUses")
		@Comment("How many uses of the book should have")
		public int bookOfReturnMaxUses = 10;

		@Name("bookOfReturnRepairRecipe")
		@Comment("True if the book of return repair recipe should be available.")
		public boolean bookOfReturnRepairRecipe = true;

		@Name("bookOfReturnRepairCount")
		@Comment("How many uses of the book should be repaired each time")
		public int bookOfReturnRepairCount = 3;

		@Name("bookOfReturnRepairItem")
		@Comment("Which item to be used to repair the book of return, needs to be a valid resource location")
		public String bookOfReturnRepairItem = "gemsandtreasures:scroll_of_return";

		@Name("corruptedScrollEnabled")
		@Comment("True if the corrupted scroll should be available in the game.")
		public boolean corruptedScrollEnabled = true;

		@Name("corruptedBookEnabled")
		@Comment("True if the corrupted book should be available in the game.")
		public boolean corruptedBookEnabled = true;

		@Name("corruptedBookMaxUses")
		@Comment("How many uses of the book should have")
		public int corruptedBookMaxUses = 10;

		@Name("corruptedBookRepairRecipe")
		@Comment("True if the corrupted book repair recipe should be available.")
		public boolean corruptedBookRepairRecipe = true;

		@Name("corruptedBookRepairCount")
		@Comment("How many uses of the book should be repaired each time")
		public int corruptedBookRepairCount = 3;

		@Name("corruptedBookRepairItem")
		@Comment("Which item to be used to repair the book, needs to be a valid resource location")
		public String corruptedBookRepairItem = "gemsandtreasures:corrupted_scroll";

		@Name("netherEscapeScrollEnabled")
		@Comment("True if the nether escape scroll should be available in the game.")
		public boolean netherEscapeScrollEnabled = true;

		@Name("netherEscapeBookEnabled")
		@Comment("True if the nether escape book should be available in the game.")
		public boolean netherEscapeBookEnabled = true;

		@Name("netherEscapeBookMaxUses")
		@Comment("How many uses of the book should have")
		public int netherEscapeBookMaxUses = 10;

		@Name("netherEscapeBookRepairRecipe")
		@Comment("True if the nether escape book repair recipe should be available.")
		public boolean netherEscapeBookRepairRecipe = true;

		@Name("netherEscapeBookRepairCount")
		@Comment("How many uses of the book should be repaired each time")
		public int netherEscapeBookRepairCount = 3;

		@Name("netherEscapeBookRepairItem")
		@Comment("Which item to be used to repair the book, needs to be a valid resource location")
		public String netherEscapeBookRepairItem = "gemsandtreasures:nether_escape_scroll";

		@Name("escapeScrollEnabled")
		@Comment("True if the escape scroll should be available in the game.")
		public boolean escapeScrollEnabled = true;

		@Name("escapeBookEnabled")
		@Comment("True if the escape book should be available in the game.")
		public boolean escapeBookEnabled = true;

		@Name("escapeBookMaxUses")
		@Comment("How many uses of the book should have")
		public int escapeBookMaxUses = 10;

		@Name("escapeBookRepairRecipe")
		@Comment("True if the escape book repair recipe should be available.")
		public boolean escapeBookRepairRecipe = true;

		@Name("escapeBookRepairCount")
		@Comment("How many uses of the book should be repaired each time")
		public int escapeBookRepairCount = 3;

		@Name("escapeBookRepairItem")
		@Comment("Which item to be used to repair the book, needs to be a valid resource location")
		public String escapeBookRepairItem = "gemsandtreasures:escape_scroll";
	}
}
