package entities;

public class Triangulo {

	 public static String tipoTriangulo(int a, int b, int c) {
	        
	        try {
	            
	            validarLados(a, b, c);

	            if (a == b && b == c) {
	                return "Equilátero";
	            } else if (a == b || a == c || b == c) {
	                return "Isósceles";
	            } else {
	                return "Escaleno";
	            }
	        } catch (IllegalArgumentException e) {
	            return e.getMessage();
	        }
	    }
	 
	    private static void validarLados(int a, int b, int c) {
	        if (a <= 0 || b <= 0 || c <= 0) {
	            throw new IllegalArgumentException("Todos os lados devem ser maiores que zero.");
	        }
	        if (a + b <= c || a + c <= b || b + c <= a) {
	            throw new IllegalArgumentException("A soma de dois lados deve ser maior que o terceiro lado.");
	        }
	    }
}
