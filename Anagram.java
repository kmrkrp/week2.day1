package week2.day1;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String val_1 = "stops";
		String val_2 = "POTSS";
		String lowVal_1 = val_1.toLowerCase();
		String lowVal_2 = val_2.toLowerCase();
		int len_1 = val_1.length();
		int len_2 = val_2.length();
		if(len_1 == len_2)
		{
		String [] arr_1 = new String[len_1];
		String [] arr_2 = new String[len_2];
		for (int i = 0;i<len_1;i++)
		{
			char cou_1 = lowVal_1.charAt(i);
			char cou_2 = lowVal_2.charAt(i);
			arr_1[i] =  Character.toString(cou_1);		
			arr_2[i] =  Character.toString(cou_2);
		}
			Arrays.sort(arr_1);
			Arrays.sort(arr_2);
			
			if (Arrays.equals(arr_1, arr_2))   
			
			 {
				 System.out.println("The Value "+val_1+" && "+val_2+ " are Anagram Values");
			 }
			else
			 {
				 System.out.println("The Value -"+val_1+" && "+val_2+ " are not Anagram Values");
			 }
				
	
		}
		}
		

	}


