package Assignments;

import java.util.Scanner;

public class atmpinusingwhileloop {
public static void main(String[] args) {
	int correctPIN = 1234;
	 Scanner k=new Scanner(System.in);
	 System.out.println(" Enter your  4 digit ATM Pin");
	 int enteredPIN = k .nextInt();
	 while (enteredPIN != correctPIN) {
		 System.out.println("You have enetered a incorrect pin, please try again");
		 enteredPIN = k .nextInt();
	 }
	 System.out.println("welcome to XYZ Bank");
}
}
