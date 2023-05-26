package com.curso.service;

import java.util.List;

import com.curso.model.Pokemon;

public interface PokemonsService {
	
	List<Pokemon>pokemons();
	Pokemon buscarPokemon(int id);
	void nuevoPokemon(Pokemon pokemon);
	void actualizarPokemon(Pokemon pokemon);
	void eliminarPokemon(int id);
	List<Pokemon>seleccionTipos(String tipo);

}
