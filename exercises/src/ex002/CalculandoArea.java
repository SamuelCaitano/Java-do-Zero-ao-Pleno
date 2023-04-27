package ex002;

/* Calcule a área de um determinado raio
 * FORMULA : area = raio * raio * pi;
 */

public class CalculandoArea {

	public static void main(String[] args) {
		final float pi = 3.14f;  
		float raio = 29;
		
        float area = raio * raio * pi;

        int areaInt = (int) area;

        System.out.println("Resultado = " + area);
        System.out.println("Resultado Inteiro = " + areaInt); 
	}
}