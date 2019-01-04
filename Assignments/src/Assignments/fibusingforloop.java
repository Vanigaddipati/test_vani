package Assignments;

public class fibusingforloop {
	public static void main(String[] args) {
		int count=3, num1 = 0, num2 = 1;
		System.out.println("Fib series of "+ count+ "numbers are:");
		for ( int i=1; i<=count; i++) {
			System.out.println(num1+" ");
			int sumofprevtwonumbers=num1+num2;
			num1=num2;
					num2=sumofprevtwonumbers;
			
		}
		
			
		
		
		
		
	}

}
