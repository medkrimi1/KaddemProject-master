package tn.tecos.team.kademproject.controllers;

import tn.tecos.team.kademproject.entities.Contrat;
import tn.tecos.team.kademproject.entities.Etudiant;
import tn.tecos.team.kademproject.services.EtudiantService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/etudiant")
public class EtudiantController {


    private final EtudiantService etudiantService;
    @GetMapping
    public List<Etudiant> getAll() {
        return etudiantService.retrieveAllEtudiants();
    }

    @PostMapping
    public Etudiant add(@RequestBody Etudiant e) {
        return etudiantService.addEtudiant(e);
    }

    @PutMapping
    public Etudiant update (@RequestBody Etudiant e) {
        return etudiantService.updateEtudiant(e);
    }

    @DeleteMapping(path = "/{id}")
    public void delete (@PathVariable Integer id) {
        etudiantService.removeEtudiant(id);
    }

    @GetMapping(path = "/{id}")
    public Etudiant getById(@PathVariable Integer id) {
        return etudiantService.retrieveEtudiant(id).orElse(null);
    }

    @PostMapping("/{etudiantId}/{departementId}")
    public void assignEtudiantToDepartement(@PathVariable Integer etudiantId,@PathVariable Integer departementId) {
        etudiantService.assignEtudiantToDepartement(etudiantId,departementId);
    }

    @PostMapping("addAndAssign/{idContrat}/{idEquipe}")
    Etudiant addAndAssignEtudiantToEquipeAndContract(@RequestBody Etudiant e,@PathVariable Integer idContrat,
                                                     @PathVariable Integer idEquipe){
        return etudiantService.addAndAssignEtudiantToEquipeAndContract(e,idContrat,idEquipe);
    }


}