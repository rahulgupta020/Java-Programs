/*

Write a Java program to display the following pattern.
* * * * *
 * * * *
  * * *
   * *
    *

Save File as Program1b.java
Compile :- javac Program1b.java
Run :-     java Program1b

*/

import java.util.Scanner;
class Program1b
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		{
			int n;
			System.out.print("Enter a number of rows :- ");
			n = sc.nextInt();

			for(int i=0;i<n;i++)
			{
				for(int j=0;j<=i;j++)
				{
					System.out.print(" ");
				}
				for(int k=0;k<n-i;k++)
				{
					System.out.print("* ");
				}
				System.out.println();
			}
		}
	}
};
