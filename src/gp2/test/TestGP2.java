package gp2.test;

import static org.junit.Assert.*;

import java.util.LinkedList;
import java.util.Random;

import org.junit.Test;


import gp2.EjerciciosGP2;

/*
 * 
 */
public class TestGP2 {
	
	private static Random rnd = new Random();
	
	private LinkedList<Integer> asList(int... arreglo) {
		LinkedList<Integer> retval = new LinkedList<>();
		for (int valor: arreglo) {
			retval.add(valor);
		}
		return retval;
	}

	private static int [] asArray(int... arreglo) {
		int[] retval = new int  [arreglo.length];
		for (int i =0 ; i< arreglo.length ; i++) {
			retval[i] = arreglo[i];
		}
		return retval;
	}
	
	private static String [] asArray(String... arreglo) {
		String [] retval = new String [arreglo.length];
		for (int i =0 ; i< arreglo.length ; i++) {
			retval[i] = arreglo[i];
		}
		return retval;
	}

	@Test
	public void testSuma() {
		assertEquals(0, EjerciciosGP2.suma(-1, 1));
		assertEquals(0, EjerciciosGP2.suma(0, 0));
		assertEquals(2, EjerciciosGP2.suma(1, 1));
		assertEquals(8, EjerciciosGP2.suma(5, 3));
	}

	@Test
	public void testCantidadDias() {
		assertEquals(31, EjerciciosGP2.cantidadDias(1));
		assertEquals(28, EjerciciosGP2.cantidadDias(2));
		assertEquals(31, EjerciciosGP2.cantidadDias(3));
		assertEquals(30, EjerciciosGP2.cantidadDias(4));
		assertEquals(31, EjerciciosGP2.cantidadDias(5));
		assertEquals(30, EjerciciosGP2.cantidadDias(6));
		assertEquals(31, EjerciciosGP2.cantidadDias(7));
		assertEquals(31, EjerciciosGP2.cantidadDias(8));
		assertEquals(30, EjerciciosGP2.cantidadDias(9));
		assertEquals(31, EjerciciosGP2.cantidadDias(10));
		assertEquals(30, EjerciciosGP2.cantidadDias(11));
		assertEquals(31, EjerciciosGP2.cantidadDias(12));
	}
	
	@Test
	public void testMaximo() {
		assertEquals(0, EjerciciosGP2.maximo(0, 0), 0.0);
		assertEquals(0, EjerciciosGP2.maximo(0, 0, 0, 0, 0));
		
		assertEquals(8.0, EjerciciosGP2.maximo(8.0, 8.0), 0.0);
		assertEquals(8.0, EjerciciosGP2.maximo(8.0, 8.0, 8.0), 0.0);
		assertEquals(8.2, EjerciciosGP2.maximo(8.1, 8.2, 8.0), 0.0);
		assertEquals(8.3, EjerciciosGP2.maximo(8.23, 8.2, 8.3), 0.0);
		assertEquals(8.23, EjerciciosGP2.maximo(8.23, 8.2, 8.21), 0.0);
		assertEquals(7, EjerciciosGP2.maximo(7, -7, 0), 0.0);
		assertEquals(-1, EjerciciosGP2.maximo(-1, -1, -7.0), 0.0);
		assertEquals(Double.MAX_VALUE, EjerciciosGP2.maximo(Double.MAX_VALUE, Double.MIN_VALUE), 0.0);
		
		assertEquals(12, EjerciciosGP2.maximo(7, -7, 0, 12));
		assertEquals(12, EjerciciosGP2.maximo(7, -7, 12, 1));
		assertEquals(12, EjerciciosGP2.maximo(7, 12, 0, 1));
		assertEquals(12, EjerciciosGP2.maximo(12, -12, 0, 1));
		assertEquals(12, EjerciciosGP2.maximo(-12, 12, 0, 1));
		assertEquals(12, EjerciciosGP2.maximo(12, 12, 12, 12));
		assertEquals(-1, EjerciciosGP2.maximo(-7, -2, -6, -1));
		assertEquals(Integer.MIN_VALUE + 3, EjerciciosGP2.maximo(Integer.MIN_VALUE, Integer.MIN_VALUE +2 , Integer.MIN_VALUE +3 , Integer.MIN_VALUE));

		
		assertEquals(12, EjerciciosGP2.maximo(asList( 7, -7, 0, 12)));
		assertEquals(12, EjerciciosGP2.maximo(asList(7, -7, 12, 1)));
		assertEquals(12, EjerciciosGP2.maximo(asList(7, 12, 0, 1)));
		assertEquals(12, EjerciciosGP2.maximo(asList(12, -12, 0, 1)));
		assertEquals(12, EjerciciosGP2.maximo(asList(-12, 12, 0, 1)));
		assertEquals(12, EjerciciosGP2.maximo(asList(12, 12, 12, 12)));
		assertEquals(Integer.MIN_VALUE + 3, EjerciciosGP2.maximo(asList(Integer.MIN_VALUE, Integer.MIN_VALUE +2 , Integer.MIN_VALUE +3 , Integer.MIN_VALUE)));
		
	}
	
