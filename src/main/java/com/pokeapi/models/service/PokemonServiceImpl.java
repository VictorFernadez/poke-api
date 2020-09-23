package com.pokeapi.models.service;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.pokeapi.models.entity.PokeEspecies;
import com.pokeapi.models.entity.PokemonDetalle;
import com.pokeapi.models.entity.PokemonEvolution;

@Service
public class PokemonServiceImpl implements IPokemonService {

	@Autowired
	private RestTemplate pokeRest;

	@Override
	public ResponseEntity<?> findAll(String url) {
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		headers.add("user-agent",
				"Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/54.0.2840.99 Safari/537.36");
		HttpEntity<String> entity = new HttpEntity<String>("parameters", headers);
		ResponseEntity<?> res = pokeRest.exchange(url, HttpMethod.GET, entity, PokeEspecies.class);
		System.out.println("**********************************************************************************");
//        System.out.println(res.getBody().getResults());
		return res;
	}

	@Override
	public ResponseEntity<PokemonDetalle> detalle(String url) {
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		headers.add("user-agent",
				"Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/54.0.2840.99 Safari/537.36");
		HttpEntity<String> entity = new HttpEntity<String>("parameters", headers);
		ResponseEntity<PokemonDetalle> res = pokeRest.exchange(url, HttpMethod.GET, entity, PokemonDetalle.class);
		System.out.println("**********************************************************************************");
//        System.out.println(res.getBody().getResults());
		return res;
	}

	@Override
	public ResponseEntity<PokemonEvolution> evol(String url) {
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		headers.add("user-agent",
				"Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/54.0.2840.99 Safari/537.36");
		HttpEntity<String> entity = new HttpEntity<String>("parameters", headers);
		ResponseEntity<PokemonEvolution> res = pokeRest.exchange(url, HttpMethod.GET, entity, PokemonEvolution.class);
		System.out.println("**********************************************************************************");
//        System.out.println(res.getBody().getResults());
		return res;
	}
}
