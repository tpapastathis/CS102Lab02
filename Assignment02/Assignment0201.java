package edu.bradley;

public class Assignment0201 {

	public static void main(String[] args) {
		/*array0: [1,5,-5,2,12,30] 
    	array1: [-10,50,15,2]*/
		
		int[] array0 = {1, 5, -5, 2, 12, 30};
		int[] array1 = {-10, 50, 15, 2};
		
		int tempValue = 0;
		String values = "common_elements:[";
		boolean found = false;
		
		for(int i = 0; i<array0.length; i++) {
			for(int j = 0; j<array1.length; j++) {
				if(array0[i]==array1[j]) {
					
					found = true;
				}
				
			
		}
		if(found) {
			values+=array0[i]+" ";
			found = false;
		}
	}
		values=values.substring(0,values.length()-1);
		values+="]";
		System.out.println(values);
}
}
