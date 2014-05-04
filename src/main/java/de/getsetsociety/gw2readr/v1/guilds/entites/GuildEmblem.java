package de.getsetsociety.gw2readr.v1.guilds.entites;

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

	/* (non-Javadoc)
	 * @see de.getsetsociety.gw2readr.v1.guilds.entites.IGuildEmblem#getBackgroundId()
	 */
	@Override
	public Integer getBackgroundId() {
		return backgroundId;
	}

	/* (non-Javadoc)
	 * @see de.getsetsociety.gw2readr.v1.guilds.entites.IGuildEmblem#setBackgroundId(java.lang.Integer)
	 */
	@Override
	public void setBackgroundId(Integer backgroundId) {
		this.backgroundId = backgroundId;
	}

	/* (non-Javadoc)
	 * @see de.getsetsociety.gw2readr.v1.guilds.entites.IGuildEmblem#getForegroundId()
	 */
	@Override
	public Integer getForegroundId() {
		return foregroundId;
	}

	/* (non-Javadoc)
	 * @see de.getsetsociety.gw2readr.v1.guilds.entites.IGuildEmblem#setForegroundId(java.lang.Integer)
	 */
	@Override
	public void setForegroundId(Integer foregroundId) {
		this.foregroundId = foregroundId;
	}

	/* (non-Javadoc)
	 * @see de.getsetsociety.gw2readr.v1.guilds.entites.IGuildEmblem#getFlags()
	 */
	@Override
	public List<GuildEmblemFlags> getFlags() {
		return flags;
	}

	/* (non-Javadoc)
	 * @see de.getsetsociety.gw2readr.v1.guilds.entites.IGuildEmblem#setFlags(java.util.List)
	 */
	@Override
	public void setFlags(List<GuildEmblemFlags> flags) {
		this.flags = flags;
	}

	/* (non-Javadoc)
	 * @see de.getsetsociety.gw2readr.v1.guilds.entites.IGuildEmblem#getBackgroundColorId()
	 */
	@Override
	public Integer getBackgroundColorId() {
		return backgroundColorId;
	}

	/* (non-Javadoc)
	 * @see de.getsetsociety.gw2readr.v1.guilds.entites.IGuildEmblem#setBackgroundColorId(java.lang.Integer)
	 */
	@Override
	public void setBackgroundColorId(Integer backgroundColorId) {
		this.backgroundColorId = backgroundColorId;
	}

	/* (non-Javadoc)
	 * @see de.getsetsociety.gw2readr.v1.guilds.entites.IGuildEmblem#getForegroundPrimaryColorId()
	 */
	@Override
	public Integer getForegroundPrimaryColorId() {
		return foregroundPrimaryColorId;
	}

	/* (non-Javadoc)
	 * @see de.getsetsociety.gw2readr.v1.guilds.entites.IGuildEmblem#setForegroundPrimaryColorId(java.lang.Integer)
	 */
	@Override
	public void setForegroundPrimaryColorId(Integer foregroundPrimaryColorId) {
		this.foregroundPrimaryColorId = foregroundPrimaryColorId;
	}

	/* (non-Javadoc)
	 * @see de.getsetsociety.gw2readr.v1.guilds.entites.IGuildEmblem#getForegroundSecondaryColorId()
	 */
	@Override
	public Integer getForegroundSecondaryColorId() {
		return foregroundSecondaryColorId;
	}

	/* (non-Javadoc)
	 * @see de.getsetsociety.gw2readr.v1.guilds.entites.IGuildEmblem#setForegroundSecondaryColorId(java.lang.Integer)
	 */
	@Override
	public void setForegroundSecondaryColorId(Integer foregroundSecondaryColorId) {
		this.foregroundSecondaryColorId = foregroundSecondaryColorId;
	}

}
