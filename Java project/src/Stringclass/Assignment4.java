package Stringclass;

//ADDITION OF INTEGER 

public class Assignment4 {
	public static void main(String[] args) {
		String s="20asd5red45f2";
		char[] ss = s.toCharArray();
		int add=0;
		for(int i=0;i<s.length();i++) {
			if(Character.isDigit(ss[i])) {
				add=add+Integer.parseInt(s.valueOf(ss[i]));
			}
		}
		System.out.println(add);		
	}

}
