package tn.tecos.team.kademproject.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import tn.tecos.team.kademproject.repositories.EquipeRepository;
import tn.tecos.team.kademproject.entities.Equipe;

import java.util.List;

@Service
@RequiredArgsConstructor
public class IEquipeServicesImp implements IEquipeServices{

    private final EquipeRepository equipeRepository;
    @Override
    public void ajouterEquipe(Equipe e) {
        equipeRepository.save(e);
    }

    @Override
    public void updateEquipe(Equipe e) {
        equipeRepository.save(e);
    }

    @Override
    public List<Equipe> getAllEquipe() {
        return equipeRepository.findAll();
    }

    @Override
    public Equipe getByIdEquipe(Integer id) {
        return equipeRepository.findById(id).orElse(null);
    }

    @Override
    public void deleteEquipe(Integer id) {
        equipeRepository.deleteById(id);
    }
}
