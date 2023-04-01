package com.pokemonapi;
import com.pokemonapi.events.applicationStart;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public abstract class PokemonApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(PokemonApiApplication.class, args);
		new applicationStart.ApplicationStartup();
	}

}
