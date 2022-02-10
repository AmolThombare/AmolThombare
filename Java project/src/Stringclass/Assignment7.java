package Stringclass;

//REMOVE THE INTEGER FROM STRING

public class Assignment7 {
	public static void main(String[] args) {
		String s="as23der457g3";
		String ss="";
		for(int i=0;i<s.length();i++) {
			if(Character.isAlphabetic(s.charAt(i))) {
				ss=ss+s.charAt(i);
			}
		}
		System.out.println(ss);
	}

}
