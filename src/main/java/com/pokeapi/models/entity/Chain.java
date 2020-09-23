package com.pokeapi.models.entity;

import java.io.Serializable;
import java.util.List;

public class Chain implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private List<EvolutionDetails> evolution_details;
	private List<EvolvesTo> evolves_to;
	private Boolean is_baby;
	private Species species;

	public List<EvolutionDetails> getEvolution_details() {
		return evolution_details;
	}

	public void setEvolution_details(List<EvolutionDetails> evolution_details) {
		this.evolution_details = evolution_details;
	}

	public List<EvolvesTo> getEvolves_to() {
		return evolves_to;
	}

	public void setEvolves_to(List<EvolvesTo> evolves_to) {
		this.evolves_to = evolves_to;
	}

	public Boolean getIs_baby() {
		return is_baby;
	}

	public void setIs_baby(Boolean is_baby) {
		this.is_baby = is_baby;
	}

	public Species getSpecies() {
		return species;
	}

	public void setSpecies(Species species) {
		this.species = species;
	}

}
