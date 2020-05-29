package PropertyFile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class LearnProperties
{
	public static void main(String[] args) throws FileNotFoundException, IOException 
	{
		Properties prop = new Properties();
		prop.load(new FileInputStream("./English.properties"));
		
		String property = prop.getProperty("login.uname.id");
		System.out.println(property);
		
		String property1 = prop.getProperty("Myhome.Leads.link");
		System.out.println(property1);
		
	}

}
