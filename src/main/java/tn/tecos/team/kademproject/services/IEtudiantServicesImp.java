package tn.tecos.team.kademproject.services.servicesImpl;

import tn.tecos.team.kademproject.entities.Contrat;
import tn.tecos.team.kademproject.entities.Department;
import tn.tecos.team.kademproject.entities.Equipe;
import tn.tecos.team.kademproject.entities.Etudiant;
import tn.tecos.team.kademproject.repositories.EtudiantRepository;
import tn.tecos.team.kademproject.services.ContratService;
import tn.tecos.team.kademproject.services.DepartmentService;
import tn.tecos.team.kademproject.services.EquipeService;
import tn.tecos.team.kademproject.services.EtudiantService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class EtudiantImpl implements EtudiantService {

    private final EtudiantRepository etudiantRepository;
    private final DepartmentService departmentService;
    private final ContratService contratService;
    private final EquipeService equipeService;

    public EtudiantImpl(EtudiantRepository etudiantRepository,
                        DepartmentService departmentService,
                        ContratService contratService,
                        EquipeService equipeService) {
        this.etudiantRepository = etudiantRepository;
        this.departmentService = departmentService;
        this.contratService = contratService;
        this.equipeService = equipeService;
    }

    @Override
    public List<Etudiant> retrieveAllEtudiants() {
        return etudiantRepository.findAll();
    }

    @Override
    public Etudiant addEtudiant(Etudiant e) {
        return etudiantRepository.save(e);
    }

    @Override
    public Etudiant updateEtudiant(Etudiant e) {
        return etudiantRepository.save(e);
    }

    @Override
    public Optional<Etudiant> retrieveEtudiant(Integer idEtudiant) {
        return etudiantRepository.findById(idEtudiant);
    }

    @Override
    public void removeEtudiant(Integer idEtudiant) {
        etudiantRepository.deleteById(idEtudiant);
    }

    @Override
    public Optional<Etudiant> getByNamePrenom(String name, String prenom) {
        return etudiantRepository.findByNomAndPrenom(name, prenom);
    }

    @Override
    public void assignEtudiantToDepartement(Integer etudiantId, Integer departementId) {
        Etudiant e = retrieveEtudiant(etudiantId).orElse(null);
        Department d = departmentService.retrieveDepartement(departementId).orElse(null);
        if (e != null && d != null){
            e.setDepartment(d);
            this.updateEtudiant(e);
        }
    }

    @Override
    public Etudiant addAndAssignEtudiantToEquipeAndContract(Etudiant e, Integer idContrat, Integer idEquipe) {
        Etudiant savedEtudiant = addEtudiant(e);
        Contrat c = contratService.retrieveContrat(idContrat).orElse(null);
        Equipe equipe = equipeService.retrieveEquipe(idEquipe).orElse(null);
        c.setEtudiant(savedEtudiant);
        List<Etudiant> etudiants = equipe.getEtudiants();
        etudiants.add(savedEtudiant);
        equipe.setEtudiants(etudiants);
        equipeService.updateEquipe(equipe);
        contratService.updateContrat(c);
        return savedEtudiant;
    }

    @Override
    public List<Etudiant> getEtudiantsByDepartement(Integer idDepartement) {
        return etudiantRepository.findAllByDepartmentIdDpart(idDepartement);
    }
}