	@Test
	public void testValorAbsoluto() {
		assertEquals(2f, EjerciciosGP2.valorAbsoluto(-2f), 0.0f);
		assertEquals(2f, EjerciciosGP2.valorAbsoluto(2f), 0.0f);
		assertEquals(0f, EjerciciosGP2.valorAbsoluto(0f), 0.0f);
		
		float x = rnd.nextFloat();
		assertEquals(Math.abs(x), EjerciciosGP2.valorAbsoluto(x), 0.0f);
				
	}
	
	@Test
	public void testEsPar() {
		assertFalse(EjerciciosGP2.esPar(1));
		assertFalse(EjerciciosGP2.esPar(9));
		assertTrue(EjerciciosGP2.esPar(0));
		assertTrue(EjerciciosGP2.esPar(8));
		assertTrue(EjerciciosGP2.esPar(-500));
		
	}

	
	
	
	@Test
	public void testEsBisiseto() {
		
		assertTrue(EjerciciosGP2.esBisiesto(1904));
		assertTrue(EjerciciosGP2.esBisiesto(2000));
		assertFalse(EjerciciosGP2.esBisiesto(1900));
		assertFalse(EjerciciosGP2.esBisiesto(1993));
		assertTrue(EjerciciosGP2.esBisiesto(1992));
		
	}
	
	
	@Test
	public void testEsPalindromo() {
		assertFalse(EjerciciosGP2.esPalindromo("Neuquen"));
		assertTrue(EjerciciosGP2.esPalindromo("a"));
		assertTrue(EjerciciosGP2.esPalindromo("4512154"));
		assertTrue(EjerciciosGP2.esPalindromo("abba"));
	}

	@Test
	public void testFahrenheitToCelsius() {
		assertEquals( 232.77, EjerciciosGP2.fahrenheitToCelsius( 451.00f), 0.1);
		assertEquals(-273.15, EjerciciosGP2.fahrenheitToCelsius(-459.67f), 0.1);
		assertEquals( -34.44, EjerciciosGP2.fahrenheitToCelsius( -30.00f), 0.1);
		assertEquals( -23.33, EjerciciosGP2.fahrenheitToCelsius( -10.00f), 0.1);
		assertEquals( -17.78, EjerciciosGP2.fahrenheitToCelsius(   0.00f), 0.1);
		assertEquals(  87.78, EjerciciosGP2.fahrenheitToCelsius( 190.00f), 0.1);
		assertEquals( 537.78, EjerciciosGP2.fahrenheitToCelsius(1000.00f), 0.1);
	}
	
	@Test
	public void testCelsiusToFahrenheit() {
		assertEquals( -58.0, EjerciciosGP2.celsiusToFahrenheit(-50), 0.1);
		assertEquals(  15.8, EjerciciosGP2.celsiusToFahrenheit( -9), 0.1);
		assertEquals(1832.0, EjerciciosGP2.celsiusToFahrenheit(1000), 0.1);
		
	}
	
	@Test
	public void testDiaSemana() {
		
		assertEquals("lunes", EjerciciosGP2.diaSemana(1));
		assertEquals("martes", EjerciciosGP2.diaSemana(2));
		assertEquals("miercoles", EjerciciosGP2.diaSemana(3));
		assertEquals("jueves", EjerciciosGP2.diaSemana(4));
		assertEquals("viernes", EjerciciosGP2.diaSemana(5));
		assertEquals("sabado", EjerciciosGP2.diaSemana(6));
		assertEquals("domingo", EjerciciosGP2.diaSemana(7));
	}
	
