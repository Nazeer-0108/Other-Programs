package Polymorphism;

public class MethOverrideChild extends MethOverrideParent
{
	public static void main(String[] args) 
	{
		MethOverrideChild override = new MethOverrideChild();
		override.methodoveride();

	}

	public void methodoveride()
	{
		System.out.println("Child method");
	}
	
}
