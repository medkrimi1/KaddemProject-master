package tn.tecos.team.kademproject.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.tecos.team.kademproject.entities.DetailEquipe;
import tn.tecos.team.kademproject.services.IDetailEquipeServices;

import java.util.List;

@RestController
@RequestMapping("detailequipe")
@RequiredArgsConstructor
public class DetailEquipeController {

    private final IDetailEquipeServices iDetailEquipeServices;

    @GetMapping()
    public List<DetailEquipe> getAllDetailEquipe(){
        return iDetailEquipeServices.getAllDetailEquipe();
    }
    @GetMapping("{id}")
    public DetailEquipe getByIdDetailEquipe(@PathVariable int id){
        return iDetailEquipeServices.getByIdDetailEquipe(id);
    }
    @DeleteMapping("{id}")
    private void deleteDetailEquipe(@PathVariable int id){
        iDetailEquipeServices.deleteDetailEquipe(id);
    }
    @PostMapping()
    public void ajouterDetailEquipe(@RequestBody DetailEquipe detailEquipe){
        iDetailEquipeServices.ajouterDetailEquipe(detailEquipe);
    }
    @PutMapping()
    private DetailEquipe updateDetailEquipe(@RequestBody DetailEquipe detailEquipe){
        iDetailEquipeServices.updateDetailEquipe(detailEquipe);
        return detailEquipe;
    }
}