	@Test
	public void testSumaAcumulada() {
		assertEquals(     0, EjerciciosGP2.sumaAcumulada(-8));
		assertEquals(     3, EjerciciosGP2.sumaAcumulada(2));
		assertEquals(   378, EjerciciosGP2.sumaAcumulada(27));
		assertEquals(335790, EjerciciosGP2.sumaAcumulada(819));
	}
	
	@Test
	public void testFactorial() {
		assertEquals(      1, EjerciciosGP2.factorial( 0));
		assertEquals(      1, EjerciciosGP2.factorial( 0));
		assertEquals(      2, EjerciciosGP2.factorial( 2));
		assertEquals(3628800, EjerciciosGP2.factorial(10));
	}

	@Test
	public void testEsPrimo() {
		assertFalse(EjerciciosGP2.esPrimo(1));
		assertTrue(EjerciciosGP2.esPrimo(2));
		assertTrue(EjerciciosGP2.esPrimo(3));
		assertFalse(EjerciciosGP2.esPrimo(4));
		assertTrue(EjerciciosGP2.esPrimo(5));
		assertFalse(EjerciciosGP2.esPrimo(6));
		assertTrue(EjerciciosGP2.esPrimo(7));
		assertFalse(EjerciciosGP2.esPrimo(8));
		assertTrue(EjerciciosGP2.esPrimo(61));
		assertFalse(EjerciciosGP2.esPrimo(63));
		assertTrue(EjerciciosGP2.esPrimo(79));
		assertFalse(EjerciciosGP2.esPrimo(1000000));
	}
	
	
	@Test
	public void testPromedio(){
		assertEquals(0.2f, EjerciciosGP2.promedio(1,5,6,12, -23), 0.01);
		assertEquals(1f, EjerciciosGP2.promedio(1), 0.01);
		assertEquals(0f, EjerciciosGP2.promedio(0), 0.01);
		assertEquals(6.66f, EjerciciosGP2.promedio(4,7,9), 0.01);
		
		int[] a = {1,5,6,12,-23};
		int[] b = {1};
		int[] c = {0}; 
		int[] d = {4,7,9};
		
		assertEquals(0.2f, EjerciciosGP2.promedio(a), 0.01);
		assertEquals(1f, EjerciciosGP2.promedio(b), 0.01);
		assertEquals(0f, EjerciciosGP2.promedio(c), 0.01);
		assertEquals(6.66f, EjerciciosGP2.promedio(d), 0.01);
		
		assertEquals(0.2f, EjerciciosGP2.promedio(asList(a)), 0.01);
		assertEquals(1f, EjerciciosGP2.promedio(asList(b)), 0.01);
		assertEquals(0f, EjerciciosGP2.promedio(asList(c)), 0.01);
		assertEquals(6.66f, EjerciciosGP2.promedio(asList(d)), 0.01);
		
		
	}
	
	@Test
	public void testOrdenar() {
		assertArrayEquals(asArray(1,2,3), EjerciciosGP2.ordenar(asArray(1,2,3)) );
		assertArrayEquals(asArray(1,2,3), EjerciciosGP2.ordenar(asArray(3, 2, 1)) );
		assertArrayEquals(asArray(1), EjerciciosGP2.ordenar(asArray(1)) );
		assertArrayEquals(asArray(1,2,2,2,3), EjerciciosGP2.ordenar(asArray(2,1,2,3, 2)));
	}
	
	@Test
	public void testHayTaTeTi() {
		char [][] caso1 = {{' ',' ',' '},
				           {' ',' ',' '},
				           {' ',' ',' '}};
		char [][] caso2 = {{'x','o','o'},
				           {'o','x','x'},
				           {'o','o','x'}};
		
		char [][] caso3 = {{'o','o','x'},
           		           {'o','x','o'},
           		           {'o','o','x'}};
		
		char [][] caso4 = {{'o','o','x'},
		           		   {'x','x','o'},
		           		   {'o','o','x'}};
		assertFalse(EjerciciosGP2.hayTaTeTi(caso1));
		assertTrue(EjerciciosGP2.hayTaTeTi(caso2));
		assertTrue(EjerciciosGP2.hayTaTeTi(caso3));
		assertFalse(EjerciciosGP2.hayTaTeTi(caso4));
	}
	
