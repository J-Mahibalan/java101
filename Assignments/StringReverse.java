package mahiapp;

public class StringReverse {
	public static void main(String[] args) {
		String st1 ="Mahi";
		String s="";
		for(int i=st1.length()-1;i>=0;i--)
		{
			s+=(st1.charAt(i));
		}
		System.out.println(s);
	}
 
}
