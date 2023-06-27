package application;

import java.util.ArrayList;
import java.util.List;

public class Program {

	public static void main(String[] args) {
		
		System.out.println("\nGenerics são invariantes.\n"
				+ "List<Object> não é um supertipo de qualquer tipo de lista.\n"
				+ "List<?> é o supertipo de qualquet tipo de List. Funciona como um tipo curinga.\n");
		
		List<Object> listOfObjects = new ArrayList<Object>();
		List<Integer> listOfInteger = new ArrayList<Integer>(); // Integer é um subtipo de Object
		//listOfObjects = listOfInteger; // compilation error; 
		
		// todo Integer é uma subclasse de Object, mas isso não se aplica para Coleções
		Object objeto = 10;
		Integer inteiro = (Integer) objeto;
		objeto = inteiro; 
		
		
		List<?> listOfGenerics = new ArrayList<Object>();
		listOfGenerics = listOfInteger; // ok, no compitation problem
	}

}
