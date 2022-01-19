package com.project.dataController;

import java.io.*;
import java.util.*;
import com.project.model.Drink;

public class DrinkController 
{
	public static ArrayList<Drink> getAvailableDrink()
	{
		ArrayList<Drink> drinks = null;
		try 
		{
			FileInputStream fis = new FileInputStream("drinklist.dat");
			ObjectInputStream ois = new ObjectInputStream(fis);
			
			drinks = (ArrayList<Drink>) ois.readObject();
			
			ois.close();
			fis.close();
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
			System.out.println("No drink available.");
		}
		
		return drinks;
	}
}
