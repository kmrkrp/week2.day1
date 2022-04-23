package week2.day1;

public class StringContainsLogic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String value =  "Testleaf is situated in twin towers teynampet";
		String[] sep = value.split(" ");
		int len = sep.length;		
		for(int i=0;i<len;i++)
		{
			if(sep[i].startsWith("T")||sep[i].startsWith("t"))
			{
				System.out.println(sep[i]);
			}
		}		
	}
}
