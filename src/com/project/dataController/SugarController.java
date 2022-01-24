package com.project.dataController;

import java.io.*;

import com.project.model.Sugar;
import com.project.model.Water;

public class SugarController 
{
	public static boolean isSugarAvailable()
	{
		Sugar sugar = getSugarFromFile();
		if(sugar == null)
			return false;
		
		if(sugar.getQuantity() > 0)
		{
			return true;
		}
		return false;
	}
	
	public static void consumeSugar(int weight)
	{
		Sugar sugar = getSugarFromFile();
		if(sugar == null)
			return;
			
		sugar.setQuantity(sugar.getQuantity() - weight);
			
		setSugarInFile(sugar);
		return;
	}
	
	public static void addSugar(int weight)
	{
		
		Sugar sugar = getSugarFromFile();
		if(sugar == null)
			return;
	
		sugar.setQuantity(sugar.getQuantity() + weight);
		
		setSugarInFile(sugar);
		
		return;
	}
	
	public static int getSugarAvailable()
	{
		Sugar sugar = getSugarFromFile();
		if(sugar == null)
			return 0;
		
		return sugar.getQuantity();
	}
	
	public static Sugar getSugarFromFile()
	{
		try
		{
			FileInputStream fis = new FileInputStream("sugarQuantity.dat");
			ObjectInputStream ois = new ObjectInputStream(fis);
			
			Sugar sugar = (Sugar) ois.readObject();
			
			ois.close();
			fis.close();
			
			return sugar;
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return null;
		}
	}
	
	public static void setSugarInFile(Sugar sugar)
	{
		try
		{
			FileOutputStream fos = new FileOutputStream("sugarQuantity.dat");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			
			oos.writeObject(sugar);
			
			oos.close();
			fos.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return;
	}
}
