package com.pokeapi.util;

import org.springframework.stereotype.Component;

@Component
public class Cadenas {
	public String generaRuta(String ruta) {
		String sCadena = ruta.substring(41);
		return sCadena;
	}

}
