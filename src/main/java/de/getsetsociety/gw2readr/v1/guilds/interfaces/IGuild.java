package de.getsetsociety.gw2readr.v1.guilds.interfaces;


public interface IGuild {

	public abstract String getGuildId();

	public abstract void setGuildId(String guildId);

	public abstract String getGuildName();

	public abstract void setGuildName(String guildName);

	public abstract String getTag();

	public abstract void setTag(String tag);

	public abstract IGuildEmblem getEmblem();

	public abstract void setEmblem(IGuildEmblem emblem);

}