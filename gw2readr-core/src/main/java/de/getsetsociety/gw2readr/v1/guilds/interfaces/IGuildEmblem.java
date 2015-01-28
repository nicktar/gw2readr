package de.getsetsociety.gw2readr.v1.guilds.interfaces;

import java.util.List;

import de.getsetsociety.gw2readr.v1.guilds.enums.GuildEmblemFlags;

public interface IGuildEmblem {

	public abstract Integer getBackgroundId();

	public abstract void setBackgroundId(Integer backgroundId);

	public abstract Integer getForegroundId();

	public abstract void setForegroundId(Integer foregroundId);

	public abstract List<GuildEmblemFlags> getFlags();

	public abstract void setFlags(List<GuildEmblemFlags> flags);

	public abstract Integer getBackgroundColorId();

	public abstract void setBackgroundColorId(Integer backgroundColorId);

	public abstract Integer getForegroundPrimaryColorId();

	public abstract void setForegroundPrimaryColorId(Integer foregroundPrimaryColorId);

	public abstract Integer getForegroundSecondaryColorId();

	public abstract void setForegroundSecondaryColorId(Integer foregroundSecondaryColorId);

}