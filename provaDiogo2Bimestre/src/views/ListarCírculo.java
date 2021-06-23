package views;

import controllers.CírculoController;
import models.Círculo;

public class ListarCírculo {
	
	public static void renderizar(){
	
	System.out.println("\n".repeat(10));
	System.out.println("---Círculos Cadastrados---\n");
	for (Círculo círculoCadastrado : CírculoController.retornarCírculo() ) {
		System.out.println(círculoCadastrado);
		
	}
}
}
