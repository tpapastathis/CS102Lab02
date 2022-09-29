package bu;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class MainClass {

	public static void main(String[] args) {
		LinkedList myLL = new LinkedList();
		myLL.add(5);
		myLL.add(-5);
		myLL.add(20);
		myLL.add("Saba");
		myLL.add(2.8);
		
		System.out.println(myLL);
		myLL.remove();
		System.out.println(myLL);
		
		Queue<String> myQ = new LinkedList(); // Queue is FIFO
		myQ.add("green");
		myQ.add("yellow");
		myQ.add("blue");
		myQ.add("pink");
		myQ.add("grey");
		
		System.out.println(myQ);
		myQ.poll();
		System.out.println(myQ);
		myQ.poll();
		System.out.println(myQ);

		Stack<String> myStack = new Stack<String>();
		
		myStack.push("green");
		myStack.push("yellow");
		myStack.push("blue");
		myStack.push("pink");
		myStack.push("grey");
		
		System.out.println(myStack);
		myStack.pop();
		System.out.println(myStack);
		myStack.pop();
		System.out.println(myStack);
	}

}
