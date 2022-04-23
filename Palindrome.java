package week2.day1;

public class Palindrome {
	public static void main(String[] args) {
		String compareValue = "Madam";
		String reverseValue = "";
		int len = compareValue.length();
		for(int i=len-1;i>=0;i--)
		{
		char cou = compareValue.charAt(i);
		String val = Character.toString(cou);		
		reverseValue = reverseValue.concat(val);				
		}
		if(reverseValue.equalsIgnoreCase(compareValue))
		{
			System.out.println("The Value "+compareValue+" is a Palindrome");
		}
		else
		{
			System.out.println("The Value "+compareValue+" is not a Palindrome");
		}
	}

}
