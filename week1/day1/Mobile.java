package week1.day1;

public class Mobile
{
	int batteryPercent = 86;
	String mobileModel = "Redmi 8.0";
	public void dialCaller ()
	{
		System.out.println("Dial Caller, void method returns nothing");
	}
	public boolean sendSMS ()
	{
		return true;
	}
	public static void main(String[] args) 
	{
		System.out.println("This is main Method");
		//Step 1: Create a reference for the class
		// Syntax: ClassName obj = new ClassName();
		Mobile mob = new Mobile();
		//Step 2: Call the method using reference
		// Syntax: obj.methodname();
		mob.dialCaller();
		mob.sendSMS();
		boolean sendSMS = mob.sendSMS();
		System.out.println("Send SMS: " + sendSMS);
		int batteryPercent2 = mob.batteryPercent;
		System.out.println("Battery Percentage: " + batteryPercent2 + "%");
		String mobileModel2 = mob.mobileModel;
		System.out.println("Mobile model: " + mobileModel2);
		
	}
	
	
}