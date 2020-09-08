//Accept a number check wheather that number is even or odd, prime or not, perfect or not, palidrome or not.
import java.util.Scanner;
class Ass_1
{
	public static void main(String args[])
	{
		Scanner pp = new Scanner(System.in);
		System.out.println("ENTER THE NUMBER : ");
		int a = pp.nextInt();


		//Even or Not
		if(a%2==0)
		{
			System.out.println(a+" is EVEN");
		}
		else
		{
			System.out.println(a+" is ODD");
		}


		//Prime or not
		int flag = 0;
		int i = 0;
		if(a==0||a==1)
		{
		   System.out.println(a+" is not prime number");
		}
		else
		{
		   for(i=2;i<a;i++)
		   {
			   if(a%i==0)
				{
				   System.out.println(a+" is not prime number");
				   flag = 1;
				   break;
				}
			}
			if(flag==0)
			{
					System.out.println(a+" is prime number");
			}
		}


		//Palindrome or not
		int r,sum = 0;
		int temp = a;
		while(temp > 0)
		{
			r = temp%10;
		   	sum =(sum*10)+r;
		   	temp = temp/10;
		}
		if(a == sum)
		{
			System.out.println(a + " is palindrome number.");
		}
		else
		{
			System.out.println(a + " is not palindrome");
		}


		//Perfect or not
		int add = 0;
		for(int x = 1; x < a; x++)
		{
			if(a % x == 0)
			{
				add = add + x;
			}
		}
		if(add == a)
		{
			System.out.println(a + " is a Perfect number");
	    }
	    else
	    {
		    System.out.println(a + " is not a Perfect number");
        }
	}
}