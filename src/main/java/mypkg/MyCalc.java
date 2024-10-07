package mypkg;

public class MyCalc {
	
	public int sum(int a, int b)
	{
		return a+b;
	}
	public int diff(int a, int b)
	{
		return a-b;
	}
	public int mul(int a, int b)
	{
		return a*b;
	}

	public static void main(String[] args) {
		
		MyCalc calc = new MyCalc();
		System.out.println("Sum is: "+calc.sum(20, 10));
		System.out.println("Diff is: "+calc.diff(20, 10));	

	}

}
