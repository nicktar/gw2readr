package de.getsetsociety.gw2readr.v1.guilds.hibernateentites;

import java.util.ArrayList;
import java.util.List;

import de.getsetsociety.gw2readr.v1.guilds.enums.GuildEmblemFlags;
import de.getsetsociety.gw2readr.v1.guilds.interfaces.IGuildEmblem;

public class GuildEmblem implements IGuildEmblem {

	private Integer backgroundId;
	private Integer foregroundId;
	private List<GuildEmblemFlags> flags = new ArrayList<GuildEmblemFlags>();
	private Integer backgroundColorId;
	private Integer foregroundPrimaryColorId;
	private Integer foregroundSecondaryColorId;

	public Integer getBackgroundId() {
		return backgroundId;
	}

	public void setBackgroundId(Integer backgroundId) {
		this.backgroundId = backgroundId;
	}

	public Integer getForegroundId() {
		return foregroundId;
	}

	public void setForegroundId(Integer foregroundId) {
		this.foregroundId = foregroundId;
	}

	public List<GuildEmblemFlags> getFlags() {
		return flags;
	}

	public void setFlags(List<GuildEmblemFlags> flags) {
		this.flags = flags;
	}

	public Integer getBackgroundColorId() {
		return backgroundColorId;
	}

	public void setBackgroundColorId(Integer backgroundColorId) {
		this.backgroundColorId = backgroundColorId;
	}

	public Integer getForegroundPrimaryColorId() {
		return foregroundPrimaryColorId;
	}

	public void setForegroundPrimaryColorId(Integer foregroundPrimaryColorId) {
		this.foregroundPrimaryColorId = foregroundPrimaryColorId;
	}

	public Integer getForegroundSecondaryColorId() {
		return foregroundSecondaryColorId;
	}

	public void setForegroundSecondaryColorId(Integer foregroundSecondaryColorId) {
		this.foregroundSecondaryColorId = foregroundSecondaryColorId;
	}

}
