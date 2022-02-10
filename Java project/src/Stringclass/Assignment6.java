package Stringclass;

//REMOVE THE CHARACTER FROM STRING

public class Assignment6 {
	public static void main(String[] args) {
		String s="as23der457g3";
	String ss="";
	for(int i=0;i<s.length();i++) {
		if(Character.isDigit(s.charAt(i))) {
			ss=ss+s.charAt(i);
		}
	}
	System.out.println(ss);  
	}
}
