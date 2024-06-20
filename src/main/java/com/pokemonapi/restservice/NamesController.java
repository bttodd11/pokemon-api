package com.pokemonapi.restservice;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.pokemonapi.deserializer.entry.Entry;

@RestController
public class NamesController {

    // When I hit this URL I want more than just the names, I want them already filtered
    // out
    @GetMapping("/names")
    public Object getNames() {

        Entry entryName = new Entry();
        Object names2 = entryName.getNameAndId();
        return names2;
    }
}




