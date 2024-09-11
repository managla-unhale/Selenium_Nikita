package com.ShopperStack_GenericUtility;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Random;

public class Java_Utility {
	        //Java_Utility3
	
	public int generateRandomNumber() 
	{
		Random r = new Random();
		int num = r.nextInt(1000);
		return num;
	}
	
	public String localDate()
	{
		String date = LocalDate.now().toString().replace("-","");
		return date;
	}
	
	
	public String localDateTime() {
		String time = LocalDateTime.now().toString().replace("-","").replace(":","").replace(".","");
		return time;
	}

}
