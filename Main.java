import java.util.Locale;
import java.util.Scanner;

public class Main {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		double conta = 50.0;
		int minutos;
		
		System.out.println("QUANTOS MINUTOS USADOS?");
			minutos = sc.nextInt();
		
		if(minutos > 100) {
			conta = conta + (minutos - 100) * 2;
		}
		System.out.printf("R$ %.2f%n", conta);	
			
		sc.close();
	}
}
