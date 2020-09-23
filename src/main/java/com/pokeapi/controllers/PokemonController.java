package com.pokeapi.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pokeapi.models.entity.Chain;
import com.pokeapi.models.entity.EvolvesTo;
import com.pokeapi.models.entity.PokeEspecies;
import com.pokeapi.models.entity.Pokemon;
import com.pokeapi.models.entity.PokemonDetalle;
import com.pokeapi.models.entity.PokemonEvolution;
import com.pokeapi.models.service.IPokemonService;

@Controller
public class PokemonController {
	String dir = "https://pokeapi.co/api/v2/pokemon-species";
	String di2 = dir;
	@Autowired
	private IPokemonService service;

	@RequestMapping("/")
	public String index(Model model) {
		ResponseEntity<PokeEspecies> pke = (ResponseEntity<PokeEspecies>) service.findAll(dir);
		PokeEspecies p = pke.getBody();
		List<Pokemon> pokemon = p.getResults();
		dir = p.getNext();
		model.addAttribute("pokemon", pokemon);
		return "index";
	}

	@GetMapping("/mostrar/{parm}")
	public String mostrar(@PathVariable("parm") String parm, Model model) {
		System.out.println("previous :" + di2);
		if (parm.equals("0")) {
			dir = di2;
		}
		ResponseEntity<PokeEspecies> pke = (ResponseEntity<PokeEspecies>) service.findAll(dir);
		PokeEspecies p = pke.getBody();
		List<Pokemon> pokemon = pke.getBody().getResults();
		dir = p.getNext();
		di2 = p.getPrevious();
		if (di2 == null) {
			di2 = dir;
		}

		model.addAttribute("pokemon", pokemon);
		return "index";
	}

	@GetMapping("/detalle/{url}")
	public String detalle(@PathVariable("url") String url, Model model) {
		url = "https://pokeapi.co/api/v2/pokemon-species/" + url;
		System.out.println(url);
		ResponseEntity<PokemonDetalle> pde = (ResponseEntity<PokemonDetalle>) service.detalle(url);
		PokemonDetalle de = pde.getBody();
		model.addAttribute("detalle", de);
		return "detalle";

	}

	@GetMapping("/evolucion/{url}")
	public String evolucion(@PathVariable("url") String url, Model model) {
		url = "https://pokeapi.co/api/v2/evolution-chain/" + url;
		System.out.println(url);
		ResponseEntity<PokemonEvolution> pde = (ResponseEntity<PokemonEvolution>) service.evol(url);
		List<String> cadena = new ArrayList<String>();
		PokemonEvolution pevo = pde.getBody();
		Chain chain = pevo.getChain();
		String nombre = chain.getSpecies().getName();
		System.out.println("#############################");
		System.out.println(nombre);

		List<EvolvesTo> evolvesTo = chain.getEvolves_to();
		if (evolvesTo.size() > 0) {
			for (int i = 0; i < evolvesTo.size(); i++) {
				if (evolvesTo.size() > 0) {
					System.out.println(evolvesTo.get(i).getSpecies().getName());
					cadena.add(evolvesTo.get(i).getSpecies().getName());
					for (int j = 0; j < evolvesTo.get(i).getEvolves_to().size(); j++) {
						if (evolvesTo.get(i).getEvolves_to().size() > 0) {
							System.out.println(evolvesTo.get(i).getEvolves_to().get(j).getSpecies().getName());
							cadena.add(evolvesTo.get(i).getEvolves_to().get(j).getSpecies().getName());
							for (int j2 = 0; j2 < evolvesTo.get(i).getEvolves_to().get(j).getEvolves_to()
									.size(); j2++) {
								System.out.println(evolvesTo.get(i).getEvolves_to().get(j).getEvolves_to().get(j)
										.getSpecies().getName());
								cadena.add(evolvesTo.get(i).getEvolves_to().get(j).getEvolves_to().get(j).getSpecies()
										.getName());

							}
						}

					}
				}

			}

			model.addAttribute("nombre", nombre);
			model.addAttribute("cadena", cadena);
			return "evolucion";
		}
		model.addAttribute("nombre", nombre);
		return "error";

	}

}
