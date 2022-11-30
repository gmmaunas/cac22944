package trabajointegrador;

/*Desarrollar un programa que visualice repetidamente un menú por pantalla donde se puedan
seleccionar distintas operaciones a realizar:
	1. Suma
	2. Resta
	3. Multiplicación
	4. División
	5. Resto
	6. ¿Es par/impar?
	7. Máximo
	8. Mínimo
	9. Salir*/

public class Integrador {

	public static void main(String[] args) {
		

	}
	
	static double suma(double[] lista) {
		double resultadoSuma = 0;
		
		for (int i = 0; i < lista.length; i++) {
			resultadoSuma = resultadoSuma + lista[i];
		}
		
		return resultadoSuma;
	}
	
	static double resta(double valorUno, double valorDos) {
				
		return valorUno - valorDos;
	}
	
	static double multiplicacion(double valorUno, double valorDos) {
		
		return valorUno * valorDos;
	}

	static double division(double valorUno, double valorDos) {
		
		return valorUno / valorDos;
	}
	
	static double resto(double dividendo, double divisor) {
		return dividendo % divisor;
	}
	
	//true -> par
	//false -> impar
	//4/2 -> 2 resto 0
	//5/2 - 2 resto 1
	static boolean parOImpar(double valor) {
		//el valor lo divido por 2 y si el resto es = a 0 (cero
		//me permite afirmar que el valor es par
		//por ello retorno un true (un verdadero) afirmando que es par
		if (resto(valor,2) == 0) {
			return true;
		}
		//por defecto el valor recibido es impar
		//salvo que se cumpla la condici'on (evaluada en el if)
		return false;
	}
		
	static double esElMax(double valorUno, double valorDos) {
				
		return Math.max(valorUno, valorDos);
	}
	
	static double esElMin(double valorUno, double valorDos) {
		
		return Math.min(valorUno, valorDos);
	}

}
