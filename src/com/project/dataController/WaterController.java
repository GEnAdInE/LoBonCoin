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
		try 
		{
			FileInputStream fis = new FileInputStream("waterQuantity.dat");
			ObjectInputStream ois = new ObjectInputStream(fis);
			
			Water water = (Water) ois.readObject();
			
			ois.close();
			fis.close();
			
			if(water.getQuantity() > 0)
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
	
	public static int getWaterAvailable()
	{
		try 
		{
			FileInputStream fis = new FileInputStream("waterQuantity.dat");
			ObjectInputStream ois = new ObjectInputStream(fis);
			
			Water water = (Water) ois.readObject();
			
			ois.close();
			fis.close();
			
			return water.getQuantity();
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		return 0;
	}
	
	public static void consumeWater(int quantity)
	{
		try 
		{
			FileInputStream fis = new FileInputStream("waterQuantity.dat");
			ObjectInputStream ois = new ObjectInputStream(fis);
			
			Water water = (Water) ois.readObject();
			
			ois.close();
			fis.close();
			
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
			FileInputStream fis = new FileInputStream("waterQuantity.dat");
			ObjectInputStream ois = new ObjectInputStream(fis);
			
			Water water = (Water) ois.readObject();
			
			ois.close();
			fis.close();
			
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
}
