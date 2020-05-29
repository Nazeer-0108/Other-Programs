package Assignment1;
import java.util.HashMap;
import java.util.Scanner;
public class Palindrome
{
   public static void main(String args[])
   {
      String str;
      String rev = "";
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter the string you want to check:");
      str = sc.nextLine();
      int length = str.length();
      for ( int i = length - 1; i >= 0; i-- )
         rev = rev + str.charAt(i);
      if (str.equals(rev))
         System.out.println(str+" is a palindrome");
      else
         System.out.println(str+" is not a palindrome");
 
   }
}
/*
HashMap<Character, Integer> countMap = new HashMap<Character, Integer>();
String inputString = "You have no choice other than following me!";
//int count = 0;
//Converting given string to char array
char[] strArray = inputString.toCharArray();
//checking each char of strArray
for (char c : strArray)
{
	if(countMap.containsKey(c))
    {
		//If char 'c' is present in charCountMap, incrementing it's count by 1
		countMap.put(c, countMap.get(c)+1);
    }
    else
    {
        //If char 'c' is not present in charCountMap,
        //putting 'c' into charCountMap with 1 as it's value
        countMap.put(c, 1);
    }
}
//Printing inputString and charCountMap 
System.out.println(inputString+" : "+countMap);
*/