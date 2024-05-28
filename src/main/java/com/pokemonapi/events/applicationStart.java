package com.pokemonapi.events;
import com.pokemonapi.utils.fetchUtils;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

public class applicationStart {

    @Component public static class ApplicationStartup implements ApplicationListener < ApplicationReadyEvent > {
        @Override public void onApplicationEvent(final ApplicationReadyEvent event) {

                new fetchUtils().getNames();
                new fetchUtils().getEvolutionChain();
            }
    }
}
