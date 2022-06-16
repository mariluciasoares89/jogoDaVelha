package jogoVelha;

import java.util.Scanner;

public class JogoDaVelha {

	public static void main(String[] args) {
		Tabuleiro t = new Tabuleiro();
		int jogadorAtual = 0;
		String[] simbolos = { "o", "x" };
		int l, c;

		while (t.verificaGanhador().equals("N")) {
			System.out.println("Jogador atual:" + simbolos[jogadorAtual] + "---");
			System.out.print("Digite a linha a ser jogada: ");
			l = new Scanner(System.in).nextInt();

			System.out.print("Digite a coluna a ser jogada: ");
			c = new Scanner(System.in).nextInt();

			if (!t.setSimbolo(l, c, simbolos[jogadorAtual])) {
				System.out.println("Jogada inválida!");
				continue;
			}

			System.out.println(t);

			if (jogadorAtual == 0) {
				jogadorAtual = 1;
			} else {
				jogadorAtual = 0;
			}

		}

		// Indica o ganhador;
		System.out.println("Ganhador:" + t.verificaGanhador());

	}
}
