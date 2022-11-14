package in.aditya.main;
import java.util.Scanner;

public class SubsetArray {
	public static void main(String args[])
	{
		int[] arr,arr2;
		arr2=new int[4];
		arr=new int[] {23,34,21,34,22,88,77,43,11,99,65,54};
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the element");
		for(int i=0;i<arr2.length;i++)
		{
			arr2[i]=sc.nextInt();
		}
		int i=0,flag=0;
		while(i<arr.length)
		{	int j=0;

			while((i+j)<arr.length && arr[i+j]==arr2[j])
			{	
				j++;
				if(j==arr2.length)
				{
					System.out.println("Is a subset");
					flag=1;
					break;
				}
			}
				i++;
		}
		if(flag==0)
			System.out.println("Not a subset");
		sc.close();
	}

}
