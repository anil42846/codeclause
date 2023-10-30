package Code;

import java.util.Random;
import java.util.Scanner;

public class PasswordGenerator 
{
	/* This Static method is used to generate a random String.
	   and it will return a String */
	public static String getPassword(int noOfDigits)
	{
		Random random = new Random();
		String digits = "0123456789";
		String lowercase = "abcdefghijklmnopqrstuvwxyz";
		String uppercase = lowercase.toUpperCase();
		String symbols = "~`!@#$%^&*()_+-=[]{}|;':,./<>?";
		String all = digits+lowercase+uppercase;   //+symbols;
		String pswd="";
		
		for(int i=1;i<=noOfDigits;i++)
		{
			int index = random.nextInt(all.length()-1);
			pswd = pswd + all.charAt(index);
		}
		return pswd;
	}
	
	
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter Number of Characters in password: ");
		String password = PasswordGenerator.getPassword(scan.nextInt());
		System.out.println("Here Generated password is: "+password);
	}
}
