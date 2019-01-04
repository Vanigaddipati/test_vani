package Assignments;

import java.util.Scanner;

public class fib1 {
	public static void main(String[] args) {
		int count , num1 = 0, num2 = 1;
		System.out.println("How many numbers you want in the sequence");
		Scanner scanner=new Scanner(System.in);
		count=scanner.nextInt();
		scanner.close();
		System.out.println("Fib series of "+ count +" numbers: ");
		
		int i=1;
		while (i<=count)
		{
			System.out.println(num1+" ");
			int sumofprevtwo=num1+num2;
			num1=num2;
			num2=sumofprevtwo;
					i++;
		}
				
			
				
		
		
	}

}

