package com.pokeapi.models.entity;

import java.io.Serializable;

public class PokedexNumbers implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int entry_number;
	private Pokedex pokedex;

	public int getEntry_number() {
		return entry_number;
	}

	public void setEntry_number(int entry_number) {
		this.entry_number = entry_number;
	}

	public Pokedex getPokedex() {
		return pokedex;
	}

	public void setPokedex(Pokedex pokedex) {
		this.pokedex = pokedex;
	}

}
