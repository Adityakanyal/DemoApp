package String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class MaxOccurence {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String input=br.readLine().toUpperCase();
		//System.out.println(input);
		int[] arr=new int[26];
		for (int i = 0; i < input.length(); i++) {
			if(input.charAt(i)>='A'  && input.charAt(i)<='Z')
			{
				arr[input.charAt(i)-'A']++;}
		}
		//Arrays.sort(arr);
		int max=-1;
		char ans=' ';
		for (int i = 0; i < arr.length; i++) {
			if(max<arr[i])
				{ans=(char)(i+'A');
				max=arr[i];
				}
		}
		
		System.out.println(ans);
		
	}

}
