package com.github.detoner.gemsandtreasures.item.material;

import com.github.detoner.gemsandtreasures.settings.CarbonadoSettings;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class ModMaterial {
	public static ToolMaterial carbonadoToolMaterial;
	public static ArmorMaterial carbonadoArmorMaterial;
	
	public static void initMaterials() {
		carbonadoToolMaterial = EnumHelper.addToolMaterial("carbonado", CarbonadoSettings.settings.carbonadoHarvestLevel, CarbonadoSettings.settings.carbonadoMaterialDurability,
				CarbonadoSettings.settings.carbonadoMaterialEfficiency, CarbonadoSettings.settings.carbonadoMaterialDamage, CarbonadoSettings.settings.carbonadoMaterialEnchantability);
		carbonadoArmorMaterial = EnumHelper.addArmorMaterial("carbonado", "gemsandtreasures:carbonado_armor", 50, new int[] {4, 7, 8, 5}, 12, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 3f);
	}
}
