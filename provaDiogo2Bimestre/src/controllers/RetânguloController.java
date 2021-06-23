package controllers;

import java.util.ArrayList;
import models.Retângulo;

public class RetânguloController {
	
	private static ArrayList<Retângulo> retângulos = new ArrayList<Retângulo>();
	
	public static boolean cadastrar(Retângulo retângulo) {		
				return retângulos.add(retângulo);
	}
	public static ArrayList<Retângulo> retornarRetângulos(){
		return retângulos;
	}
}
