package application;

import java.util.Arrays;
import java.util.List;

public class ProgramEquivalent {

	public static void main(String[] args) {
		
		System.out.println("Não é possível adicionar elementos a uma coleção do tipo curinga.\n"
				+ "O compilador não sabe qual tipo de lista foi instanciada.\n");
		
		List<Double> myDoubleList = Arrays.asList(2.56, 5.19, 9.80, 15.29);
		//myDoubleList.add(4.16);
		print(myDoubleList);
		
		System.out.println("\n");
		
		List<String> namesList = Arrays.asList("Hawking", "Turing","Euller", "Newton");
		//namesList.add("Maxwell");
		print(namesList);

	}
	
	public static void print (List<?> list) {
		for(Object object : list) {
			System.out.println(object);
		}
	}

}
