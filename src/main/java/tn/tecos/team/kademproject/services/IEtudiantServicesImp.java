package tn.tecos.team.kademproject.services;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;
import tn.tecos.team.kademproject.entities.Contrat;
import tn.tecos.team.kademproject.entities.Departement;
import tn.tecos.team.kademproject.entities.Equipe;
import tn.tecos.team.kademproject.entities.Etudiant;
import tn.tecos.team.kademproject.repositories.ContratRepository;
import tn.tecos.team.kademproject.repositories.DepartementRepository;
import tn.tecos.team.kademproject.repositories.EquipeRepository;
import tn.tecos.team.kademproject.repositories.EtudiantRepository;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;


@Service
@RequiredArgsConstructor
public class IEtudiantServicesImp implements IEtudiantServices {

    private final EtudiantRepository etudiantRepository;
    private final DepartementRepository departementRepository;
    private final ContratRepository contratRepository;
    private final EquipeRepository equipeRepository;
    @Override
    public void ajouterEtudiant(Etudiant e) {
        etudiantRepository.save(e);
    }

    @Override
    public void updateEtudiant(Etudiant e) {
        etudiantRepository.save(e);
    }

    @Override
    public List<Etudiant> getAll() {
        return etudiantRepository.findAll();
    }

    @Override
    public Etudiant getById(int id) {
        return etudiantRepository.findById(id).orElse(null);

    }

    @Override
    public void deleteEtudiant(int id) {
        etudiantRepository.deleteById(id);
    }

    @Override
    public void assignEtudiantToDepartement(Integer etudiantId, Integer departementId) {
        //récupération des objets
        // Etudiant etudiant = this.getById(etudiantId);
        Etudiant etudiant = etudiantRepository.findById(etudiantId).orElse(null);
        Departement departement = departementRepository.findById(departementId).orElse(null);

        //vérification des objets
        // if ((etudiant!=null) && (departement!=null)) {
        //ou
        Assert.notNull(etudiant, "etudiant must not be null.");
        Assert.notNull(departement, "departement must not be null.");
        //traitement
        etudiant.setDepartement(departement);
        //departement.getEtu().add(etudiant);
        //saving
        etudiantRepository.save(etudiant);

    }

    @Override
    @Transactional
    public Etudiant addAndAssignEtudiantToEquipeAndContract(Etudiant e, Integer idContrat, Integer idEquipe) {
        Contrat contrat = contratRepository.findById(idContrat).orElse(null);
        Equipe equipe = equipeRepository.findById(idEquipe).orElse(null);
        Assert.notNull(e,"contrat must no be null");
        Assert.notNull(e,"equipe must no be null");
        //initialisation d'une liste 5ater un objet jdid ken je objet 9dim raw na3mlou getEquipes().add(equipe)
        List<Equipe> equipes = new ArrayList<>();
        equipes.add(equipe);
        e.setEquipes(equipes);
        etudiantRepository.saveAndFlush(e);
        contrat.setEtudiant(e);

        //puisque sta3melna transactional donc zayed bech na3mlou .save
        //contratRepository.save(contrat);
        return e;

    }
}