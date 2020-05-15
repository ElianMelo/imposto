package imposto;

import java.util.Locale;
import java.util.Scanner;

public class Programa {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double sal, serv, cap, med, edu;
		
		System.out.print("Renda anual com salário: ");
		sal = sc.nextDouble();
		System.out.print("Renda anual com prestação de serviço: ");
		serv = sc.nextDouble();
		System.out.print("Renda anual com ganho de capital: ");
		cap = sc.nextDouble();
		System.out.print("Gastos médicos: ");
		med = sc.nextDouble();
		System.out.print("Gastos educacionais: ");
		edu = sc.nextDouble();
		
		sc.close();
	}
}
