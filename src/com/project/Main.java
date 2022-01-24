package com.project;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;

import com.project.dataController.DrinkController;
import com.project.dataController.OrderController;
import com.project.dataController.SugarController;
import com.project.dataController.WaterController;

import com.project.model.*;

public class Main 
{
	public static void main(String[] args)
	{
		boolean water = WaterController.isWaterAvailable();
		if(!water)
		{
			System.out.println("No more water.");
			return;
		}
		
		Order order = new Order();
		
		//Get available drinks on the machine
		ArrayList<Drink> drinkList = DrinkController.getAvailableDrink();
		for(Drink d : drinkList)
		{
			//show it to the user
			System.out.println(d);
		}

		try (Scanner scanner = new Scanner( System.in ))
		{
			// Drink
			int choice = -1;
			while(0 >= choice || choice > drinkList.size())
			{
				System.out.println("Please choose a drink in the list :");
				choice = scanner.nextInt();	
			}
			order.setDrink(drinkList.get(choice - 1));
			order.setPrice(drinkList.get(choice - 1).getPrice());
			
			//Même prix pour les deux quantité de boisson ?????
			
			// Size
			choice = -1;
			while(choice != 35 && choice != 75)
			{
				String size = "";
				if(WaterController.getWaterAvailable() < 35)
				{
					System.out.println("Not enought water.");
					return;
				}
				
				if(WaterController.getWaterAvailable() > 35)
				{
					size += "Please choose your size drink : 35";
				}
				
				if(WaterController.getWaterAvailable() > 75)
				{
					size += " or 75";
				}
				size += ".";
				
				System.out.println(size);
				choice = scanner.nextInt();	
			}
			order.setWater(new Water(choice));
			
			// Cup
			String answer = "";
			while(!answer.contains("y") && !answer.contains("Y")
			   && !answer.contains("n") && !answer.contains("N"))
			{
				System.out.println("Do you want a cup ? [Y/N]");
				answer = scanner.next();	
			}
			
			if(answer.contains("n") || answer.contains("N"))
			{
				order.setPrice(order.getPrice() - 0.10);
			}
			answer = "";
			
			// Sugar
			if(!SugarController.isSugarAvailable())
			{
				while(!answer.contains("y") && !answer.contains("Y")
				   && !answer.contains("n") && !answer.contains("N"))
				{
					System.out.println("There is no more sugar, do you want to continue without ? [Y/N]");
					answer = scanner.next();	
				}
				
				if(answer.contains("n") && answer.contains("N"))
				{
					System.out.println("OK Bye.");
					return;
				}
				order.setSugar(new Sugar(0));
			}
			else
			{
				choice = -1;
				while(choice < 0 || choice > 5)
				{
					System.out.println("Please choose your quantity of sugar [0-5] :");
					choice = scanner.nextInt();	
				}
				if(5 * choice > SugarController.getSugarAvailable())
				{
					choice = -1;
					while(choice < 0 && choice > SugarController.getSugarAvailable())
					{
						System.out.println("No enought sugar, please chose less sugar.");
						System.out.println("Please choose your quantity of sugar [0-" + choice + "] :");
						choice = scanner.nextInt();	
					}
				}
				
				order.setSugar(new Sugar(5 * choice));
			}
			
			answer = "";
			order.setDate(LocalDateTime.now());
			while(!answer.contains("y") && !answer.contains("Y")
			   && !answer.contains("n") && !answer.contains("N"))
			{
				System.out.println(order);
				System.out.println("Could you confirm your order [Y/N] :");
				answer = scanner.next();	
			}
			
			if(answer.contains("n") || answer.contains("N"))
			{
				System.out.println("OK Bye.");
				order.setDate(LocalDateTime.now());
				order.setCanceled(true);
				OrderController.saveOrder(order);
				return;
			}
			
			SugarController.consumeSugar(order.getSugar().getQuantity());
			WaterController.consumeWater(order.getWater().getQuantity());
			
			order.setCanceled(false);
			OrderController.saveOrder(order);
			
			System.out.println("Thank you for your order, enjoy your drink !");
		}
	}


}
