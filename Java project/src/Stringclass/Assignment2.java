package Stringclass;

// REVERSE OF CHARACTERS IN STRING

public class Assignment2 {
	public static void main(String[] args) {
		String S= "abcde";
		String rev="";
		int size=S.length();
		for(int i=size-1;i>=0;i--) {
			rev=rev+S.charAt(i);
		}
System.out.println(rev);
}
}