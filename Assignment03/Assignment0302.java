package edu.bradley;

public class Assignment0302 {
	public static void main(String[] args) {
		String myString = "madam";
		String myString2 = "test";
		
		boolean isNotPalindrome = true;
		
		for(int i=0; i<(myString.length()/2+1); i++) {
			if(myString.charAt(i)!=myString.charAt(myString.length()-1-i)) {
				isNotPalindrome = false;
				break;
			}
		}
		System.out.println(isNotPalindrome);
		
		isNotPalindrome = true;
		for(int i=0; i<(myString2.length()/2+1); i++) {
			if(myString2.charAt(i)!=myString2.charAt(myString2.length()-1-i)) {
				isNotPalindrome = false;
				break;
			}
		}
		System.out.println(isNotPalindrome);
	
	}
	

}
