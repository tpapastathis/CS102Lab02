package edu.bradley;

public class Assignment0303 {

	public static void main(String[] args) {
		 String text = "hello everyone. let's write some useful Java code today. we will begin with strings.";
		 
		 int period = (int) '.';
		 
		 String result = "";
		 
		 result+=(char) (text.charAt(0)-32);
		 
		 for(int i=1; i<text.length(); i++) {
			 result+=text.charAt(i);
			 if(text.charAt(i) == '.' && i+2<text.length()-1) {
				 result+=text.charAt(i+1);
				 result+= (char) (text.charAt(i+2)-32);
				 i+=2;
			 }
		 }
		 System.out.println(result);
	}

}
