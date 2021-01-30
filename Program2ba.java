/*

Write a java program to convert a decimal number to binary bumber.

Save File as Program2ba.java
Compile :- javac Program2ba.java
Run :-     java Program2ba

*/

import java.util.Scanner;

class Program2ba
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		{
			int num;
			int index=0;
			int arr[]=new int[10];

			System.out.print("Enter a decimal Number :- ");
			num = sc.nextInt();

			while(num>0)
			{
				arr[index] = num%2;
				index++;
				num = num/2;
			}
			System.out.print("Binary number is :- ");
			for(int i=index-1; i>=0; i--)
			{
				System.out.print(arr[i]);
			}
		}
	}
}