	@Test
	public void testDecimalABinario() {
		assertEquals("0", EjerciciosGP2.decimalABinario(0));
		assertEquals("111", EjerciciosGP2.decimalABinario(7));
		assertEquals("1000", EjerciciosGP2.decimalABinario(8));
		assertEquals("10111", EjerciciosGP2.decimalABinario(23));
		assertEquals("110001110001111", EjerciciosGP2.decimalABinario(25487));
	}
	
	@Test
	public void testBinarioADecimal() {
		assertEquals(0, EjerciciosGP2.binarioADecimal("0"));
		assertEquals(7, EjerciciosGP2.binarioADecimal("111"));
		assertEquals(8, EjerciciosGP2.binarioADecimal("1000"));
		assertEquals(23, EjerciciosGP2.binarioADecimal("10111"));
		assertEquals(25487, EjerciciosGP2.binarioADecimal("110001110001111"));
	}
	
	
	@Test
	public void testQuitarRepetidos() {
		LinkedList<String> caso1 = new LinkedList<>();
		caso1.add("A");
		caso1.add("A");
		caso1.add("A");
		caso1.add("A");
		
		LinkedList<String> caso1test = new LinkedList<>();
		caso1test.add("A");
		
		LinkedList<String> caso2 = new LinkedList<>();
		caso2.add("A");
		caso2.add("B");
		caso2.add("A");
		caso2.add("B");
		
		LinkedList<String> caso2test = new LinkedList<>();
		caso2test.add("A");
		caso2test.add("B");

		LinkedList<String> caso3 = new LinkedList<>();
		caso3.add("A");
		caso3.add("B");
		caso3.add("A");
		caso3.add("B");
		caso3.add("C");
		
		LinkedList<String> caso3test = new LinkedList<>();
		caso3test.add("A");
		caso3test.add("B");
		caso3test.add("C");

		
		assertEquals(caso1test, EjerciciosGP2.quitarRepetidos(caso1));
		assertEquals(caso2test, EjerciciosGP2.quitarRepetidos(caso2));
		assertEquals(caso3test, EjerciciosGP2.quitarRepetidos(caso3));
		
		
		assertArrayEquals(asArray("A"), EjerciciosGP2.quitarRepetidos(asArray("A","A","A","A")));
		assertArrayEquals(asArray("A", "B"), EjerciciosGP2.quitarRepetidos(asArray("A","B","A","B")));
		assertArrayEquals(asArray("A", "B", "C"), EjerciciosGP2.quitarRepetidos(asArray("A","B","A","B","C","C")));		
	}
	
	@Test
	public void testConcatenar() {
		String [] vacio = new String[0];
		assertArrayEquals(vacio, EjerciciosGP2.concatenar(vacio, vacio));
		assertArrayEquals(asArray("A"), EjerciciosGP2.concatenar(vacio, asArray("A")));
		assertArrayEquals(asArray("A"), EjerciciosGP2.concatenar(asArray("A"), vacio));
		assertArrayEquals(asArray("A", "B"), EjerciciosGP2.concatenar(asArray("A"), asArray("B")));
		assertArrayEquals(asArray("A", "B", "C", "D", "E"), EjerciciosGP2.concatenar(asArray("A", "B"), asArray("C", "D", "E")));
	}
	
	@Test
	public void testInvertir() {
		assertArrayEquals(asArray(1,2,3,4,5), EjerciciosGP2.invertir(asArray(5,4,3,2,1)) );
		assertArrayEquals(asArray(1,2,3,4), EjerciciosGP2.invertir(asArray(4,3,2,1)) );
		assertArrayEquals(asArray(1), EjerciciosGP2.invertir(asArray(1)) );
		assertArrayEquals(asArray(4,5,6,7,8,9), EjerciciosGP2.invertir(asArray(9,8,7,6,5,4)));
	}
	
