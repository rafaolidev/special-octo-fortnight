package views;

import controllers.Tri├ónguloController;
import models.Triangulo;

public class ListarTri├óngulo {
	
	public static void renderizar(){
	
	System.out.println("\n".repeat(10));
	System.out.println("---Triangulos Cadastrados---\n");
	for (Triangulo trianguloCadastrado : Tri├ónguloController.retornarTriangulo() ) {
		System.out.println(trianguloCadastrado);
		
	}
}
}
