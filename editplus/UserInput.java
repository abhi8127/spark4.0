import java.util.Scanner;

class UserInput 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string as a input");
		String str=sc.nextLine();
		System.out.println("Your String are :"+str);
	}
}
