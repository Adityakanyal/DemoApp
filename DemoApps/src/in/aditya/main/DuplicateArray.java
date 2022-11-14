package in.aditya.main;
import java.util.*;
public class DuplicateArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the length");
		int size=sc.nextInt();
		int arr[]=new int[size];
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		Arrays.sort(arr);
		int temp=-1;
		for(int i=0;i<size-1;i++)
		{
			if(arr[i]==arr[i+1])
			{System.out.println(arr[i]);
			i++;
			}
		}
		sc.close();
	}

}
