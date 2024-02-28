package net.detoner.gemsandtreasures.util;

import com.google.common.base.Objects;

import net.minecraft.util.ResourceLocation;

public class MetadataCustom {
	private final ResourceLocation id;
	private final int meta;

	public MetadataCustom(ResourceLocation id, int meta) {
		this.id = id;
		this.meta = meta;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		MetadataCustom metadata = (MetadataCustom) o;
		return meta == metadata.meta && Objects.equal(id, metadata.id);
	}

	@Override
	public int hashCode() {
		return Objects.hashCode(id, meta);
	}

	public ResourceLocation getId() {
		return id;
	}

	public int getMeta() {
		return meta;
	}
}
