package Assignment1;

import java.util.Properties;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class LearProperties {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		Properties prop = new Properties();
		prop.load(new FileInputStream("./English.properties"));
		
		String unameProperty = prop.getProperty("login.uname.id");
		System.out.println(unameProperty);
		String pwdProperty = prop.getProperty("login.pwd.id");
		System.out.println(pwdProperty);
		String loginProperty = prop.getProperty("login.login.class");
		System.out.println(loginProperty);
		String logoutProperty = prop.getProperty("home.logout.class");
		System.out.println(logoutProperty);

	}

}
