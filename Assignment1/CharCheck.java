package Assignment1;

import java.util.HashSet;
import java.util.Scanner;

public class CharCheck 
{
	public static void main(String[] args) 
	{
		String inputText = "NAZEER HUSSAIN ANSARI";
		String removedup = "";
		char[] c = inputText.toCharArray();
	    for(int i=0; i<=c.length-1; i++){
	        if(!removedup.contains(c[i] + ""))
	        	removedup = removedup + c[i];
	    }
	    System.out.println("Input before removing duplicate is " + inputText);
	    System.out.println("Output after removing duplicate is " + removedup);		
		
		
		
	    }
}
