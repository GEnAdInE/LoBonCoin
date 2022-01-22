package com.project.dataController;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.project.model.Water;

public class WaterController
{
	public static boolean isWaterAvailable()
	{
		Water water = getWatterFromFile();
		System.out.print(water.toString());
		if(water == null)
			return false;
		if(water.getQuantity() > 0)
		{
			return true;
		}
		return false;

	}
	
	public static int getWaterAvailable()
	{

		Water water = getWatterFromFile();
		if(water == null)
			return 0;

		return water.getQuantity();

	}
	
	public static void consumeWater(int quantity)
	{
		try 
		{

			
			Water water = getWatterFromFile();
			if(water == null)
				return;
			water.setQuantity(water.getQuantity() - quantity);

			FileOutputStream fos = new FileOutputStream("waterQuantity.dat");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			
			oos.writeObject(water);
			
			oos.close();
			fos.close();
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
			
		}
		return;
	}
	
	public static void addWater(int quantity)
	{
		try
		{

			Water water = getWatterFromFile();
			if(water == null)
				return;
			
			water.setQuantity(water.getQuantity() + quantity);
			
			FileOutputStream fos = new FileOutputStream("waterQuantity.dat");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			
			oos.writeObject(water);
			
			oos.close();
			fos.close();
		} 
		catch (Exception e)
		{
			e.printStackTrace();

		}
		return;
	}

	public static Water getWatterFromFile()
	{
		try {
			FileInputStream fis = new FileInputStream("waterQuantity.dat");
			ObjectInputStream ois = new ObjectInputStream(fis);

			Water water = (Water) ois.readObject();

			ois.close();
			fis.close();
			return water;
		}
		catch (Exception e)
		{
			e.printStackTrace();
			return null;
		}
	}
}
