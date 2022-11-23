package String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UniqueChar {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		 
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		String input = br.readLine();
		String ans="";
		for(int i=0;i<input.length();i++) {
			
			if(ans.indexOf(input.charAt(i))<0)
				{ans+=input.charAt(i);}
			else {
				System.out.println("Not Unique");
				break;
			}
		}
		if(ans.equals(input))
			System.out.println(ans);
		
		
	}

}
