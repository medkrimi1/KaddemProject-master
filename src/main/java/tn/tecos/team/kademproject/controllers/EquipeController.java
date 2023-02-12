package tn.tecos.team.kademproject.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.tecos.team.kademproject.entities.Equipe;
import tn.tecos.team.kademproject.services.IEquipeServices;

import java.util.List;

@RestController
@RequestMapping("equipe")
@RequiredArgsConstructor
public class EquipeController {
    @Autowired
    private final IEquipeServices iEquipeServices;
    @GetMapping()
    public List<Equipe> getAllEquipe(){
        return iEquipeServices.getAllEquipe();
    }
    @GetMapping("{id}")
    public Equipe getByIdEquipe(@PathVariable int id){
        return iEquipeServices.getByIdEquipe(id);
    }
    @DeleteMapping("{id}")
    private void deleteEquipe(@PathVariable int id){
        iEquipeServices.deleteEquipe(id);
    }
    @PostMapping()
    public void ajouterEquipe(@RequestBody Equipe equipe){
        iEquipeServices.ajouterEquipe(equipe);
    }
    @PutMapping()
    private Equipe updateEquipe(@RequestBody Equipe equipe){
        iEquipeServices.updateEquipe(equipe);
        return equipe;
    }
}
