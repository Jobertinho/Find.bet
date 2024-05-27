import java.util.Random;
import java.util.Scanner;

public class ado3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String azul = "\u001B[34m";
		String ciano = "\u001B[36m";
		regras(scan);
		System.out.println("Escolha uma opção");
		System.out.println("1 - Jogador X Jogador \n2 - Jogador X Máquina");
		System.out.print(azul);
		int jogador = scan.nextInt();
		System.out.print(ciano);
		while (jogador != 1 && jogador != 2) {
			System.err.println("Opção inválida! Digite o número 1 ou 2");
			System.out.print(azul);
			jogador = scan.nextInt();
			System.out.print(ciano);
		}
		switch (jogador) {
		case 1:
			jogadorXjogador(scan);
			break;
		case 2:
			jogadorXmaquina(scan);
			break;
		}
		scan.close();
	}

	public static void jogadorXjogador(Scanner scan2) {
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		int tentativa = 0;
		int jogadores = 0;
		double aposta1 = 0;
		double aposta2 = 0;
		int numTentativa = 1;
		int[] numEscolhidos = new int[50];
		int escolhas = 0;
		String corVermelho = "\u001B[31m";
		String corVerde = "\u001B[32m";
		String amarelo = "\u001B[33m";
		String azul = "\u001B[34m";
		String ciano = "\u001B[36m";
		System.out.println("Como devemos te chamar jogador 1?");
		System.out.print(azul);
		String nome1 = scan.next();
		System.out.print(ciano);
		System.out.println("Como devemos te chamar jogador 2?");
		System.out.print(azul);
		String nome2 = scan.next();
		System.out.print(ciano);
		System.out.printf("Informe o valor de sua aposta %s:\n", nome1);
		System.out.print(azul);
		aposta1 = scan.nextDouble();
		System.out.print(ciano);
		while (aposta1 < 0.05) {
			System.out.print(corVermelho);
			System.out.println("Valor inválido! Aposte um valor acima de R$0,05");
			System.out.print(azul);
			aposta1 = scan.nextDouble();
			System.out.print(ciano);
		}
		System.out.printf("Informe o valor de sua aposta %s:\n", nome2);
		System.out.print(azul);
		aposta2 = scan.nextDouble();
		System.out.print(ciano);
		while (aposta2 < aposta1) {
			System.out.print(corVermelho);
			System.out.printf("Valor inválido! Aposte um valor igual ou acima do apostado pelo(a) jogador(a) %s\n",nome1);
			System.out.print(azul);
			aposta2 = scan.nextDouble();
			System.out.print(ciano);
		}
		System.out.println("Vamos começar!");
		int numSorteado = rand.nextInt(49) + 1;
		System.out.println(numSorteado);
		int[] numeros = new int[50];
		for (int i = 0; i < 50; i++) {
			numeros[i] = i + 1;
		}
		System.out.println("Escolha um número:");
		System.out.print(amarelo);
		for (int hashtag = 0; hashtag <= 60; hashtag++) {
			if (hashtag == 0) {
				System.out.print("╔");
			} else if (hashtag == 60) {
				System.out.print("╗");
			} else if (hashtag == 6 || hashtag == 12 || hashtag == 18 || hashtag == 24 || hashtag == 30 || hashtag == 36 || hashtag == 42 || hashtag == 48 || hashtag == 54) {
				System.out.print("╦");
			} else {
			System.out.print("═");
			}
		}
		System.out.println();
		System.out.printf(
				"║ %d   ║ %d   ║ %d   ║ %d   ║ %d   ║ %d   ║ %d   ║ %d   ║ %d   ║ %d  ║\n"
						+ "╠═════╬═════╬═════╬═════╬═════╬═════╬═════╬═════╬═════╬═════╣"
						+ "\n║ %d  ║ %d  ║ %d  ║ %d  ║ %d  ║ %d  ║ %d  ║ %d  ║ %d  ║ %d  ║\n"
						+ "╠═════╬═════╬═════╬═════╬═════╬═════╬═════╬═════╬═════╬═════╣"
						+ "\n║ %d  ║ %d  ║ %d  ║ %d  ║ %d  ║ %d  ║ %d  ║ %d  ║ %d  ║ %d  ║\n"
						+ "╠═════╬═════╬═════╬═════╬═════╬═════╬═════╬═════╬═════╬═════╣"
						+ "\n║ %d  ║ %d  ║ %d  ║ %d  ║ %d  ║ %d  ║ %d  ║ %d  ║ %d  ║ %d  ║\n"
						+ "╠═════╬═════╬═════╬═════╬═════╬═════╬═════╬═════╬═════╬═════╣"
						+ "\n║ %d  ║ %d  ║ %d  ║ %d  ║ %d  ║ %d  ║ %d  ║ %d  ║ %d  ║ %d  ║\n",
				numeros[0], numeros[1], numeros[2], numeros[3], numeros[4], numeros[5], numeros[6], numeros[7],
				numeros[8], numeros[9], numeros[10], numeros[11], numeros[12], numeros[13], numeros[14], numeros[15],
				numeros[16], numeros[17], numeros[18], numeros[19], numeros[20], numeros[21], numeros[22], numeros[23],
				numeros[24], numeros[25], numeros[26], numeros[27], numeros[28], numeros[29], numeros[30], numeros[31],
				numeros[32], numeros[33], numeros[34], numeros[35], numeros[36], numeros[37], numeros[38], numeros[39],
				numeros[40], numeros[41], numeros[42], numeros[43], numeros[44], numeros[45], numeros[46], numeros[47],
				numeros[48], numeros[49]);
		for (int hashtag = 0; hashtag <= 60; hashtag++) {
			if (hashtag == 0) {
				System.out.print("╚");
			} else if (hashtag == 60) {
				System.out.print("╝");
			} else if (hashtag == 6 || hashtag == 12 || hashtag == 18 || hashtag == 24 || hashtag == 30 || hashtag == 36 || hashtag == 42 || hashtag == 48 || hashtag == 54) {
				System.out.print("╩");
			} else {
			System.out.print("═");
			}
		}
		System.out.println();
		System.out.print(ciano);
		do {
			if (jogadores % 2 == 0) {
				System.out.printf("Jogador 1 : %s\n", nome1);
				jogadores++;
			} else {
				System.out.printf("Jogador 2 : %s\n", nome2);
				jogadores++;
			}
			System.out.println("Digite sua tentativa: ");
			System.out.print(azul);
			tentativa = scan.nextInt();
			System.out.print(ciano);
			boolean numRepetido = false;
			for (int i = 0; i < escolhas; i++) {
				if (numEscolhidos[i] == tentativa) {
					numRepetido = true;
					break;
				}
			}
			if (numRepetido) {
				System.out.print(corVermelho);
				System.out.println("Este  número já foi escolhido");
				System.out.print(ciano);
				jogadores++;
			} else {
				numEscolhidos[escolhas] = tentativa;
				escolhas++;
			}
			if (tentativa >= 1 && tentativa <= 50) {
				if (tentativa == numSorteado) {
					System.out.print(corVerde);
					System.out.printf("O número sorteado foi: %d\n", numSorteado);
					if (jogadores % 2 == 0) {
						System.out.printf("Parabéns %s, você acertou o número e ganhou!\n", nome2);
					} else {
						System.out.printf("Parabéns %s, você acertou o número e ganhou!\n", nome1);
					}
					if (numTentativa <= 2) {
						double ganho = (aposta1 + aposta2) * 2;
						System.out.printf("Seu prêmio é R$%.2f\n", ganho);
					} else if (numTentativa > 2 && numTentativa <= 10) {
						double ganho = aposta1 + aposta2;
						System.out.printf("Seu prêmio é R$%.2f\n", ganho);
					} else if (numTentativa > 10 && numTentativa <= 30) {
						double ganho = (aposta1 + aposta2) - ((aposta1 + aposta2) * 0.05);
						System.out.printf("Seu prêmio é R$%.2f\n", ganho);
					} else if (numTentativa > 30 && numTentativa <= 49) {
						double ganho = (aposta1 + aposta2) - ((aposta1 + aposta2) * 0.1);
						System.out.printf("Seu prêmio é R$%.2f\n", ganho);
					} else {
						double ganho = (aposta1 + aposta2) - ((aposta1 + aposta2) * 0.5);
						System.out.printf("Seu prêmio é R$%.2f\n", ganho);
					}
					System.out.print(ciano);
				} else {
					for (int a = 0; a < 50; a++) {
						if (numeros[a] == tentativa) {
							numeros[a] = 0;
							break;
						}
					}
					System.out.print(corVermelho);
					System.out.println("Tente novamente.");
					System.out.print(amarelo);
					numTentativa++;
					for (int hashtag = 0; hashtag < 61; hashtag++) {
						if (hashtag == 0) {
							System.out.print("╔");
						} else if (hashtag == 60) {
							System.out.print("╗");
						} else if (hashtag == 6 || hashtag == 12 || hashtag == 18 || hashtag == 24 || hashtag == 30 || hashtag == 36 || hashtag == 42 || hashtag == 48 || hashtag == 54) {
							System.out.print("╦");
						} else {
						System.out.print("═");
						}
					}
					System.out.println();
					System.out.printf(
							"║ %-3s ║ %-3s ║ %-3s ║ %-3s ║ %-3s ║ %-3s ║ %-3s ║ %-3s ║ %-3s ║ %-3s ║\n"
									+ "╠═════╬═════╬═════╬═════╬═════╬═════╬═════╬═════╬═════╬═════╣"
									+ "\n║ %-3s ║ %-3s ║ %-3s ║ %-3s ║ %-3s ║ %-3s ║ %-3s ║ %-3s ║ %-3s ║ %-3s ║\n"
									+ "╠═════╬═════╬═════╬═════╬═════╬═════╬═════╬═════╬═════╬═════╣"
									+ "\n║ %-3s ║ %-3s ║ %-3s ║ %-3s ║ %-3s ║ %-3s ║ %-3s ║ %-3s ║ %-3s ║ %-3s ║\n"
									+ "╠═════╬═════╬═════╬═════╬═════╬═════╬═════╬═════╬═════╬═════╣"
									+ "\n║ %-3s ║ %-3s ║ %-3s ║ %-3s ║ %-3s ║ %-3s ║ %-3s ║ %-3s ║ %-3s ║ %-3s ║\n"
									+ "╠═════╬═════╬═════╬═════╬═════╬═════╬═════╬═════╬═════╬═════╣"
									+ "\n║ %-3s ║ %-3s ║ %-3s ║ %-3s ║ %-3s ║ %-3s ║ %-3s ║ %-3s ║ %-3s ║ %-3s ║\n",
							numeros[0], numeros[1], numeros[2], numeros[3], numeros[4], numeros[5], numeros[6],
							numeros[7], numeros[8], numeros[9], numeros[10], numeros[11], numeros[12], numeros[13],
							numeros[14], numeros[15], numeros[16], numeros[17], numeros[18], numeros[19], numeros[20],
							numeros[21], numeros[22], numeros[23], numeros[24], numeros[25], numeros[26], numeros[27],
							numeros[28], numeros[29], numeros[30], numeros[31], numeros[32], numeros[33], numeros[34],
							numeros[35], numeros[36], numeros[37], numeros[38], numeros[39], numeros[40], numeros[41],
							numeros[42], numeros[43], numeros[44], numeros[45], numeros[46], numeros[47], numeros[48],
							numeros[49]);
					for (int hashtag = 0; hashtag < 61; hashtag++) {
						if (hashtag == 0) {
							System.out.print("╚");
						} else if (hashtag == 60) {
							System.out.print("╝");
						} else if (hashtag == 6 || hashtag == 12 || hashtag == 18 || hashtag == 24 || hashtag == 30 || hashtag == 36 || hashtag == 42 || hashtag == 48 || hashtag == 54) {
							System.out.print("╩");
						} else {
						System.out.print("═");
						}
					}
					System.out.println();
					System.out.print(ciano);
				}
			} else {
				System.out.print(corVermelho);
				System.out.println("Número inválido, tente novamente:");
				System.out.print(ciano);
				jogadores++;
			}
		} while (tentativa != numSorteado);
		scan.close();
	}

	public static void jogadorXmaquina(Scanner scan3) {
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		int numTentativa = 1;
		int[] numEscolhidos = new int[50];
		int escolhas = 0;
		String nome2 = "Máquina";
		String corVermelho = "\u001B[31m";
		String corVerde = "\u001B[32m";
		String amarelo = "\u001B[33m";
		String azul = "\u001B[34m";
		String ciano = "\u001B[36m";
		System.out.println("Como devemos te chamar jogador 1?");
		System.out.print(azul);
		String nome1 = scan.next();
		System.out.print(ciano);
		System.out.printf("Informe o valor de sua aposta %s:\n", nome1);
		System.out.print(azul);
		double aposta = scan.nextDouble();
		System.out.print(ciano);
		while (aposta < 0.05) {
			System.out.print(corVermelho);
			System.out.println("Valor inválido! Aposte um valor acima de R$0,05");
			System.out.print(azul);
			aposta = scan.nextDouble();
			System.out.print(ciano);
		}
		System.out.println("Vamos começar!");
		int numSorteado = rand.nextInt(49) + 1;
		System.out.println(numSorteado);
		int[] numeros = new int[50];
		for (int i = 0; i < 50; i++) {
			numeros[i] = i + 1;
		}
		System.out.println("Escolha um número:");
		System.out.print(amarelo);
		for (int hashtag = 0; hashtag <= 60; hashtag++) {
			if (hashtag == 0) {
				System.out.print("╔");
			} else if (hashtag == 60) {
				System.out.print("╗");
			} else if (hashtag == 6 || hashtag == 12 || hashtag == 18 || hashtag == 24 || hashtag == 30 || hashtag == 36 || hashtag == 42 || hashtag == 48 || hashtag == 54) {
				System.out.print("╦");
			} else {
			System.out.print("═");
			}
		}
		System.out.println();
		System.out.printf(
				"║ %d   ║ %d   ║ %d   ║ %d   ║ %d   ║ %d   ║ %d   ║ %d   ║ %d   ║ %d  ║\n"
						+ "╠═════╬═════╬═════╬═════╬═════╬═════╬═════╬═════╬═════╬═════╣"
						+ "\n║ %d  ║ %d  ║ %d  ║ %d  ║ %d  ║ %d  ║ %d  ║ %d  ║ %d  ║ %d  ║\n"
						+ "╠═════╬═════╬═════╬═════╬═════╬═════╬═════╬═════╬═════╬═════╣"
						+ "\n║ %d  ║ %d  ║ %d  ║ %d  ║ %d  ║ %d  ║ %d  ║ %d  ║ %d  ║ %d  ║\n"
						+ "╠═════╬═════╬═════╬═════╬═════╬═════╬═════╬═════╬═════╬═════╣"
						+ "\n║ %d  ║ %d  ║ %d  ║ %d  ║ %d  ║ %d  ║ %d  ║ %d  ║ %d  ║ %d  ║\n"
						+ "╠═════╬═════╬═════╬═════╬═════╬═════╬═════╬═════╬═════╬═════╣"
						+ "\n║ %d  ║ %d  ║ %d  ║ %d  ║ %d  ║ %d  ║ %d  ║ %d  ║ %d  ║ %d  ║\n",
				numeros[0], numeros[1], numeros[2], numeros[3], numeros[4], numeros[5], numeros[6], numeros[7],
				numeros[8], numeros[9], numeros[10], numeros[11], numeros[12], numeros[13], numeros[14], numeros[15],
				numeros[16], numeros[17], numeros[18], numeros[19], numeros[20], numeros[21], numeros[22], numeros[23],
				numeros[24], numeros[25], numeros[26], numeros[27], numeros[28], numeros[29], numeros[30], numeros[31],
				numeros[32], numeros[33], numeros[34], numeros[35], numeros[36], numeros[37], numeros[38], numeros[39],
				numeros[40], numeros[41], numeros[42], numeros[43], numeros[44], numeros[45], numeros[46], numeros[47],
				numeros[48], numeros[49]);
		for (int hashtag = 0; hashtag <= 60; hashtag++) {
			if (hashtag == 0) {
				System.out.print("╚");
			} else if (hashtag == 60) {
				System.out.print("╝");
			} else if (hashtag == 6 || hashtag == 12 || hashtag == 18 || hashtag == 24 || hashtag == 30 || hashtag == 36 || hashtag == 42 || hashtag == 48 || hashtag == 54) {
				System.out.print("╩");
			} else {
			System.out.print("═");
			}
		}
		System.out.println();
		System.out.print(ciano);
		int tentativa = 0;
		int jogadores = 0;
		do {
			if (jogadores % 2 == 0) {
				System.out.printf("Jogador 1 : %s\n", nome1);
				System.out.println("Digite sua tentativa: ");
				System.out.print(azul);
				tentativa = scan.nextInt();
				System.out.print(ciano);
				jogadores++;
			} else {
				System.out.printf("Jogador 2 : %s\n", nome2);
				tentativa = rand.nextInt(50) + 1;
				System.out.println(tentativa);
				jogadores++;
			}
			boolean numRepetido = false;
			for (int i = 0; i < escolhas; i++) {
				if (numEscolhidos[i] == tentativa) {
					numRepetido = true;
					break;
				}
			}
			if (numRepetido) {
				System.out.print(corVermelho);
				System.out.println("Este  número já foi escolhido");
				System.out.print(ciano);
				jogadores++;
			} else {
				numEscolhidos[escolhas] = tentativa;
				escolhas++;
			}
			if (tentativa >= 1 && tentativa <= 50) {
				if (tentativa == numSorteado) {
					System.out.print(corVerde);
					System.out.printf("O número sorteado foi: %d\n", numSorteado);
					if (jogadores % 2 == 0) {
						System.out.print(corVermelho);
						System.out.printf("Não foi dessa vez, a %s ganhou!\n", nome2);
						System.out.print(ciano);
					} else {
						System.out.printf("Parabéns %s, você acertou o número e ganhou!\n", nome1);
					}
					if (numTentativa % 2 != 0) {
						if (numTentativa == 1) {
							double ganho = (aposta * 2) * 2;
							System.out.printf("O prêmio é R$%.2f\n", ganho);
						} else if (numTentativa > 2 && numTentativa <= 10) {
							double ganho = aposta * 2;
							System.out.printf("O prêmio é R$%.2f\n", ganho);
						} else if (numTentativa > 10 && numTentativa <= 30) {
							double ganho = (aposta * 2) - ((aposta * 2) * 0.05);
							System.out.printf("O prêmio é R$%.2f\n", ganho);
						} else if (numTentativa > 30 && numTentativa <= 48) {
							double ganho = (aposta * 2) - ((aposta * 2) * 0.1);
							System.out.printf("O prêmio é R$%.2f\n", ganho);
						} else {
							double ganho = (aposta * 2) - ((aposta * 2) * 0.5);
							System.out.printf("O prêmio é R$%.2f\n", ganho);
						}
					}
					System.out.print(ciano);
				} else {
					for (int a = 0; a < 50; a++) {
						if (numeros[a] == tentativa) {
							numeros[a] = 0;
							break;
						}
					}
					System.out.print(corVermelho);
					System.out.println("Tente novamente.");
					System.out.print(amarelo);
					numTentativa++;
					for (int hashtag = 0; hashtag < 61; hashtag++) {
						if (hashtag == 0) {
							System.out.print("╔");
						} else if (hashtag == 60) {
							System.out.print("╗");
						} else if (hashtag == 6 || hashtag == 12 || hashtag == 18 || hashtag == 24 || hashtag == 30 || hashtag == 36 || hashtag == 42 || hashtag == 48 || hashtag == 54) {
							System.out.print("╦");
						} else {
						System.out.print("═");
						}
					}
					System.out.println();
					System.out.printf(
							"║ %-3s ║ %-3s ║ %-3s ║ %-3s ║ %-3s ║ %-3s ║ %-3s ║ %-3s ║ %-3s ║ %-3s ║\n"
									+ "╠═════╬═════╬═════╬═════╬═════╬═════╬═════╬═════╬═════╬═════╣"
									+ "\n║ %-3s ║ %-3s ║ %-3s ║ %-3s ║ %-3s ║ %-3s ║ %-3s ║ %-3s ║ %-3s ║ %-3s ║\n"
									+ "╠═════╬═════╬═════╬═════╬═════╬═════╬═════╬═════╬═════╬═════╣"
									+ "\n║ %-3s ║ %-3s ║ %-3s ║ %-3s ║ %-3s ║ %-3s ║ %-3s ║ %-3s ║ %-3s ║ %-3s ║\n"
									+ "╠═════╬═════╬═════╬═════╬═════╬═════╬═════╬═════╬═════╬═════╣"
									+ "\n║ %-3s ║ %-3s ║ %-3s ║ %-3s ║ %-3s ║ %-3s ║ %-3s ║ %-3s ║ %-3s ║ %-3s ║\n"
									+ "╠═════╬═════╬═════╬═════╬═════╬═════╬═════╬═════╬═════╬═════╣"
									+ "\n║ %-3s ║ %-3s ║ %-3s ║ %-3s ║ %-3s ║ %-3s ║ %-3s ║ %-3s ║ %-3s ║ %-3s ║\n",
							numeros[0], numeros[1], numeros[2], numeros[3], numeros[4], numeros[5], numeros[6],
							numeros[7], numeros[8], numeros[9], numeros[10], numeros[11], numeros[12], numeros[13],
							numeros[14], numeros[15], numeros[16], numeros[17], numeros[18], numeros[19], numeros[20],
							numeros[21], numeros[22], numeros[23], numeros[24], numeros[25], numeros[26], numeros[27],
							numeros[28], numeros[29], numeros[30], numeros[31], numeros[32], numeros[33], numeros[34],
							numeros[35], numeros[36], numeros[37], numeros[38], numeros[39], numeros[40], numeros[41],
							numeros[42], numeros[43], numeros[44], numeros[45], numeros[46], numeros[47], numeros[48],
							numeros[49]);
					for (int hashtag = 0; hashtag < 61; hashtag++) {
						if (hashtag == 0) {
							System.out.print("╚");
						} else if (hashtag == 60) {
							System.out.print("╝");
						} else if (hashtag == 6 || hashtag == 12 || hashtag == 18 || hashtag == 24 || hashtag == 30 || hashtag == 36 || hashtag == 42 || hashtag == 48 || hashtag == 54) {
							System.out.print("╩");
						} else {
						System.out.print("═");
						}
					}
					System.out.println();
					System.out.print(ciano);
				}
			} else {
				System.out.print(corVermelho);
				System.out.println("Número inválido, tente novamente:");
				System.out.print(ciano);
				jogadores++;
			}
		} while (tentativa != numSorteado);
		scan.close();
	}

	public static void regras(Scanner scan) {
		String laranja = "\u001B[38;2;255;165;0m";
		String ciano = "\u001B[36m";
		System.out.println(laranja);
		System.out.println("Bem Vindo(a) a Aposta.bet!");
		System.out.println("Regras:");
		System.out.println("Aposta mínima de 5 centavos!");
		System.out.println("O número escolhido será substituído na tabela pelo número 0");
		System.out.println("Não é possível escolher o mesmo número mais de uma vez!");
		System.out.println("Os números válidos para escolha são entre 1 e 50");
		System.out.println("Boa Sorte!");
		System.out.println("O valor obtido final será calculado da seguinte forma:");
		System.out.println("Se o jogador acertar na 1ª tentativa ganhará o dobro da soma da aposta dos dois jogadores");
		System.out.println("Se o jogador acertar entre a 2ª e 10ª tentativa ganhará a soma da aposta dos dois jogadores");
		System.out.println("Se o jogador acertar entre a 11ª e 30ª tentativa ganhará a soma da aposta dos dois jogadores menos 5%");
		System.out.println("Se o jogador acertar entre a 31ª e 49ª tentativa ganhará a soma da aposta dos dois jogadores menos 10%");
		System.out.println("Se o jogador acertar na 50ª tentativa ganhará apenas 50% da soma do valor apostado");
		System.out.println();
		System.out.print(ciano);
	}
}
