/*

Write a java program to convert a binary number to decimal bumber.
Save File as Program2bb.java
Compile :- javac Program2bb.java
Run :-     java Program2bb

*/

import java.util.Scanner;
class Program2bb
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);	
		{
			int bin, dec=0, remainder, i=1;

			System.out.print("Enter Binary Number :- ");
			bin = sc.nextInt();

			while(bin!=0)
			{
				remainder = bin%10;
				dec = dec + remainder*i;
				i=i*2;
				bin = bin/10;
			}
			System.out.print("Decimal Number is :- "+dec);
		}
	}
}
