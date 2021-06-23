package views;

import java.util.Scanner;

import controllers.TriânguloController;
import models.Triangulo;

public class CadastrarTriângulo {
	private static Scanner sc = new Scanner(System.in);
	private static Triangulo triangulo;
	
	public static void renderizar() {
		triangulo = new Triangulo(0, 0);
		System.out.println("---Cadastro de Triangulos---\n");
		System.out.println("Digite a Altura do Triangulo");
		triangulo.setAltura(sc.nextInt());
		System.out.println("Digite a base do Triangulo");
		triangulo.setBase(sc.nextInt());
		if(TriânguloController.cadastrar(triangulo)) {
			System.out.println("Triangulo Cadastrado com Sucesso");
		}else {
		System.out.println("Cadastro já existe!");
	}
  }
	public static Triangulo getTriangulo() {
		return triangulo;
	}
}

