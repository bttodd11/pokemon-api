package com.pokemonapi.events;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

public class applicationStart {

    @Component public static class ApplicationStartup implements ApplicationListener < ApplicationReadyEvent > {
        @Override public void onApplicationEvent(final ApplicationReadyEvent event) {
            System.out.println("Application started! Please work !!!!!!!!!!!!!!!!!!!");
        }
    }
}
