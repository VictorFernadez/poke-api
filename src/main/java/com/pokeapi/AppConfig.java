package com.pokeapi;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class AppConfig {
	
	@Bean("pokeRest")
	public RestTemplate registrarRestTemplate() {
		return new RestTemplate();
	}

}
