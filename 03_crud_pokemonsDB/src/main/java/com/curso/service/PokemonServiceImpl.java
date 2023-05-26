package com.curso.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.curso.dao.PokemonsDao;
import com.curso.model.Pokemon;

@Service
public class PokemonServiceImpl implements PokemonsService {

	@Autowired
	PokemonsDao dao;

	@Override
	public List<Pokemon> pokemons() {
		return dao.findAll();
	}

	@Override
	public Pokemon buscarPokemon(int id) {
		return dao.findById(id).orElse(null);
	}

	@Override
	public void nuevoPokemon(Pokemon pokemon) {
		dao.save(pokemon);

	}

	@Override
	public void actualizarPokemon(Pokemon pokemon) {
		dao.save(pokemon);

	}

	@Override
	public void eliminarPokemon(int id) {
		dao.deleteById(id);
	}

	@Override
	public List<Pokemon> seleccionTipos(String tipo) {
		return dao.seleccionarTipos(tipo);
	}
	
	

}
