package com.curso.dao;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.curso.model.Pokemon;

public interface PokemonsDao extends JpaRepository<Pokemon, Integer> {

	@Query(value="SELECT * FROM pokemons WHERE tipo=?", nativeQuery=true)
	List<Pokemon> seleccionarTipos(String tipo);	
}
