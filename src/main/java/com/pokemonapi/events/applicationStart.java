package com.pokemonapi.events;
import com.pokemonapi.utils.fetchUtils;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

public class applicationStart {
    public static String url = "https://pokeapi.co/api/v1/pokemon?limit=1279";

    @Component public static class ApplicationStartup implements ApplicationListener < ApplicationReadyEvent > {
        @Override public void onApplicationEvent(final ApplicationReadyEvent event) {

                new fetchUtils().getNames(url);
            }
    }
}
