/*Print menu card in following way
Enter two numbers :
select from following option:
1. Addition
2. Subtraction
3. multiplication
4. division
5. exit
using methods*/
import java.util.Scanner;
class Ass_4
{
	public static void main(String args[])
	{
		Scanner pp = new Scanner(System.in);
		System.out.println("Enter first number : ");
		int a = pp.nextInt();
		System.out.println("Enter second number : ");
		int b = pp.nextInt();
		menu(a,b);
	}
	public static void menu(int x,int y)
	{
		System.out.println("Select from following options :");
		System.out.println("1.Addition");
		System.out.println("2.Subtraction");
		System.out.println("3.Multiplication");
		System.out.println("4.Division");
		System.out.println("5.Exit");
		System.out.println("Enter your selection as 1 or 2 or 3 or 4 or 5 :");
		Scanner pp = new Scanner(System.in);
		int p = pp.nextInt();
		if (p == 1)
		{
			System.out.println("Addition of two numbers is : " +(x+y)+"\n");
			menu(x,y);
		}
		else if(p == 2)
		{
			System.out.println("Subtraction of two numbers is : " +(x-y)+"\n");
			menu(x,y);
		}
		else if(p == 3)
		{
			System.out.println("Multiplication of two numbers is : " +(x*y)+"\n");
			menu(x,y);
		}
		else if(p == 4)
		{
			System.out.println("Division of two numbers is : " +(x/y+"\n"));
			menu(x,y);
		}
		else
		{
			System.out.println("EXIT");
		}
	}
}