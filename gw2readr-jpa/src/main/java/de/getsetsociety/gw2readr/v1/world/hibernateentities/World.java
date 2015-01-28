package de.getsetsociety.gw2readr.v1.world.hibernateentities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

import de.getsetsociety.gw2readr.general.enums.Language;
import de.getsetsociety.gw2readr.v1.world.interfaces.IWorld;

@Entity
@Table
@IdClass(World.Pk.class)
public class World implements IWorld {

	private Integer id;
	private String name;
	private Language language;

	@Id
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Id
	public Language getLanguage() {
		return language;
	}
	
	public void setLanguage(Language language) {
		this.language = language;
	}
	
	@Column
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static class Pk {
		
		private Integer id;
		private Language language;

		public Pk() {
			// empty
		}
		
		public Pk(Integer id, Language language) {
			this.id = id;
			this.language = language;
		}

		public Integer getId() {
			return id;
		}

		public void setId(Integer id) {
			this.id = id;
		}

		public Language getLanguage() {
			return language;
		}

		public void setLanguage(Language language) {
			this.language = language;
		}
	}
}
