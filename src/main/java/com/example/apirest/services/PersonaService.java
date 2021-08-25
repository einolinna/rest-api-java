package com.example.apirest.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.apirest.entities.Persona;
import com.example.apirest.repositories.PersonaRepository;

@Service
public class PersonaService implements BaseService<Persona> {

	private PersonaRepository personaRepository;

	public PersonaService(PersonaRepository personaRepository) {

		this.personaRepository = personaRepository;

	}

	@Override
	@Transactional
	public List<Persona> findAll() throws Exception {

		try {
			
			List<Persona> entities = personaRepository.findAll();
			
			return entities;

		} catch (Exception e) {
				throw new Exception(e.getMessage());
		}
	}

	@Override
	@Transactional
	public Persona findById(Long id) throws Exception {
		try {
			Optional<Persona> entityOptional = personaRepository.findById(id);
			return entityOptional.get();
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}
			
		
	}

	@Override
	@Transactional
	public Persona save(Persona entity) throws Exception {
		
		
		try {
			entity = personaRepository.save(entity);
			return entity;
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}
		
	}

	@Override
	@Transactional
	public Persona update(Long id, Persona entity) throws Exception {
		try {
			Optional<Persona> entityOptional = personaRepository.findById(id);
			Persona persona =entityOptional.get();
			
			 persona = personaRepository.save(persona);
			 return persona;
			
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}
	}

	@Override
	@Transactional
	public boolean delete(Long id) throws Exception {
		
		try {
			if(personaRepository.existsById(id)) { 
			 personaRepository.deleteById(id);
			 return true;}
			else {throw new Exception();}
			
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}
	}

}
