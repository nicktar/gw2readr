package de.getsetsociety.gw2readr.v1.guilds.entites;

import de.getsetsociety.gw2readr.v1.guilds.interfaces.IGuild;
import de.getsetsociety.gw2readr.v1.guilds.interfaces.IGuildEmblem;

public class Guild implements IGuild {

	private String guildId;
	private String guildName;
	private String tag;
	private IGuildEmblem emblem;

	public String getGuildId() {
		return guildId;
	}

	public void setGuildId(String guildId) {
		this.guildId = guildId;
	}

	public String getGuildName() {
		return guildName;
	}

	public void setGuildName(String guildName) {
		this.guildName = guildName;
	}

	public String getTag() {
		return tag;
	}

	public void setTag(String tag) {
		this.tag = tag;
	}

	public IGuildEmblem getEmblem() {
		return emblem;
	}

	public void setEmblem(IGuildEmblem emblem) {
		this.emblem = emblem;
	}


}