	@Test
	public void testSucesionFibonacci() {
		assertArrayEquals(asArray(1), EjerciciosGP2.sucesionFibonacci(1));
		assertArrayEquals(asArray(1,1), EjerciciosGP2.sucesionFibonacci(2));
		assertArrayEquals(asArray(1,1,2), EjerciciosGP2.sucesionFibonacci(3));
		assertArrayEquals(asArray(1,1,2,3,5,8,13,21,34,55), EjerciciosGP2.sucesionFibonacci(10));
		
	}
	@Test
	public void testCifradoCesar() {
		assertEquals( "bcde", EjerciciosGP2.cifradoCesar("abcd"));
		assertEquals( "bcdefghijklmnopqrstuvwxyza", EjerciciosGP2.cifradoCesar("abcdefghijklmnopqrstuvwxyz"));
		assertEquals( "bcdefghij klmnopqrstuvwxyza", EjerciciosGP2.cifradoCesar("abcdefghi jklmnopqrstuvwxyz"));
		assertEquals( "ep exeuyi", EjerciciosGP2.cifradoCesar("al ataque", 4));
		assertEquals( "kwzhm kitijihi", EjerciciosGP2.cifradoCesar("corte calabaza", 8));
	}
	@Test
	public void testEsSimetrica() {
		int[][] caso1=
			{
					{1}
			};
		
		int[][] caso2=
			{
					{ 1, 2},
					{ 2, 3}
			};

		int[][] caso3=
			{
					{ 1, 2},
					{ 0, 1}
			};

		int[][] caso4=
			{
					{ 1, 0, 0, 1},
					{ 0, 2, 0, 2},
					{ 0, 0, 3, 0},
					{ 1, 2, 0, 4}
			};

		int[][] caso5=
			{
					{ 1, 0, 0, 1},
					{ 0, 2, 0, 2},
					{ 0, 0, 3, 0},
					{ 1, 0, 0, 4}
			};

		assertTrue  (EjerciciosGP2.esSimetrica(caso1));
		assertTrue  (EjerciciosGP2.esSimetrica(caso2));
		assertFalse (EjerciciosGP2.esSimetrica(caso3));
		assertTrue  (EjerciciosGP2.esSimetrica(caso4));
		assertFalse (EjerciciosGP2.esSimetrica(caso5));
		
	}	
	
	@Test
	public void testEsPerfecto() {
		assertFalse (EjerciciosGP2.esPerfecto(1));
		assertTrue  (EjerciciosGP2.esPerfecto(2));
		assertFalse (EjerciciosGP2.esPerfecto(3));
		assertTrue  (EjerciciosGP2.esPerfecto(6));
		assertTrue  (EjerciciosGP2.esPerfecto(28));
		assertFalse (EjerciciosGP2.esPerfecto(29));
		assertTrue  (EjerciciosGP2.esPerfecto(496));
		assertFalse (EjerciciosGP2.esPerfecto(500));
		assertTrue  (EjerciciosGP2.esPerfecto(8128));
	}
	
	@Test
	public void testTrasponer() {
		int[][] caso1=
			{
					{ 1, 2, 3, 4},
					{ 5, 6, 7, 8},
					{ 9,10,11,12},
					{13,14,15,16}
			};
		
		int[][] caso1o=
			{
					{ 1, 2, 3, 4},
					{ 5, 6, 7, 8},
					{ 9,10,11,12},
					{13,14,15,16}
			};

		int[][] caso1t=
			{
					{ 1, 5, 9,13},
					{ 2, 6,10,14},
					{ 3, 7,11,15},
					{ 4, 8,12,16}
			};


		assertArrayEquals(caso1t, EjerciciosGP2.trasponer(caso1));
		assertArrayEquals(caso1o, EjerciciosGP2.trasponer(caso1));
		
		int[][] caso2= {{1}};
		int[][] caso2t= {{1}};
		assertArrayEquals(caso2t, EjerciciosGP2.trasponer(caso2));
		assertArrayEquals(caso2t, EjerciciosGP2.trasponer(caso2));
		
	}	
	

	@Test
	public void testTrianguloPascal() {
		int[][] caso1 =
			{
					{1},
					{1,1},
					{1,2,1},
					{1,3,3,1},
					{1,4,6,4,1},
					{1,5,10,10,5,1},
					{1,6,15,20,15,6,1},
					{1,7,21,35,35,21,7,1}
			};
		assertArrayEquals(caso1, EjerciciosGP2.trinaguloPascal(8));
	}
	
	
}
