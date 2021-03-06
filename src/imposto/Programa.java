package imposto;

import java.util.Locale;
import java.util.Scanner;

public class Programa {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double sal, serv, cap, med, edu, impSal, impServ, impCap, totImp, restImp, abat,  gastDedu, maxDedu;
		impSal = impServ = impCap = 0.0;
		
		System.out.print("Renda anual com sal�rio: ");
		sal = sc.nextDouble();
		System.out.print("Renda anual com presta��o de servi�o: ");
		serv = sc.nextDouble();
		System.out.print("Renda anual com ganho de capital: ");
		cap = sc.nextDouble();
		System.out.print("Gastos m�dicos: ");
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
		System.out.println("RELAT�RIO DE IMPOSTO DE RENDA");
		System.out.println("");
		System.out.println("CONSOLIDADO DE RENDA:");
		System.out.printf("Imposto sobre sal�rio: %.2f%n", impSal);
		System.out.printf("Imposto sobre servi�os: %.2f%n", impServ);
		System.out.printf("Imposto sobre ganho de capital: %.2f%n", impCap);
		
		gastDedu = med + edu;
		totImp = impSal + impServ + impCap;
		maxDedu = totImp * 0.3;
		
		System.out.println("");
		System.out.println("DEDU��ES:");
		System.out.printf("M�ximo dedut�vel: %.2f%n", maxDedu);
		System.out.printf("Gastos dedut�veis: %.2f%n", gastDedu);
		
		if(gastDedu >= maxDedu) {
			restImp = totImp - maxDedu;
			abat = maxDedu;
		} else {
			restImp = totImp - gastDedu;
			abat = gastDedu;
		}
		
		System.out.println("");
		System.out.println("RESUMO:");
		System.out.printf("Imposto bruto total: %.2f%n", totImp);
		System.out.printf("Abatimento: %.2f%n", abat);
		System.out.printf("Imposto devido: %.2f%n", restImp);
			
		sc.close();
	}
}
