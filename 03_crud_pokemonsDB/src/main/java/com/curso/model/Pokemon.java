package com.curso.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="pokemons")
public class Pokemon {
	
	@Id
	private int id;
	private String nombre;
	private String tipo;
	private int vida;
	
	
	public Pokemon() {

	}
	
	public Pokemon(int id, String nombre, String tipo, int vida) {
		this.id = id;
		this.nombre = nombre;
		this.tipo = tipo;
		this.vida = vida;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getVida() {
		return vida;
	}

	public void setVida(int vida) {
		this.vida = vida;
	}

	
}
