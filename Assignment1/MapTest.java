package Assignment1;

import java.util.HashMap;
import java.util.Map;

public class MapTest {

	public static void main(String[] args) 
	{
		String txt = "Good to Go";
		char ch =  'o';
		Map<Character, Integer> mp = new HashMap<Character, Integer>();
		int count = 0;
		for (int i = 0; i < txt.length(); i++)
		{
			if(txt.charAt(i) == ch)
			{
				count++ ;
			}
			mp.put(ch,  count);
		}
		System.out.println(mp);
		System.out.println("***********************");
		
		char[] strText = txt.toCharArray();
		System.out.println(strText);
		int count1 = 0;
		Map<Character, Integer> mp1 = new HashMap<Character, Integer>();
		System.out.println(txt.length());
		
		for (char c : strText)
		{
			if (mp1.containsKey(c))
			{
				mp1.put(c, mp1.get(c)+1);
				//mp1.put(c, count1++);
			}
			else
			{
				mp1.put(c, 1);
			}
		}
		System.out.println("Values only -> " + mp1.values());
		System.out.println("Keys only -> " + mp1.keySet());
		System.out.println("Both Keys & Values -> " + mp1.entrySet());
		/*for (int i = 0; i<txt.length(); i++)
		{
			if (txt.charAt(i) == strText[i])
			{
				count1++;
			}
			else
			{
//				mp1.putAll(mp1);
				mp1.put(strText, count1);
			}
			
		}
		System.out.println(mp1);
		*/
		
		

	}

}
