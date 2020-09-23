package com.pokeapi.models.entity;

import java.io.Serializable;

public class Names implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Language language;
	private String name;

	public Language getLanguage() {
		return language;
	}

	public void setLanguage(Language language) {
		this.language = language;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
