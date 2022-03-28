public class stack1p1 {
	  public static void main(String[] args) {
	        stack1 stack = new stack1();

	        for (int i = 0; i < 10; i++)
	            stack.push(i);

	        while (!stack.empty())
	            System.out.print(stack.pop() + " ");
	    }
}
