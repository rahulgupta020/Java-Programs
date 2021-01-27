/*

Write a Java program to add two binary numbers.
Save File as Program2a.java
Compile :- javac Program2a.java
Run :-     java Program2a

*/

import java.util.Scanner;

class Program2a
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		{
			int bin1, bin2;
			int i=0, carry=0;
			int[] arr = new int[10];

			System.out.print("Enter first binary number :- ");
			bin1 = sc.nextInt();
			System.out.print("Enter Second binary number :- ");
			bin2 = sc.nextInt();

			while(bin1!=0 || bin2!=0)
			{
				arr[i] = (int)((bin1%10 + bin2%10 + carry)%2);
				i++;
				carry = (int)((bin1%10 + bin2%10 + carry)/2);
				bin1 = bin1/10;
				bin2 = bin2/10;
			}

			if(carry!=0)
			{
				arr[i] = carry;
				i++;
			}

			System.out.print("Sum of two binary numbers :- ");
			i--;
			while(i>=0)
			{
				System.out.print(arr[i]);
				i--;
			}

		}
	}
}
