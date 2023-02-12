package tn.tecos.team.kademproject.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.tecos.team.kademproject.entities.Universite;
import tn.tecos.team.kademproject.services.IUniversiteServices;

import java.util.List;

@RestController
@RequestMapping("universite")
@RequiredArgsConstructor
public class UniversiteController {
    private final IUniversiteServices iUniversiteServices;

    @GetMapping("/getAllUniversite")
    public List<Universite> getAllUniversite(){
        return iUniversiteServices.getAllUniversite();
    }
    @GetMapping("/getByIdUniversite/{id}")
    public Universite getByIdUniversite(@PathVariable int id){
        return iUniversiteServices.getByIdUniversite(id);
    }
    @DeleteMapping("/DeleteUniversite/{id}")
    public void deleteUniversite(@PathVariable int id){
        iUniversiteServices.deleteUniversite(id);
    }
    @PostMapping("ajoutUniversite")
    public void ajoutUniversite(@RequestBody Universite universite){
        iUniversiteServices.ajoutUniversite(universite);
    }
    @PutMapping("/updateUniversite")
    public Universite updateUniversite(@RequestBody Universite universite){
        iUniversiteServices.updateUniversite(universite);
        return universite;
    }
}
