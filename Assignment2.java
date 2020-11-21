/*
 *Create a class called calculator with two static method called powerInt(int num1,int num2)
 *and powerDouble(double num1,int num2).Both the method should return num1 to the power num2
**/
class Calculator
{
	public static int powerInt(int num1, int num2)
	{
		return (int) Math.pow(num1, num2);
	}
	public static double powerDouble(double num1, int num2)
	{
		return Math.pow(num1, num2);
	}
}
class Assignment2
{
	public static void main(String args[])
	{
		System.out.println(Calculator.powerInt(20,2));
		System.out.println(Calculator.powerDouble(1.6,2));
	}
}