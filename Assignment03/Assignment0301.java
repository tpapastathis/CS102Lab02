package edu.bradley;

public class Assignment0301 {

	public static void main(String[] args) {
		String myString = "Saba";
		String myString2 = "John";
		
		boolean diffChar = true;
		
		for(int i = 0; i<myString.length(); i++) {
			for(int j = i+1; j<myString.length(); j++) {
				if(myString.charAt(i)==myString.charAt(j)) {
					diffChar = false;
					break;
				}
			}
		}
		System.out.println(diffChar);
		
		diffChar = true;
		for(int i = 0; i<myString2.length(); i++) {
			for(int j = i+1; j<myString2.length(); j++) {
				if(myString2.charAt(i)==myString2.charAt(j)) {
					diffChar = false;
					break;
				}
			}
		}
		System.out.println(diffChar);

	}

}
