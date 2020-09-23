package com.pokeapi.models.entity;

import java.io.Serializable;

public class PokemonEvolution implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private BabyTriggerItem baby_trigger_item;
	private Chain chain;
	private int id;

	public BabyTriggerItem getBaby_trigger_item() {
		return baby_trigger_item;
	}

	public void setBaby_trigger_item(BabyTriggerItem baby_trigger_item) {
		this.baby_trigger_item = baby_trigger_item;
	}

	public Chain getChain() {
		return chain;
	}

	public void setChain(Chain chain) {
		this.chain = chain;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
