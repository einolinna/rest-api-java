package com.example.apirest.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.apirest.entities.Persona;

@Repository
public interface PersonaRepository extends JpaRepository<Persona, Long> {

}
