package tn.tecos.team.kademproject.controllers;

import tn.tecos.team.kademproject.entities.Universite;
import tn.tecos.team.kademproject.services.UniversiteService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/universite")
public class UniversiteController {


    private final UniversiteService universiteService;
    @GetMapping
    public List<Universite> getAll() {
        return universiteService.retrieveAllUniversites();
    }

    @PostMapping
    public Universite add(@RequestBody Universite e) {
        return universiteService.addUniversite(e);
    }

    @PutMapping
    public Universite update (@RequestBody Universite e) {
        return universiteService.updateUniversite(e);
    }

    @GetMapping(path = "/{id}")
    public Universite getById (@PathVariable Integer id) {
        return universiteService.retrieveUniversite(id).orElse(null);
    }

}