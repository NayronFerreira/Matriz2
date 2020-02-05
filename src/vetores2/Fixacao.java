package vetores2;

import java.util.Scanner;

public class Fixacao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		System.out.println("Informe a quantidade de linhas da matriz: ");
		int a = leia.nextInt();
		System.out.println("Informe a quantidade de colunhas da matriz: ");
		int b = leia.nextInt();

		int mat[][] = new int[a][b];

		for (int cc = 0; cc < mat.length; cc++) {
			for (int dd = 0; dd < mat[cc].length; dd++) {
				mat[cc][dd] = leia.nextInt();
			}
		}

		System.out.println("Informe um número da matriz: ");
		int x = leia.nextInt();
		for (int cc = 0; cc < mat.length; cc++) {
			for (int dd = 0; dd < mat[cc].length; dd++) {
				if (mat[cc][dd] == x) {
					System.out.println("Posição: " + cc + ", " + dd);

					if (cc > 0) {
						System.out.println("O número de cima é: " + mat[cc - 1][dd]);
					}
					if (dd > 0) {
						System.out.println("O número da esquerda é o: " + mat[cc][dd - 1]);
					}
					if (cc < mat.length-1) {
						System.out.println("O número de baixo é o: " + mat[cc + 1][dd]);
					}
					if (dd < mat[cc].length-1) {
						System.out.println("O número da direita é o: " + mat[cc][dd + 1]);
					}
				}
			}

		}

		leia.close();
	}

}
