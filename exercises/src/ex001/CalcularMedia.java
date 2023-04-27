package ex001;

import java.text.DecimalFormat;

/* Uma empresa te contratou para criar um programa que calcule o preço médio de lucro
 * de um trimestre, no mês de Janeiro a empresa lucrou R$ 45.000,00,
 * em Fevereiro R$ 57.000,00 e em Março R$ 39.000,00
 * fique à vontade para extender e gerar novas funcionalidades ao sistema.
*/

public class CalcularMedia {

	public static void main(String[] args) {
		
		String formato = "R$ #,##0.00";
		DecimalFormat df = new DecimalFormat(formato);
		
	    Double janeiro = 45000d;
	    Double fevereiro = 57000d;
	    Double marco = 39000d;

	    Double lucroTotal =  janeiro + fevereiro + marco;
	    Double media = (janeiro + fevereiro + marco) / 3; 

	    System.out.println("== Sistema de Calculo de Mádia ==\n");
	    System.out.println("Lucro Total: " + df.format(lucroTotal));
	    System.out.println("\nJaneiro: " + df.format(janeiro));
	    System.out.println("Fevereiro: " + df.format(fevereiro));
	    System.out.println("Março: " + df.format(marco));
	    System.out.println("\nMedia dos preços: " + df.format(media));
	  }
}