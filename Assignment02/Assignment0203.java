package edu.bradley;

public class Assignment0203 {

	public static void main(String[] args) {
		char[] array = {'s', 'a', 'b', 'a'};
		char[] output = new char[4];
		
		int counter = 0;
		
		for(int i = array.length-1; i >= 0; i--) {
			output[counter]=array[i];
			counter++;
		}
		System.out.print("Result: [");
		for(int i = 0; i<output.length; i++) {
			if(i==output.length-1) {
				System.out.print("'"+output[i]+"'");
			}
			else System.out.print("'"+output[i]+"',");
		}
		System.out.print("]");
	}

}
