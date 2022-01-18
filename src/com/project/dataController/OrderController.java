package dataController;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import model.Order;

import java.util.*;

public class OrderController 
{
	public static void saveOrder(Order order)
	{
		try
		{
			ArrayList<Order> orderHistory = getHistory();
			
			orderHistory.add(order);
			
			FileOutputStream fos = new FileOutputStream("orderHistory.dat");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			
			oos.writeObject(orderHistory);
			
			oos.close();
			fos.close();			
		}	 
		catch (Exception e) 
		{
			e.printStackTrace();
			
		}
	}
	
	public static ArrayList<Order> getHistory()
	{
		try
		{
			FileInputStream fis = new FileInputStream("orderHistory.dat");
			ObjectInputStream ois = new ObjectInputStream(fis);
			
			ArrayList<Order> orderHistory = (ArrayList<Order>) ois.readObject();
			
			ois.close();
			fis.close();
			
			return orderHistory;
		}	 
		catch (Exception e) 
		{
			e.printStackTrace();
			
		}
		return null;
	}
}
