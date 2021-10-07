package BRPDay4;

import java.util.Scanner;

public class TemperatureConversion {
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter The Temperature in Faranite");
	  Double fahrenheit=sc.nextDouble();
	 Double celsius=(fahrenheit-32)*(0.5556);
	 System.out.println(" Temperature in Celsius"+celsius);
	 System.out.println("Enter Temperature in Celsius");
	 Double celsiustemp=sc.nextDouble();
	 Double fahrenheittemp=(celsius*9/5)+32;
	 System.out.println(" Temperature in Faranite"+celsius);
	 

}
}
