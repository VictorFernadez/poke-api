package com.pokeapi.models.entity;

import java.io.Serializable;
import java.util.List;

public class PokemonDetalle implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int base_happiness;
	private int capture_rate;
	private Color color;
	private List<EggGroups> egg_groups;
	private EvolutionChain evolution_chain;
	private EvolFromSpecies evolves_from_species;
	private List<FlavorTextEntries> flavor_text_entries;
	private List<String> form_descriptions;
	private Boolean forms_switchable;
	private int gender_rate;
	private List<Genera> genera;
	private Generation generation;
	private GrowthRate growth_rate;
	private Habitat habitat;
	private Boolean has_gender_differences;
	private int hatch_counter;
	private int id;
	private Boolean is_baby;
	private Boolean is_legendary;
	private Boolean is_mythical;
	private String name;
	private List<Names> names;
	private int order;
	private List<PalParkEncounters> pal_park_encounters;
	private List<PokedexNumbers> pokedex_numbers;
	private Shape shape;
	private List<Varieties> varieties;

	public int getBase_happiness() {
		return base_happiness;
	}

	public void setBase_happiness(int base_happiness) {
		this.base_happiness = base_happiness;
	}

	public int getCapture_rate() {
		return capture_rate;
	}

	public void setCapture_rate(int capture_rate) {
		this.capture_rate = capture_rate;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public List<EggGroups> getEgg_groups() {
		return egg_groups;
	}

	public void setEgg_groups(List<EggGroups> egg_groups) {
		this.egg_groups = egg_groups;
	}

	public EvolutionChain getEvolution_chain() {
		return evolution_chain;
	}

	public void setEvolution_chain(EvolutionChain evolution_chain) {
		this.evolution_chain = evolution_chain;
	}

	public EvolFromSpecies getEvolves_from_species() {
		return evolves_from_species;
	}

	public void setEvolves_from_species(EvolFromSpecies evolves_from_species) {
		this.evolves_from_species = evolves_from_species;
	}

	public List<FlavorTextEntries> getFlavor_text_entries() {
		return flavor_text_entries;
	}

	public void setFlavor_text_entries(List<FlavorTextEntries> flavor_text_entries) {
		this.flavor_text_entries = flavor_text_entries;
	}

	public List<String> getForm_descriptions() {
		return form_descriptions;
	}

	public void setForm_descriptions(List<String> form_descriptions) {
		this.form_descriptions = form_descriptions;
	}

	public Boolean getForms_switchable() {
		return forms_switchable;
	}

	public void setForms_switchable(Boolean forms_switchable) {
		this.forms_switchable = forms_switchable;
	}

	public int getGender_rate() {
		return gender_rate;
	}

	public void setGender_rate(int gender_rate) {
		this.gender_rate = gender_rate;
	}

	public List<Genera> getGenera() {
		return genera;
	}

	public void setGenera(List<Genera> genera) {
		this.genera = genera;
	}

	public Boolean getHas_gender_differences() {
		return has_gender_differences;
	}

	public void setHas_gender_differences(Boolean has_gender_differences) {
		this.has_gender_differences = has_gender_differences;
	}

	public int getHatch_counter() {
		return hatch_counter;
	}

	public void setHatch_counter(int hatch_counter) {
		this.hatch_counter = hatch_counter;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Boolean getIs_baby() {
		return is_baby;
	}

	public void setIs_baby(Boolean is_baby) {
		this.is_baby = is_baby;
	}

	public Boolean getIs_legendary() {
		return is_legendary;
	}

	public void setIs_legendary(Boolean is_legendary) {
		this.is_legendary = is_legendary;
	}

	public Boolean getIs_mythical() {
		return is_mythical;
	}

	public void setIs_mythical(Boolean is_mythical) {
		this.is_mythical = is_mythical;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Names> getNames() {
		return names;
	}

	public void setNames(List<Names> names) {
		this.names = names;
	}

	public int getOrder() {
		return order;
	}

	public void setOrder(int order) {
		this.order = order;
	}

	public List<PalParkEncounters> getPal_park_encounters() {
		return pal_park_encounters;
	}

	public void setPal_park_encounters(List<PalParkEncounters> pal_park_encounters) {
		this.pal_park_encounters = pal_park_encounters;
	}

	public List<PokedexNumbers> getPokedex_numbers() {
		return pokedex_numbers;
	}

	public void setPokedex_numbers(List<PokedexNumbers> pokedex_numbers) {
		this.pokedex_numbers = pokedex_numbers;
	}

	public Generation getGeneration() {
		return generation;
	}

	public void setGeneration(Generation generation) {
		this.generation = generation;
	}

	public GrowthRate getGrowth_rate() {
		return growth_rate;
	}

	public void setGrowth_rate(GrowthRate growth_rate) {
		this.growth_rate = growth_rate;
	}

	public Habitat getHabitat() {
		return habitat;
	}

	public void setHabitat(Habitat habitat) {
		this.habitat = habitat;
	}

	public Shape getShape() {
		return shape;
	}

	public void setShape(Shape shape) {
		this.shape = shape;
	}

	public List<Varieties> getVarieties() {
		return varieties;
	}

	public void setVarieties(List<Varieties> varieties) {
		this.varieties = varieties;
	}

}
