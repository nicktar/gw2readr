package de.getsetsociety.gw2readr.v1.guilds.hibernateentites;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import de.getsetsociety.gw2readr.v1.guilds.interfaces.IGuild;
import de.getsetsociety.gw2readr.v1.guilds.interfaces.IGuildEmblem;

@Table
@Entity
public class Guild implements IGuild {

	private String guildId;
	private String guildName;
	private String tag;
	private IGuildEmblem emblem;
	
	/* (non-Javadoc)
	 * @see de.getsetsociety.gw2readr.v1.guilds.interfaces.IGuild#getGuildId()
	 */
	@Id
	@Column
	public String getGuildId() {
		return guildId;
	}

	/* (non-Javadoc)
	 * @see de.getsetsociety.gw2readr.v1.guilds.interfaces.IGuild#setGuildId(java.lang.String)
	 */
	public void setGuildId(String guildId) {
		this.guildId = guildId;
	}

	/* (non-Javadoc)
	 * @see de.getsetsociety.gw2readr.v1.guilds.interfaces.IGuild#getGuildName()
	 */
	@Column
	public String getGuildName() {
		return guildName;
	}

	/* (non-Javadoc)
	 * @see de.getsetsociety.gw2readr.v1.guilds.interfaces.IGuild#setGuildName(java.lang.String)
	 */
	public void setGuildName(String guildName) {
		this.guildName = guildName;
	}

	/* (non-Javadoc)
	 * @see de.getsetsociety.gw2readr.v1.guilds.interfaces.IGuild#getTag()
	 */
	@Column
	public String getTag() {
		return tag;
	}

	/* (non-Javadoc)
	 * @see de.getsetsociety.gw2readr.v1.guilds.interfaces.IGuild#setTag(java.lang.String)
	 */
	public void setTag(String tag) {
		this.tag = tag;
	}

	/* (non-Javadoc)
	 * @see de.getsetsociety.gw2readr.v1.guilds.interfaces.IGuild#getEmblem()
	 */
	@OneToOne(targetEntity=GuildEmblem.class, cascade=CascadeType.ALL)
	public IGuildEmblem getEmblem() {
		return emblem;
	}

	/* (non-Javadoc)
	 * @see de.getsetsociety.gw2readr.v1.guilds.interfaces.IGuild#setEmblem(de.getsetsociety.gw2readr.v1.guilds.interfaces.IGuildEmblem)
	 */
	public void setEmblem(IGuildEmblem emblem) {
		this.emblem = emblem;
	}

}
