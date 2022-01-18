package model;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

import dataController.DrinkController;

public class Main 
{
	public static void main(String[] args)
	{
		//Get available drinks on the machine
		ArrayList<Drink> drinkList = DrinkController.getAvailableDrink();
		for(Drink d : drinkList)
		{
			//show it to the user
			System.out.println(d);
		}

		try (Scanner scanner = new Scanner( System.in ))
		{
			int choice = -1;

			while(0 >= choice || choice > drinkList.size())
			{
				System.out.println("Please choose a drink in the list :");
				choice = scanner.nextInt();	
			}
			System.out.println(drinkList.get(choice - 1));
		}
	}
}
