import java.util.Scanner;

class TriangleArea 
{
	public static void main(String[] args) 
	{
	  Scanner sc=new Scanner(System.in);
	  System.out.println("enter the height of right angle triangle");
	  int a=sc.nextInt();
	  System.out.println("Enter the base of right angle triangle");
	  int b=sc.nextInt();
	  System.out.println("Area of right angle triangle is :"+ Area(a,b));
	}
	
	public static float Area(int a,int b)
	{
		float ar=.5f*a*b;
		return ar;
	}
}
