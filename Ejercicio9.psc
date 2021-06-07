Algoritmo Ejercicio9
	
	Escribir "Ingrese la temperatura 1"
	leer temp1
	
	Mientras temp1 !=0 Hacer
		
		Si temp1 >= 5 & temp1 <= 15 Entonces
			ContadorT1 = ContadorT1 + 1
		SiNo
		Fin Si
		Escribir " Ingrese la temperatura 2 "
		leer temp2
		
		Si temp2 >= 5 & temp2 <= 15 Entonces
			ContadorT2 = ContadorT2 + 1
			promedio = (temp1+temp2)/ContadorT1 + ContadorT2
			
			Escribir  " El promedio de las temperaturas ingresadas entre 5° y 15° es de " , promedio
		SiNo
		Fin Si
		
		
	Fin Mientras
	
FinAlgoritmo
