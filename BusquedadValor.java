import java.util.Scanner;

public class BusquedadValor {

	public static void main(String[] args) {
		
		int numero;
		
		Scanner in = new Scanner(System.in);
		System.out.println("Leer Numero: ");
		numero = in.nextInt();
		
		int[] numeros = new int[5];
		
		numeros [0] = 1;
		numeros [1] = 10;
		numeros [2] = 100;
		numeros [3] = 1000;
		numeros [4] = 10000;
		
		int posición = -1;
		for(int i = 0; i<numeros.length; i++) {
			if(numero == numeros[i]) {
				posición = 1;
				
	
			}
		}
	}
	
	
}


