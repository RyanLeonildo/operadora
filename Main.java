import java.util.Scanner;

public class Main {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		int minutos ,minutos1 = 0, total;
		
		System.out.println("QUANTOS MINUTOS USADOS?");
			minutos = sc.nextInt();
	
		if (minutos <= 100) {
			System.out.println("R$ 50,00");
		}else {
			 minutos1 = (minutos - 100)*2;
		}
		
			total = minutos1 + 50;
			System.out.printf("R$ " + total);
		
		sc.close();
	}
}
