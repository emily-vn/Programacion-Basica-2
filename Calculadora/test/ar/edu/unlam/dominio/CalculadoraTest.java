package ar.edu.unlam.dominio;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class CalculadoraTest {

	@Test
	public void dadosDosNumerosSeObtieneLaSuma() {
		Integer numero1 = 2;
		Integer numero2 = 3;
		
		Calculadora calculadora = new Calculadora();
		Integer numeroObtenido = calculadora.sumar(numero1,numero2);
		
		Integer numeroEsperado = 5;
		assertEquals(numeroObtenido,numeroEsperado);
	}
	
	@Test
	public void dadosDosNumerosSeObtieneLaResta() {
		Integer numero1 = 3;
		Integer numero2 = 2;
		
		Calculadora calculadora = new Calculadora();
		Integer numeroObtenido = calculadora.restar(numero1,numero2);
		
		Integer numeroEsperado = 1;
		assertEquals(numeroObtenido,numeroEsperado);
	}
	
	@Test
	public void dadosDosNumerosSeObtieneLaMultiplicacion() {
		Integer numero1 = 3;
		Integer numero2 = 2;
		
		Calculadora calculadora = new Calculadora();
		Integer numeroObtenido = calculadora.multiplicar(numero1,numero2);
		
		Integer numeroEsperado = 6;
		assertEquals(numeroObtenido,numeroEsperado);
	}
	
	@Test
	public void dadosDosNumerosSiElDivisorNoEs0SeObtieneLaDivision() {
		Integer numero1 = 6;
		Integer numero2 = 2;
		
		Calculadora calculadora = new Calculadora();
		Integer numeroObtenido = calculadora.dividir(numero1,numero2);
		
		Integer numeroEsperado = 3;
		assertEquals(numeroObtenido,numeroEsperado);
	}
	
	@Test
	public void dadosDosNumerosSiElDivisorEs0SeObtiene0() {
		Integer numero1 = 6;
		Integer numero2 = 0;
		
		Calculadora calculadora = new Calculadora();
		Integer numeroObtenido = calculadora.dividir(numero1,numero2);
		
		Integer numeroEsperado = 0;
		assertEquals(numeroObtenido,numeroEsperado);
	}
}
