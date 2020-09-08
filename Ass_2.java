//Accept a character and check whether that is vowel or not using switch
import java.util.Scanner;
class Ass_2
{
	public static void main(String args[])
	{
		Scanner pp = new Scanner(System.in);
		System.out.println("Enter character in lower case : ");
		char ch = pp.next().charAt(0);
		if((ch>='a' && ch<='z')||(ch>='A' && ch<='Z'))
		{
			switch(ch)
			{
				case 'a' :
				System.out.println("It is a vowel");
				break;
				case 'e' :
				System.out.println("It is a vowel");
				break;
				case 'i' :
				System.out.println("It is a vowel");
				break;
				case 'o' :
				System.out.println("It is a vowel");
				break;
				case 'u' :
				System.out.println("It is a vowel");
				break;
				case 'A' :
				System.out.println("It is a vowel");
				break;
				case 'E' :
				System.out.println("It is a vowel");
				break;
				case 'I' :
				System.out.println("It is a vowel");
				break;
				case 'O' :
				System.out.println("It is a vowel");
				break;
				case 'U' :
				System.out.println("It is a vowel");
				break;
				default :
				System.out.println("It is a not a vowel");
			}
		}
		else
		{
			System.out.println("It is not a alphabet");
		}
	}
}