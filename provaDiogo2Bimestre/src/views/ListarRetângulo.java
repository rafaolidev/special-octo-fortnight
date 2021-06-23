package views;

import controllers.RetânguloController;
import models.Retângulo;

public class ListarRetângulo {
	
	public static void renderizar(){
	
	System.out.println("\n".repeat(10));
	System.out.println("---Retângulos Cadastrados---\n");
	for (Retângulo retânguloCadastrado : RetânguloController.retornarRetângulos() ) {
		System.out.println(retânguloCadastrado);
		
	}
}
}

