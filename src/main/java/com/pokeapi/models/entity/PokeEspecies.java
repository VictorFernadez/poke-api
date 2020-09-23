package com.pokeapi.models.entity;

import java.io.Serializable;
import java.util.List;

public class PokeEspecies implements Serializable {
	private static final long serialVersionUID = 1L;
	private int count;
	private String next;
	private String previous;
	private List<Pokemon> results;

	public PokeEspecies() {
	}

	public PokeEspecies(int count, String next, String previous, List<Pokemon> results) {
		super();
		this.count = count;
		this.next = next;
		this.previous = previous;
		this.results = results;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public String getNext() {
		return next;
	}

	public void setNext(String next) {
		this.next = next;
	}

	public String getPrevious() {
		return previous;
	}

	public void setPrevious(String previous) {
		this.previous = previous;
	}

	public List<Pokemon> getResults() {
		return results;
	}

	public void setResults(List<Pokemon> results) {
		this.results = results;
	}

}
