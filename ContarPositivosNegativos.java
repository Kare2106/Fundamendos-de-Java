
public class ContarPositivosNegativos {

	public static void main(String[] args) {
		
		int[] numeros = new int[10];{	
				numeros [0] = 0;
				numeros [1] = -10;
				numeros [2] = 6;
				numeros [3] = 40;
				numeros [4] = 12;
				numeros [5] = -15;
				numeros [6] = 1;
				numeros [7] = 5;
				numeros [8] = -3;
				numeros [9] = 18;
				
	};
	
		System.out.println(numeros.length);
		int ceros = 0;
		int positivos= 0;
		int negativos= 0;
		int sumapositivos = 0;
		int sumanegativos = 0;
		
		for(int i = 0; i<numeros.length;i++){
			if(numeros[i]==0) 
				ceros++;
			
			else if(numeros[i] > 0) {
				positivos++;
			    sumapositivos += numeros[i];
			}else {
				negativos++;
				sumanegativos += numeros[i];
			         }
		}
		System.out.println("Total de ceros: " + ceros);
		System.out.println("Total de positivos: " + positivos);
		System.out.println("El total de negativos: " + negativos);
		System.out.println("Total suma de positivos: " + sumapositivos);
		System.out.println("Total suma de negativos: " + sumanegativos);

				
			}
		
		
	}


