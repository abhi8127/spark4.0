import java.util.Scanner;

class SecondLargest 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter the size of array");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		System.out.println("Enter the element in the array");
		
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		int max=arr[0];
		int secondMax=arr[0];
		
		for(int j=1;j<n;j++)
		{
			if(arr[j]>max)
			{
				secondMax=max;
				max=arr[j];
			}
			else if(arr[j]>secondMax && arr[j]!=max)
			{
				secondMax=arr[j];
			}
		}
		System.out.println("-------------------------------------------------");
		System.out.println("Second largest element is : "+secondMax);
	}
}
