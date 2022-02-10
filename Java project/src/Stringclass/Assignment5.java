package Stringclass;

// REMOVE THE DUPLICATES FROM STRING

public class Assignment5 {
public static void main(String[] args) {
	String s="abcdabsds";
	String ss="";
	int size=s.length();
	for(int i=0; i<size;i++) {
		boolean condition=false;
		for(int j=0; j<ss.length();j++) {
			if(s.charAt(i)==ss.charAt(j)) {
				condition=true;
				break;
			}
			}
			if(condition==false) {
				ss=ss+s.charAt(i);
			}
}
	
	System.out.println(ss);
}
}
