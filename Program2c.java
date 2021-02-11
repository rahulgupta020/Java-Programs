/*

Write a Java program to reverse a string.
Save File as Program2c.java
Compile :- javac Program2c.java
Run :-     java Program2c

*/

import java.util.Scanner;
class Program2c
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		{
			String str;
			String revstr="";

			System.out.print("Enter a string :- ");
			str = sc.nextLine();

			int length = str.length();

			for(int i=length-1; i>=0; i--)
			{
				revstr = revstr + str.charAt(i);
			}
			System.out.print("The reverse string is :- "+ revstr);
		}	
	}
}
