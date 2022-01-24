import java.util.Scanner;

/**
 * 
 */

/**
 * @author Fran Garrido
 *
 */
public class Matrices {
	public static void  pedir_matriz(int m[][]) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Cuantas filas quieres?: ");
		int filas = entrada.nextInt();
		System.out.println("Cuantas columnas quieres?: ");
		int cols = entrada.nextInt();
		m = new int[filas][cols];
		for (int i = 0; i < filas; i++) {
			for (int j = 0; j < cols; j++) {
				System.out.printf("Introduce el valor (%d, %d): ", i,j);
			m[i][j]=entrada.nextInt();
			}
			}
		entrada.close();
		}
	
	public static void  mostrar_matriz(int m[][]) {
		System.out.println("La matriz introducida es: ");
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[0].length; j++) {
				System.out.printf("%5d ", m[i][j]);
			}
		System.out.println();
		}
	}
	public static void  pedir_matriz(float m[][]) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Cuantas filas quieres?: ");
		int filas = entrada.nextInt();
		System.out.println("Cuantas columnas quieres?: ");
		int cols = entrada.nextInt();
		m = new float[filas][cols];
		for (int i = 0; i < filas; i++) {
			for (int j = 0; j < cols; j++) {
				System.out.printf("Introduce el valor (%d,%d): ", i,j);
			m[i][j]=entrada.nextInt();
			}
		}
		entrada.close();
		}
	
	public static void  mostrar_matriz(float m[][]) {
		System.out.println("La matriz introducida es: ");
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[0].length; j++) {
				System.out.printf("%2.f ", m[i][j]);
			}
		System.out.println();
		}
	}
}

