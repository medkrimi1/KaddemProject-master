package tn.tecos.team.kademproject.controllers;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.tecos.team.kademproject.entities.Contrat;
import tn.tecos.team.kademproject.services.IContratServices;

import java.util.List;

@RestController
@RequestMapping("contrat")
@RequiredArgsConstructor
public class ContratController {
    private final IContratServices iContratServices;

    @GetMapping()
    public List<Contrat> getAllContrat(){
        return iContratServices.getAllContrat();
    }
    @GetMapping("/{id}")
    public Contrat getByIdContrat(@PathVariable int id){
        return iContratServices.getByIdContrat(id);
    }
    @DeleteMapping("/{id}")
    private void deleteContrat(@PathVariable int id){
        iContratServices.deleteContrat(id);
    }
    @PostMapping()
    public void ajouterContrat(@RequestBody Contrat contrat){
        iContratServices.ajouterContrat(contrat);
    }
    @PutMapping()
    private Contrat updateContrat(@RequestBody Contrat contrat){
        iContratServices.updateContrat(contrat);
        return contrat;
    }

}
