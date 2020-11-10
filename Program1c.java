/*

Write a Java program to print the area and perimeter of a circle
Save File as Program1c.java
Compile :- javac Program1c.java
Run :-     java Program1c

*/

import java.util.*;
class Program1c
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		{
			double r;
			System.out.print("Enter a radius :- ");
			r = sc.nextDouble();
			//double perimeter = 2 * 3.14 * r;
			//double area = 3.14 * r * r;
			double perimeter = 2 * Math.PI * r;
			double area = Math.PI * r * r;
			System.out.println(perimeter);
			System.out.println(area);
		}
	}
};
