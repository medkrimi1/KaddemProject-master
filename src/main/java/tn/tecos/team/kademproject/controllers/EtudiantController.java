package tn.tecos.team.kademproject.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.tecos.team.kademproject.entities.Etudiant;
import tn.tecos.team.kademproject.services.IEtudiantServices;

import java.util.List;

@RestController
@RequestMapping("etudiant")
@RequiredArgsConstructor
public class EtudiantController {

    IEtudiantServices iEtudiantServices;
    @GetMapping()
    public String sayHello(){
        return "hello";
    }
    @GetMapping()
    public List<Etudiant> getAll(){
        return iEtudiantServices.getAll();
    }
    @GetMapping("{id}")
    public Etudiant getById(@PathVariable int id){
        return iEtudiantServices.getById(id);
    }
    @PostMapping()
    public void ajouterEtudiant(@RequestBody Etudiant e){
             iEtudiantServices.ajouterEtudiant(e);
    }

}
