package com.pokeapi.models.entity;

import java.io.Serializable;

public class PalParkEncounters implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Area area;
	private int base_score;
	private int rate;

	public Area getArea() {
		return area;
	}

	public void setArea(Area area) {
		this.area = area;
	}

	public int getBase_score() {
		return base_score;
	}

	public void setBase_score(int base_score) {
		this.base_score = base_score;
	}

	public int getRate() {
		return rate;
	}

	public void setRate(int rate) {
		this.rate = rate;
	}

}
