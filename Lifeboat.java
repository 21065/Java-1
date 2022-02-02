
/*
 File Name:Lifeboat.java
  Author: Younes J
   Date: Feb 20, 2021 5:04:37 PM
Description: first this program takes some information that provide by users, then program analyze the information and show the result 
*/
//PsuedoCode
/*
  1:  create a scanner object
  2:  title the program
  3:  create an object
  4:  ask the user to enter some information
  5:  calculate the information
  6:  check the conditions
  7:  print the result
  */
//scanner class
import java.util.Scanner;
public class Lifeboat
{

	public static void main(String[] args)
	{
		//title program
		System.out.println("Lifeboat Capacity Analysis");
		System.out.println("--------------------------");
		
		
		System.out.println();
		System.out.println("First some information is needed...");
		System.out.println();
		
		//define an object
		Scanner myInput = new Scanner (System.in);
		
	 // ask information from user
		System.out.println("Enter the name of the ship:");
		
		//accept string for name including space
		String shipName = "";
		shipName+=myInput.nextLine();

		// display information for user
		System.out.println("Enter the number of people on board the " + shipName + ":");
		double peopleNumber = myInput.nextDouble();
		
		System.out.println("Enter the maximum number of people per life boats:");
		double eachLifeboatCapacity = myInput.nextDouble();
		
		System.out.println("Enter the number of lifeboats that are available on the " +shipName +":");
		double lifeboatNumber = myInput.nextDouble();
		
		System.out.println();
		System.out.println("Here are the results...");
		
		// calculate required life boats + round to up
		double	requiredLifeboatNumber = Math.ceil(peopleNumber / eachLifeboatCapacity)  ;
		
		
		// available space 
		double allLifeboatCapacity = (lifeboatNumber * eachLifeboatCapacity );
	
		// two conditions: enough or more life boats / not enough life boat
		
		if ((allLifeboatCapacity) >= (peopleNumber))   // enough life boat
				{
			  	System.out.println("A minimum of " + (int)requiredLifeboatNumber + " lifeboats are required to rescue everyone on board.");
          System.out.println((int)peopleNumber + " people (100%) would be rescued.");
          System.out.println(" 0 people (0.0%) would likely drown");
          double additionalSavePeople = allLifeboatCapacity - peopleNumber ;
          System.out.println("there would be room for an extra " +(int)additionalSavePeople+ " people in the lifeboats");
				}
		else   // not enough life boat
		{
			double drownPeople =(peopleNumber - allLifeboatCapacity); 
			double rescuedPeople = allLifeboatCapacity  ; 
			
			double percentageDrown = (int)(drownPeople * 100.0) /  peopleNumber;
			percentageDrown=Math.round(percentageDrown * 100.0) / 100.0; // round to two decimal point
			
			
			double percentageRescue =  (rescuedPeople * 100.0) /  peopleNumber;
			percentageRescue =Math.round(percentageRescue * 100.0) / 100.0; // round to two decimal point
			
			
			
			
			System.out.println("A minimum of " + (int)requiredLifeboatNumber +" lifeboats are required to rescue everyone on board.");
		  System.out.println( (int)rescuedPeople + " people" +"("+percentageRescue+")"+"% would be rescued");
		  System.out.println( (int)drownPeople + " people"+"("+percentageDrown+")"+"% would likely drown");
		  
		}
		
		
	}

}
