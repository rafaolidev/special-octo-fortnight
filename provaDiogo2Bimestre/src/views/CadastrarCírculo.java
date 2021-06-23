package views;

import java.util.Scanner;

import controllers.CírculoController;
import models.Círculo;

public class CadastrarCírculo {
	private static Scanner sc = new Scanner(System.in);
	private static Círculo círculo;
	
	public static void renderizar() {
		círculo = new Círculo(0);
		System.out.println("---Cadastro de Círculos---\n");
		System.out.println("Digite a Area do Círculo");
		círculo.setArea(sc.nextInt());
		if(CírculoController.cadastrar(círculo)) {
			System.out.println("Círculo Cadastrado com Sucesso");
		}else {
		System.out.println("Cadastro já existe!");
	}
  }
	public static Círculo getCírculo() {
		return círculo;
	}
}

