package String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Panagram {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		 String input =br.readLine().toUpperCase();
		 
		 char arr[]=input.toCharArray();
		  boolean [] flag = new boolean [26];
		for(int i=0;i<input.length();i++) {
		  if ('A' <= input.charAt(i)&& input.charAt(i) <= 'Z')
	               flag[input.charAt(i) - 'A']=true;
	 
	            else if ('a' <= input.charAt(i) && input.charAt(i) <= 'z')
	 
	                flag[input.charAt(i) - 'a']=true;
	            else
	            continue;
		}
		int i=0;
		for(;i<26;i++)
		{
			if(!flag[i])
				{
				System.out.println("Not Paragram");
				break;}
		}
		
		if(i==26)
			System.out.println("Paragram");
		 
			 
		 
	}

}
