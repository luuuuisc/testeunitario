package teste;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.Test;
import entities.Triangulo;

public class TrianguloTest {
	
	@Test
	public void tipoTrianguloShouldReturnEquilateroWhenAllSidesAreEqual() {	
		int sideA = 2, sideB = 2, sideC = 2;
		String result = Triangulo.tipoTriangulo(sideA, sideB, sideC);
		assertEquals("Equilátero", result);
	}
	
	@Test
	public void tipoTrianguloShouldReturnIsocelesWhenOnlyTwoSidesAreEqual() {
		exchangeIsosceles(3, 3, 4);
		exchangeIsosceles(3, 4, 3);
		exchangeIsosceles(4, 3, 3);
	}
	
	
	@Test
	public void tipoTrianguloShouldReturnEscalenoWhenNoSidesAreEqual() {
		int sideA = 2, sideB = 3, sideC = 4;
		String result = Triangulo.tipoTriangulo(sideA, sideB, sideC);
		assertEquals("Escaleno", result);
	}
	
	
	@Test
	public void tipoTrianguloShouldReportErrorWhenSidesDoNotFormTriangle() {
		assertEquals("A soma de dois lados deve ser maior que o terceiro lado.", Triangulo.tipoTriangulo(1, 1, 3));
		assertEquals("A soma de dois lados deve ser maior que o terceiro lado.", Triangulo.tipoTriangulo(1, 3, 1));
		assertEquals("A soma de dois lados deve ser maior que o terceiro lado.", Triangulo.tipoTriangulo(3, 1, 1));
	
	}
	 
	private void exchangeIsosceles(int a, int b, int c) {
		assertEquals("Isósceles", Triangulo.tipoTriangulo(a, b, c));
	}
	 
	
	private void exchangeTriangleSidesMustBeGreaterThanZero(int a, int b, int c) {
		assertEquals("Todos os lados devem ser maiores que zero.", Triangulo.tipoTriangulo(a, b, c));
	}
	 
	 
	public void exchangetipoTrianguloShouldReportErrorWhenAnySideIsZeroOrNegative() {
		int sideB = 1, sideC = 1;

		exchangeTriangleSidesMustBeGreaterThanZero(0, sideB, sideC);
		exchangeTriangleSidesMustBeGreaterThanZero(sideB, 0, sideC);
		exchangeTriangleSidesMustBeGreaterThanZero(sideB, sideC, 0);
	}
}

