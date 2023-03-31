package tn.tecos.team.kademproject.repositories;

import tn.tecos.team.kademproject.entities.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DepartmentRepository extends JpaRepository<Department,Integer> {
//    @Query("select d from Department d inner join d.universites universites where universites.idUniv = ?1")
//    List<Department> findByUniversitesIdUniv(Integer id);
}