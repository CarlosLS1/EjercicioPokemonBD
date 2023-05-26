package com.curso.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.curso.model.Pokemon;
import com.curso.service.PokemonsService;

@RestController
public class PokemonsController {
	
	@Autowired
	PokemonsService service;
	
	@GetMapping(value="pokemons", produces=MediaType.APPLICATION_JSON_VALUE)
	public List<Pokemon> pokemons(){
		return service.pokemons();
		
	}
	
	@GetMapping(value="pokemon/{id}", produces=MediaType.APPLICATION_JSON_VALUE)
	public Pokemon pokemon(@PathVariable("id") int id) {
		return service.buscarPokemon(id);
	}
	
	@PostMapping(value="pokemon", produces=MediaType.APPLICATION_JSON_VALUE)
	public void nuevoPokemon(@RequestBody Pokemon pokemon) {
		service.nuevoPokemon(pokemon);
	}
	
	@PutMapping(value="pokemon", produces=MediaType.APPLICATION_JSON_VALUE)
	public void actualizadPokemon(@RequestBody Pokemon pokemon) {
		service.actualizarPokemon(pokemon);
	}
	
	@DeleteMapping(value="pokemon/{id}", produces=MediaType.APPLICATION_JSON_VALUE)
	public void eliminarPokemon(@PathVariable("id") int id) {
		service.eliminarPokemon(id);
	}
	
	@GetMapping(value="pokemons/{tipo}", produces=MediaType.APPLICATION_JSON_VALUE)
	public List<Pokemon> seleccionTipos(@PathVariable("tipo") String tipo) {
		return service.seleccionTipos(tipo);
	}
}
