package loopMap;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
//		Write a program that does the following:
//			Asks the user for 5 numbers
//			Stores them in an array list
//			Finds the sum, product, largest, and smallest of those numbers
		
		
		// initialize an array list
	    ArrayList <Integer> userList = new ArrayList<Integer>();
	    
	    // create a scanner instance
	    Scanner input = new Scanner(System.in);
	    
	    // collect data
	    System.out.println("Pick a number...");
	    int firstNumber = input.nextInt();
	    userList.add(firstNumber);
	    
	    System.out.println("Pick another number...");
	    int secondNumber = input.nextInt();
	    userList.add(secondNumber);
	    
	    System.out.println("Pick another number...");
	    int thirdNumber = input.nextInt();
	    userList.add(thirdNumber);
	    
	    System.out.println("Pick yet another number...");
	    int fourthNumber = input.nextInt();
	    userList.add(fourthNumber);
	    
	    System.out.println("Pick one last number...");
	    int fifthNumber = input.nextInt();
	    userList.add(fifthNumber);
	    
	    input.close();
	    
	    // initialize variables
	    int sum = 0;
	    int product = 1;
	    int min = userList.get(0);
	    int max = userList.get(0);
	    
	    // create an enhanced loop to iterate over array list
	    // perform needed calculations 
	    for(int numbers : userList) {
	    	sum = sum + numbers;
	    	product = product * numbers;
	    	
	    	if (numbers < min)
	    		min = numbers;
	    	
	    	if (numbers > max)
	    		max = numbers;
	    }
	    
	    
	    // Output results to the terminal
	    System.out.println("You entered - ");
	    System.out.println(userList.toString());
	    System.out.println("The sum is " + sum);
	    System.out.println("The product is " + product);
	    System.out.println("The min is " + min);
	    System.out.println("The max is " + max);
	    
	   
	    

	}

}
