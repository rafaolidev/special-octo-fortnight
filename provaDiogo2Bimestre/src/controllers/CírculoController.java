package controllers;

import java.util.ArrayList;
import models.Círculo;

public class CírculoController {
	
	private static ArrayList<Círculo> círculos = new ArrayList<Círculo>();
	
	public static boolean cadastrar(Círculo círculo) {		
				return círculos.add(círculo);
	}
	public static ArrayList<Círculo> retornarCírculo(){
		return círculos;
	}
}
