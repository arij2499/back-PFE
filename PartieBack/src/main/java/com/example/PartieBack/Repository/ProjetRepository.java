package com.example.PartieBack.Repository;

import com.example.PartieBack.entities.Projet;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjetRepository extends JpaRepository<Projet,Long> {
}
