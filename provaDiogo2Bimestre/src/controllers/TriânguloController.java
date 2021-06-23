package controllers;

import java.util.ArrayList;
import models.Triangulo;

public class TriânguloController {
	
	private static ArrayList<Triangulo> triangulos = new ArrayList<Triangulo>();
	
	public static boolean cadastrar(Triangulo triangulo) {		
				return triangulos.add(triangulo);
	}
	public static ArrayList<Triangulo> retornarTriangulo(){
		return triangulos;
	}
}

