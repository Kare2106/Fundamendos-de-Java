import java.util.Scanner;

public class NumeroParImpar {

	public static void main(String[] args) {
		
		int numero;
		
		System.out.println("Leer número: ");
		Scanner in = new Scanner(System.in);
        numero = in.nextInt();
		// sout
        
        if(numero%2==0) {
			System.out.println("El número " + numero + " es par");
		} else {
			System.out.println("El número " + numero + " es impar");
		}
		
		//String result = "" + numero;
		//result = Integer.toString(numero);

	}
	

}
