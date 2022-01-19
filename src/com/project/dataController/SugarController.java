package com.project.dataController;

import java.io.*;

import com.project.model.Sugar;
import com.project.model.Water;

public class SugarController 
{
	public static boolean isSugarAvailable()
	{
		try 
		{
			FileInputStream fis = new FileInputStream("sugarQuantity.dat");
			ObjectInputStream ois = new ObjectInputStream(fis);
			
			Sugar sugar = (Sugar) ois.readObject();
			
			ois.close();
			fis.close();
			
			if(sugar.getQuantity() > 0)
			{
				return true;
			}
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
			return false;
		}
		return false;
	}
	
	public static void consumeSugar(int weight)
	{
		try 
		{
			FileInputStream fis = new FileInputStream("sugarQuantity.dat");
			ObjectInputStream ois = new ObjectInputStream(fis);
			
			Sugar sugar = (Sugar) ois.readObject();
			
			ois.close();
			fis.close();
			
			sugar.setQuantity(sugar.getQuantity() - weight);
			
			FileOutputStream fos = new FileOutputStream("sugarQuantity.dat");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			
			oos.writeObject(sugar);
			
			oos.close();
			fos.close();
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
			
		}
		return;
	}
	
	public static void addSugar(int weight)
	{
		try 
		{
			FileInputStream fis = new FileInputStream("sugarQuantity.dat");
			ObjectInputStream ois = new ObjectInputStream(fis);
			
			Sugar sugar = (Sugar) ois.readObject();
			
			ois.close();
			fis.close();

			sugar.setQuantity(sugar.getQuantity() + weight);
			
			FileOutputStream fos = new FileOutputStream("sugarQuantity.dat");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			
			oos.writeObject(sugar);
			
			oos.close();
			fos.close();
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
			
		}
		return;
	}
	
	public static int getSugarAvailable()
	{
		try 
		{
			FileInputStream fis = new FileInputStream("sugarQuantity.dat");
			ObjectInputStream ois = new ObjectInputStream(fis);
			
			Sugar sugar = (Sugar) ois.readObject();
			
			ois.close();
			fis.close();
			
			return sugar.getQuantity();
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		return 0;
	}
}
