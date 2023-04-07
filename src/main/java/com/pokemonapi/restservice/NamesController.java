package com.pokemonapi.restservice;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.pokemonapi.deserializer.entry.Entry;

import java.util.ArrayList;

@RestController
public class NamesController {

    // When I hit this URL I want more than just the names, I want them already filtered
    // out
    @GetMapping("/names")
    public ArrayList getNames() {

        Entry entryName = new Entry();
        ArrayList names2 = entryName.getResults();
        return names2;
    }
}




