package com.pokeapi.models.service;

import org.springframework.http.ResponseEntity;

import com.pokeapi.models.entity.PokeEspecies;
import com.pokeapi.models.entity.PokemonDetalle;
import com.pokeapi.models.entity.PokemonEvolution;

public interface IPokemonService {
	public ResponseEntity<?> findAll(String url);
	public ResponseEntity<PokemonDetalle> detalle(String url);
	public ResponseEntity<PokemonEvolution> evol(String url);
}
