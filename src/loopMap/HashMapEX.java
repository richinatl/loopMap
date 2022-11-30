package loopMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapEX {

	public static void main(String[] args) {
//		You are a car dealer. Create a hash map of vehicles.
//		The model is the Key, the make is the Value.
//		Ask the customer what car (model) they are looking for. Use the Hash Map to determine if you have that vehicle, and what make it is.
//		(e.g. "Oh, you're looking for a Civic? Our Honda selection is right over here...")
		
		// initiate scanner
		Scanner input = new Scanner(System.in);
		HashMap<String, String> inventory = new HashMap<String, String>();
		
		//add vehicles to inventory hash map
		inventory.put("Honda","Accord");
		inventory.put("Toyota","Prius");
		inventory.put("Chevy","Silverado");
		inventory.put("Jeep","Wrangler");
		inventory.put("Ford","Escape");
		
		// ask for user input
		System.out.println("What kind of vehicle are you looking for ?");
		String userChoice = input.nextLine();
		
		input.close();
		
		// loop to check user's choice
		// resource if needed later https://www.baeldung.com/java-map-entry
//		for(Map.Entry<String, String> entry: inventory.entrySet()) {
//			if(entry.getValue().equals(inventory.get(userChoice))) {
//				// provide response to user
//				System.out.println("You're looking for a " + userChoice);
//				System.out.println("");
//				System.out.println("We have you covered...");
//				System.out.println("");
//			}
//			else  {
//				System.out.println("Sorry we don't have that ");
//			}
//		}
		
		if (inventory.containsKey(userChoice)) {
			System.out.println("You're looking for a " + userChoice);
			System.out.println("");
			System.out.println("We have you covered!  ");
			System.out.println("");
		}
		
		else  {
		System.out.println("Sorry we don't have that ");
	}
		
		
	}

}
