package imposto;

import java.util.Locale;
import java.util.Scanner;

public class Programa {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double sal, serv, cap, med, edu, impSal, impServ, impCap;
		impSal = impServ = impCap = 0.0;
		
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
		
		if(sal < 3000) {
			impSal = 0.0;
		} else if (sal < 5000) {
			impSal = sal * 0.1;
		} else {
			impSal = sal * 0.2;
		}
		
		if(serv > 0) {
			impServ = serv * 0.15;
		}
		
		if(cap > 0) {
			impCap = cap * 0.2;
		}
		
		System.out.println("");
		System.out.println("RELATÓRIO DE IMPOSTO DE RENDA");
		System.out.println("");
		System.out.println("CONSOLIDADO DE RENDA:");
		System.out.printf("Imposto sobre salário: %.2f%n", impSal);
		System.out.printf("Imposto sobre serviços: %.2f%n", impServ);
		System.out.printf("Imposto sobre ganho de capital: %.2f%n", impCap);
		
		sc.close();
	}
}
