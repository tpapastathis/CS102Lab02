package edu.bradley;

public class Assignment0202 {

	public static void main(String[] args) {
		int[] array0 = {1,77,-5,2,65,30};
		int[] array1 = {-10,50,15,2,77};
		
		boolean bool0 = test(array0);
		System.out.println("array0: [1,77,-5,2,65,30] => "+bool0);
		boolean bool1 = test(array1);
		System.out.println("array1: [-10,50,15,2,77] => "+bool1);
	}
	public static boolean test(int[] array){
		boolean num65 = false;
		boolean num77 = false;
		for(int i = 0; i<array.length; i++) {
			if(array[i]==65)
				num65 = true;
			if(array[i]==77)
				num77 = true;
		}
		return (num65==true && num77==true);
	}
}
