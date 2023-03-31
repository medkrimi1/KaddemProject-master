package tn.tecos.team.kademproject.controllers;

import tn.tecos.team.kademproject.entities.Department;
import tn.tecos.team.kademproject.services.DepartmentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/departement")
public class DepartementController {


    private final DepartmentService departmentService;
    @GetMapping
    public List<Department> getAll() {
        return departmentService.retrieveAllDepartements();
    }

    @PostMapping
    public Department add(@RequestBody Department e) {
        return departmentService.addDepartement(e);
    }

    @PutMapping
    public Department update (@RequestBody Department e) {
        return departmentService.updateDepartement(e);
    }

    @GetMapping(path = "/{id}")
    public Department getById (@PathVariable Integer id) {
        return departmentService.retrieveDepartement(id).orElse(null);
    }

}