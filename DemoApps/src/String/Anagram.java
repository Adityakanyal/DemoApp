package String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Anagram {

static void sort(char arr[])
{
	 for(int i=0;i<arr.length-1;i++)
	 {
		 for(int j=i;j<arr.length;j++)
		 {
			 if(arr[i]>arr[j])
			 {
				 char temp=arr[i];
				 arr[i]=arr[j];
				 arr[j]= temp;
			 }
		 }
	 }
}


	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		 String input =br.readLine();
		 
		 String input2=br.readLine();
		 
		 char arr[]=input.toCharArray();
		 char arr2[]=input2.toCharArray();
		 
		 sort(arr);
		 sort(arr2);
		 int flag=0;
		 
		 for(int i=0;i<arr.length && i<arr2.length;i++)
		 {
			 if(arr[i]==arr2[i])
			 {
				 flag++;
			 }
			 else
				 break;
		 }
		 
		 if(flag==arr.length && flag==arr2.length)
			 System.out.println(input);
		 else
			 System.out.println("Not anagram");
		 
	}

}
