package ar.edu.unlam.dominio;

public class Calculadora {

	public Calculadora() {
	
	}

	public Integer sumar(Integer numero1, Integer numero2) {
		Integer resultado = numero1 + numero2;
		return resultado;
	}

	public Integer restar(Integer numero1, Integer numero2) {
		Integer resultado = numero1 - numero2;
		return resultado;
	}

	public Integer multiplicar(Integer numero1, Integer numero2) {
		Integer resultado = numero1 * numero2;
		return resultado;
	}
	
	// Dividir dos numeros enteros. El divisor no puede ser 0 (cero). Si asi fuera,
			// se debe devolver 0 (cero).
	public Integer dividir(Integer numero1, Integer numero2) {
		if (numero2 ==0) {
			return 0;
		} else {
			Integer resultado = numero1 / numero2;
			return resultado;
		}
	}
}
