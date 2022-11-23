package String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DuplicateString {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		String input = br.readLine();
		
		char[] arr=input.toCharArray();
		
		for(int i=0;i<arr.length;i++)
		{
			
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j]) {
					System.out.println(arr[i]);
					break;
				}
			}
		}
		
	}

}
