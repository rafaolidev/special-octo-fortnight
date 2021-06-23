package views;
import java.util.Scanner;

public class Principal {
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {		
		int opcao;
		do {			
			System.out.println("\n-- CADASTRO DE FORMAS --  ");
			System.out.println("\n1 - Cadastrar Retângulo");
			System.out.println("2 - Cadastrar Triângulo");
			System.out.println("3 - Consultar Cículo");
			System.out.println("4 - listar todas Formas");
			System.out.println("5 - listar Retângulo");
			System.out.println("6 - listar Triângulo");
			System.out.println("7 - listar Cículo");
			System.out.println("8 SAIR");
			System.out.println("\nDigite a opção desejada: ");
			opcao = sc.nextInt();
			switch (opcao) {
			case 1:	
				CadastrarRetângulo.renderizar();
				break;
			case 2:	
				CadastrarTriângulo.renderizar();
				break;
			case 3:	
				CadastrarCírculo.renderizar();
				break;
			case 4:	
				ListarRetângulo.renderizar();
				ListarTriângulo.renderizar();
				ListarCírculo.renderizar();
				break;
            case 5:	
				
				break;
            case 6:	
	
	            break;
            case 7:	
	
	             break;
			case 8:	
				System.out.println("\nSaindo...");			
				break;
			default:
				System.out.println("\nOp��o inv�lida!");
				break;
			}
		} while (opcao != 8);	
	}
}