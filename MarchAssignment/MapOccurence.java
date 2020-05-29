package MarchAssignment;

import java.util.HashMap;

public class MapOccurence 
{
	public static void main(String[] args) 
	{
        //Creating a HashMap containing char as a key and occurrences as a value
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
	}
}