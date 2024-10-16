package com.unu.proyectoWebGB.model;
import java.util.ArrayList;
import java.util.List;

import com.unu.proyectoWebGB.beans.Autor;

public class AutoresModel {
	public List<Autor> listarAutores(){
		
		ArrayList<Autor> autores = new ArrayList<>();
		
		autores.add(new Autor(1, "Daniel Soria", " Peruana"));
		autores.add(new Autor(2, "Pedro Soria", " Boliviano"));
		autores.add(new Autor(3, "Daniel Soria", " Chileno"));
		
		return autores;
		
		
	}

}
