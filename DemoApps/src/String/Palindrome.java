package String;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input="2552";
		int i=0,j=input.length()-1;
		while(i<input.length()/2)
		{
			if(input.charAt(i)==input.charAt(j))
			{
				i++;
				j--;
			}
			else
			{
				break;
			}
		}
		if(i>=j)
			System.out.println("Pallindrome");
		else
			System.out.println("Not Pallindrome");
	}

}
