package MarchAssignment;

import java.util.List;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;


public class SetListMap 
{
	public static void main(String[] args) 
	{
		String inputText = "Nazeer Hussain" ;
		char[] strText = inputText.toCharArray();
		Set<Character> charSet = new HashSet<Character>();
		Set<Character> dupCharSet = new HashSet<Character>();
		for(char c : strText)
		{
			if (charSet.contains(c)) 
			{
				dupCharSet.add(c);
			}
			else
			{
				charSet.add(c);
			}
		}
		System.out.println("Duplicate Characters are " + dupCharSet);
		charSet.removeAll(dupCharSet);

		for (char d : charSet)
		{
			if (charSet.contains(" "))
			{
				System.out.println("Space");
			}
			else
			{
				charSet.add(d);
			}
		}
		System.out.println(charSet);

		//Getting value for LIST from SET
		List<Character> lst = new ArrayList<Character>();
		lst.addAll(charSet);
		System.out.println(lst);
		
/*		System.out.println("Hash Set example");
		Set<String> hashst = new HashSet<String>();
		//Set<String> treest = new TreeSet<String>();
		//Set<String> linkhashst = new LinkedHashSet<String>();
		hashst.add("Nazeer");
		hashst.add("Kannan");
		hashst.add("Vignesh");
		hashst.add("Kamal");
		hashst.add("Nagaraj");
		System.out.println("Original values: " + hashst);
		System.out.println("Original Size: " + hashst.size());
		hashst.add("Bala");
		System.out.println("After adding: " + hashst);
		System.out.println("After adding Size: " + hashst.size());
		System.out.println("Contains: " + hashst.contains("Kamal"));
		hashst.remove("Nagaraj");
		System.out.println("After removal: " + hashst);
		System.out.println("After removal Size: " + hashst.size());
		hashst.clear();
		System.out.println("Empty: " + hashst.isEmpty());
		System.out.println("****************************");
		
		System.out.println("Array List example");
		List<String> arraylst = new ArrayList<String>();
		arraylst.add("Nazeer");
		arraylst.add("Kannan");
		arraylst.add("Vignesh");
		arraylst.add("Kamal");
		arraylst.add("Nagaraj");
		System.out.println("Original values: " + arraylst);
		System.out.println("Original Size: " + arraylst.size());
		arraylst.add("Bala");
		System.out.println("After adding: " + arraylst);
		System.out.println("After adding Size: " + arraylst.size());
		System.out.println("Get: " + arraylst.get(1));
		System.out.println("Contains: " + arraylst.contains("Kamal"));
		arraylst.remove("Nagaraj");
		System.out.println("After removal: " + arraylst);
		System.out.println("After removal Size: " + arraylst.size());
		arraylst.clear();
		System.out.println("Empty: " + arraylst.isEmpty());
		System.out.println("****************************");
	*/
		
		

	}

}
