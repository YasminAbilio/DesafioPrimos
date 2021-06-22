package Desafios;

public class Primos {
	
	public static void main (String args[]) {
		
		int i, j;
		int cont, cont2=0;
		
		System.out.println("Primos: ");
		
		for (i = 1; i < 10001 ; i++) {
			
			cont=0;
			for ( j = 1 ; j < 10001; j++) {
				
				if ( i % j == 0 ) {
					cont++;
				}
			}
			if (cont == 2) {
				System.out.println(i);	
				cont2++;
			}
		}
		System.out.println("\n\nTotal: " + cont2);
	}
}







