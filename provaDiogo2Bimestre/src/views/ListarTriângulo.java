package views;

import controllers.TriânguloController;
import models.Triangulo;

public class ListarTriângulo {
	
	public static void renderizar(){
	
	System.out.println("\n".repeat(10));
	System.out.println("---Triangulos Cadastrados---\n");
	for (Triangulo trianguloCadastrado : TriânguloController.retornarTriangulo() ) {
		System.out.println(trianguloCadastrado);
		
	}
}
}
