package tn.tecos.team.kademproject.controllers;

import tn.tecos.team.kademproject.entities.Contrat;
import tn.tecos.team.kademproject.entities.Equipe;
import tn.tecos.team.kademproject.services.ContratService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/contract")
public class ContractController {


    private final ContratService contratService;
    @GetMapping
    public List<Contrat> getAll() {
        return contratService.retrieveAllContrats();
    }

    @PostMapping
    public Contrat add(@RequestBody Contrat e) {
        return contratService.addContrat(e);
    }

    @PutMapping
    public Contrat update (@RequestBody Contrat e) {
        return contratService.updateContrat(e);
    }

    @DeleteMapping(path = "/{id}")
    public void delete (@PathVariable Integer id) {
        contratService.removeContrat(id);
    }

    @GetMapping(path = "/{id}")
    public Contrat getById(@PathVariable Integer id) {
        return contratService.retrieveContrat(id).orElse(null);
    }


}