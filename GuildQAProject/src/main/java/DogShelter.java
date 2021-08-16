package main.java;

import java.util.*;

public class DogShelter {
	
	public static float orderFood(int []dogs , float foodLeft){
		int [] dogFoodNeeds = new int[]{10, 20, 30};
		float foodRequired = 0.0f;
		int totalNumberOfDogs = 0;
		for(int i = 0; i<dogs.length ; i++){
			totalNumberOfDogs += dogs[i];
		}
		if(totalNumberOfDogs <= 0 || totalNumberOfDogs > 30) {
			System.out.println("Number of dogs does not match the shelter capacity");
			return 0; 
		}
		for( int i = 0 ; i < dogFoodNeeds.length ; i++){
			foodRequired += dogs[i]* dogFoodNeeds[i];
		}
		foodRequired -= foodLeft;
		foodRequired = foodRequired + foodRequired * 0.2f;
		if(foodRequired < 0){
			System.out.println("No need to order food");
			return 0;
		}

		return foodRequired;
	}

	public static void main(String[] args) {
			String [] dogType = {"Small" , "Medium" , "Large"};
			int [] numberOfDogs = new int [dogType.length];
			float leftOverFood;
			Scanner sc = new Scanner(System.in);
			for(int i = 0 ; i < dogType.length ; i++){
				System.out.println("Enter number of "+dogType[i]+" dogs left: ");
				numberOfDogs[i] = sc.nextInt();
			}
			System.out.println("Enter amount of food left: ");
			leftOverFood = sc.nextFloat();
			System.out.println("The amount of food needs to be ordered is: "+orderFood(numberOfDogs,leftOverFood));
	}
}