package views;

import java.util.Scanner;

import controllers.RetânguloController;
import models.Retângulo;

public class CadastrarRetângulo {
	private static Scanner sc = new Scanner(System.in);
	private static Retângulo retângulo;
	
	public static void renderizar() {
		retângulo = new Retângulo();
		System.out.println("---Cadastro de Retângulos---\n");
		System.out.println("Digite a Altura do Retângulo");
		retângulo.setAltura(sc.nextInt());
		System.out.println("Digite a Largura do Retângulo");
		retângulo.setLargura(sc.nextInt());
		if(RetânguloController.cadastrar(retângulo)) {
			System.out.println("Retângulo Cadastrado com Sucesso");
		}else {
		System.out.println("Cadastro já existe!");
	}
  }
	public static Retângulo getRetangulo() {
		return retângulo;
	}
}
