import java.util.Scanner;

public class Ejercicio9{


	public static void main(String [] args){


		Double promedio = 0.0;
		Double totalTemp =0.0;
		int contador =0;
		Double tm1=0.0,tm2=0.0;

		Scanner sc = new Scanner(System.in);
	
			

		System.out.println("Ingresa la temperatura 1");
		 tm1= sc.nextDouble();
		 totalTemp =tm1;
		 	

		 if (tm1 !=0) {

		
	
			 while (tm1!=0) {

			 	contador++;
			 	
				
					System.out.println("Ingresa la temperatura 2");
					tm2= sc.nextDouble();	
					totalTemp = totalTemp + tm2;
					
	
	
					

					System.out.println("Ingresa la temperatura 1");
					tm1= sc.nextDouble();
					totalTemp = totalTemp + tm1;
					

			}
		
			promedio = totalTemp/contador;


			System.out.println("El promedio de las temperaturas es: " + promedio);
		 	
		 }

		
		 else{
		 	System.out.println("Ingresa una temperatura distinta de 0");
		 }


	}


} 