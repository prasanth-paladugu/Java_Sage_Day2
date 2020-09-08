//Accept n number of int number and check wheather each number is even or add, prime or not , perfect or not, palidrome or not
import java.util.Scanner;
class Ass_3
{
	public static void main(String args[])
	{
		Scanner pp = new Scanner(System.in);
		System.out.println("Enter how many numbers you want to check : ");
		int x = pp.nextInt();
		int a[] = new int[x];
		System.out.println("Start entering numbers :");
		for(int i=0;i<x;i++)
		{
		    a[i]=pp.nextInt();
		}
		for(int i=0;i<x;i++)
		{


			//Even or Not
			if(a[i]%2==0)
			{
				System.out.println(a[i]+" is EVEN");
			}
			else
			{
				System.out.println(a[i]+" is ODD");
			}


			//Prime or not
			int flag = 0;
			int m = 0;
			if(a[i] == 0||a[i] == 1)
			{
			   System.out.println(a[i]+" is not a prime number");
			}
			else
			{
			   for(m=2;m<a[i];m++)
			   {
				   if(a[i]%m==0)
					{
					   System.out.println(a[i]+" is not a prime number");
					   flag = 1;
					   break;
					}
				}
				if(flag == 0)
				{
						System.out.println(a[i]+" is a prime number");
				}
			}


			//Palindrome or not
			int r,sum = 0;
			int temp = a[i];
			while(temp > 0)
			{
				r = temp%10;
			   	sum =(sum*10)+r;
			   	temp = temp/10;
			}
			if(a[i] == sum)
			{
				System.out.println(a[i] + " is palindrome number.");
			}
			else
			{
				System.out.println(a[i] + " is not palindrome");
			}


			//Perfect or not
			int add = 0;
			for(int p = 1; p < a[i]; p++)
			{
				if(a[i] % p == 0)
				{
					add = add + p;
				}
			}
			if(add == a[i])
			{
				System.out.println(a[i] + " is a Perfect number");
			}
			else
			{
			    System.out.println(a[i] + " is not a Perfect number");
        	}
		}
	}
}