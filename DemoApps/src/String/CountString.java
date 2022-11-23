package String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CountString {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		String input = br.readLine().toUpperCase();
		int [] arr=new int[26];
		int specialChar=0;
		for(int i=0;i<input.length();i++)
		{
			if(input.charAt(i)-65>=0 && input.charAt(i)<91)
			{arr[input.charAt(i)-65]++;
			
			}
			else
				specialChar++;
		}
		System.out.println("Special character: "+specialChar);
		int vowel=arr[0]+arr[8]+arr[15]+arr[20]+arr[4],cons=0;
		for(int i=0;i<26;i++)
		cons+=arr[i];
			
		System.out.println("consonants: "+(cons-vowel)+" vowels: "+vowel);
	}

}
