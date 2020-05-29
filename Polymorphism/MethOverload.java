package Polymorphism;

public class MethOverload 
{
	public static void main(String[] args) 
	{
		MethOverload calc = new MethOverload();
		calc.add(5, 2);
		calc.add(2, 1, 9);
		calc.multiply(5, 10);
		calc.multiply(5, 12.5);
		calc.minus(10, 2.5);
		calc.minus(12, 8);
		calc.div(10, 2);
		calc.div(12.8, 4);

	}

	//Method-1 Add
	public void add(int a, int b)
	{
		int sum = a+b;
		System.out.println("Method-1 Add = " + sum);
	}
	//Method-2 Add	
	public void add(int a, int b, int c)
	{
		int sum = a+b+c;
		System.out.println("Method-2 Sum = " + sum);
	}
	
	//Method-1 Multiply
	public void multiply(int a, int b)
	{
		int prod = a*b;
		System.out.println("Method-1 Multiple = " + prod);
	}
	//Method-2 Multiply	
	public void multiply(int a, double b)
	{
		double prod = a*b;
		System.out.println("Method-2 Multiple = " + prod);
	}
		
	//Method-1 Sub
	public void minus(int a, double b)
	{
		double sub = a-b;
		System.out.println("Method-1 Subract = " + sub);
	}
	//Method-2 Sub	
	public void minus(int a, int b)
	{
		int sub = a-b;
		System.out.println("Method-2 Subract = " + sub);
	}
		
	//Method-1 Div
	public void div(int a, int b)
	{
		int div = a / b;
		System.out.println("Method-1 Divide = " + div);
	}
	//Method-2 Div	
	public void div(double a, int b)
	{
		double div = a/ b;
		System.out.println("Method-2 Divide = " + div);
	}
	
	

	
	
}
