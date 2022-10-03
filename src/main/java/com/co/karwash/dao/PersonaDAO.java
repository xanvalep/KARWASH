package com.co.karwash.dao;

import org.springframework.data.repository.CrudRepository;
import com.co.karwash.entidades.Persona;

public interface PersonaDAO extends CrudRepository  <Persona,Integer>{

    
}
