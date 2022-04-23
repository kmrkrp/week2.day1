package week2.day1;

public class StringConcepts {
	private static final char e = 0;
	private static final char cmp = 0;

	public static void main(String[] args) {
		String name = "TestLeaf";
		String  cmp = "e";		
		int count = 0;
		int len = name.length();
		for(int i = 0;i<len;i++)
		{
			char cou = name.charAt(i);
			String s = Character.toString(cou);		
		if (cmp.equals(s))
		{
			count = count+1;
		}
		}
		System.out.println("The Number of e characters in "+name+" is "+count);
	}
}
