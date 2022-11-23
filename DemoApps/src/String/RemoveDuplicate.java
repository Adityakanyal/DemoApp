package String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RemoveDuplicate {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		String input = br.readLine();
		System.out.println("Old String:  " +input);
		char[] arr=input.toCharArray();
		String answer="";
		
		for(int i=0;i<arr.length;i++)
		{
			if(answer.indexOf(arr[i])<0)
				answer=answer+arr[i];
			

		}
		
		System.out.println(answer);
		
		
	}

}
