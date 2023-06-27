package application;

import java.util.ArrayList;
import java.util.List;

public class Program {

	public static void main(String[] args) {
		
		System.out.println("\nGenerics s�o invariantes.\n"
				+ "List<Object> n�o � um supertipo de qualquer tipo de lista.\n"
				+ "List<?> � o supertipo de qualquet tipo de List. Funciona como um tipo curinga.\n");
		
		List<Object> listOfObjects = new ArrayList<Object>();
		List<Integer> listOfInteger = new ArrayList<Integer>(); // Integer � um subtipo de Object
		//listOfObjects = listOfInteger; // compilation error; 
		
		// todo Integer � uma subclasse de Object, mas isso n�o se aplica para Cole��es
		Object objeto = 10;
		Integer inteiro = (Integer) objeto;
		objeto = inteiro; 
		
		
		List<?> listOfGenerics = new ArrayList<Object>();
		listOfGenerics = listOfInteger; // ok, no compitation problem
	}

}
