package AtividadePoo;

import java.util.ArrayList;
import java.util.Scanner;

public class EstacionamentoPrincipal {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		ArrayList<carro> Carros = new ArrayList();
		boolean rodando = true;
		while (rodando) {

			System.out.println("Escolha uma opcao\n"+
							   "1 --> Cadastrar o carro\n"+
							   "2 --> Consultar carros cadastrados\n"+
							   "3 --> Excluir carro\n" + "4 --> Atualizar carro\n"+
							   "5 --> Estacionar o carro\n"+
							   "6 --> Excluir carro estacionado\n"+
							   "7 --> Consultar carro estacionado\n"+
							   "8 --> Sair");
			int opc = entrada.nextInt();

			switch (opc) {
			case 1:
				System.out.println("===== CADASTRAR CARRO =====\n");
				System.out.println("Quantos carros que voce deseja cadastrar?");
				int qtd = entrada.nextInt();

				for (int i = 0; i < qtd; i++) {

					System.out.println("Informa a cor do carro");
					String cor = entrada.next();
					System.out.println("Informa a placa");
					String Placa = entrada.next();
					System.out.println("Qual é a velocidade maxima do carro ?");
					String VelocidadeMaxima = entrada.next();
					carro C1 = new carro(cor, Placa, VelocidadeMaxima);
					Carros.add(C1);
				}
				break;
			case 2:
				System.out.println("===== CONSULTAR CARRO CADASTRADO =====\n");
				for (int i = 0; i < Carros.size(); i++) {

					System.out.println("O " + (i + 1) + " carro cadastrado no sistema" + Carros.get(i).toString());
				}
				break;
			case 3:
				System.out.println("===== EXCLUIR CARRO =====\n");
				for (int i = 0; i < Carros.size(); i++) {
					System.out.println("[" + (i + 1) + "]" + Carros.get(i).toString());
				}

				System.out.println("Qual carro que voce quer excluir");
				int escolha = entrada.nextInt();

				Carros.remove(escolha);

				break;
			case 4:
				System.out.println("===== ATUALIZAR CARRO =====\n");
				for (int i = 0; i < Carros.size(); i++) {
					System.out.println("[" + (i + 1) + "]" + Carros.get(i).toString());
				}
				System.out.println("Qual e o carro que voce que procurar ?");
				String procurarCarro = entrada.next();

				break;
			case 5:
				System.out.println("===== ESTACIONAR CARROS =====\n");
				for (int i = 0; i < Carros.size(); i++) {
					System.out.println("[" + (i + 1) + "]" + Carros.get(i).toString());
				}
				ArrayList<carro> CarroEstacionado = new ArrayList();
				System.out.println("Qual carro que voce deseja estacionar ?");
				int estacionar = entrada.nextInt();

				for(int i = 0; i < CarroEstacionado.size(); i++) {
					System.out.println("Carro estacionado");
				}
				
				break;
			case 6:
				System.out.println("===== EXCLUIR CARRO ESTACIONAR =====\n");
				for (int i = 0; i < Carros.size(); i++) {

					System.out.println("O " + (i + 1) + " carro estacionado" + Carros.get(i).toString());
				}
				System.out.println("Escolha o carro que deseja ser excluido");
					int excluir = entrada.nextInt();
					
				Carros.remove(excluir);
				break;
			case 7:
				System.out.println("===== SAIR =====\n");
				rodando = false;
				break;
			}
		}
	}
}