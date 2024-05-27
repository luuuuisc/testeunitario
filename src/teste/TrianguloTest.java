package teste;

import static org.junit.jupiter.api.Assertions.assertEquals;


import org.junit.Test;

import entities.Triangulo;
public class TrianguloTest{
	
	@Test
	public void tipoTrianguloShouldReturnEquilateroWhenAllSidesAreEqual() {
		
		int sideA = 2, sideB = 2, sideC = 2;
		String result = Triangulo.tipoTriangulo(sideA, sideB, sideC);
		assertEquals("Equilátero", result);
	}
	
	@Test
	public void tipoTrianguloShouldReturnIsocelesWhenOnlyTwoSidesAreEqual() {
		assertIsosceles(3, 3, 4);
		assertIsosceles(3, 4, 3);
		assertIsosceles(4, 3, 3);
	}
	
	private void assertIsosceles(int a, int b, int c) {
		assertEquals("Isósceles", Triangulo.tipoTriangulo(a, b, c));
	}
	
	@Test
	public void tipoTrianguloShouldReturnEscalenoWhenNoSidesAreEqual() {
		int sideA = 2, sideB = 3, sideC = 4;
		String result = Triangulo.tipoTriangulo(sideA, sideB, sideC);
		assertEquals("Escaleno", result);
	}
	
	
	
	
	public void tipoTrianguloShouldReportErrorWhenAnySideIsZero() {
	    int sideB = 1, sideC = 1;

	    assertTriangleSidesMustBeGreaterThanZero(0, sideB, sideC);
	    assertTriangleSidesMustBeGreaterThanZero(sideB, 0, sideC);
	    assertTriangleSidesMustBeGreaterThanZero(sideB, sideC, 0);
	}

	private void assertTriangleSidesMustBeGreaterThanZero(int a, int b, int c) {
	    assertEquals("Todos os lados devem ser maiores que zero.", Triangulo.tipoTriangulo(a, b, c));
	}
	
	 @Test
	    public void tipoTrianguloShouldReportErrorWhenSidesDoNotFormTriangle() {
	        // Arrange and Act
	        assertEquals("A soma de dois lados deve ser maior que o terceiro lado.", Triangulo.tipoTriangulo(1, 1, 3));
	        assertEquals("A soma de dois lados deve ser maior que o terceiro lado.", Triangulo.tipoTriangulo(1, 3, 1));
	        assertEquals("A soma de dois lados deve ser maior que o terceiro lado.", Triangulo.tipoTriangulo(3, 1, 1));
	
	
	 }
}

