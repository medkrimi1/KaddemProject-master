package tn.tecos.team.kademproject.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.tecos.team.kademproject.entities.Universite;
import tn.tecos.team.kademproject.repositories.UniversiteRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class IUniversiteServicesImp implements IUniversiteServices {
    private final UniversiteRepository universiteRepository;

    @Override
    public void ajoutUniversite(Universite u) {
        universiteRepository.save(u);
    }

    @Override
    public void updateUniversite(Universite u) {
        universiteRepository.save(u);
    }

    @Override
    public List<Universite> getAllUniversite() {
        return universiteRepository.findAll();
    }

    @Override
    public Universite getByIdUniversite(Integer id) {
        return universiteRepository.findById(id).orElse(null);
    }

    @Override
    public void deleteUniversite(Integer id) {
        universiteRepository.deleteById(id);


    }
}