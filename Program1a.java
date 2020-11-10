/*
Write a Java program that takes a number as input and prints its multiplication table upto 10

Save File as Program1a.java
Compile :- javac Program1a.java
Run :-     java Program1a

*/

import java.util.*;
class Program1a
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.print("Enter a number :- ");
		n = sc.nextInt();
		
		for(int i=1;i<=10;i++)
		{
			System.out.println(n + " * "+ i + " = "+ n*i );
		}
	}
};
