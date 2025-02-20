package teste;

import java.util.Scanner;

public class teste {
	public static void main(String args[]) {
		int x;
		int y;
		Scanner scanner = new Scanner(System.in);
		
		x = scanner.nextInt();
		y = scanner.nextInt();
		
		System.out.println("a soma eh: " + (x+y));

		scanner.close();
	}

}
