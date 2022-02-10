package Stringclass;

//ADDITION OF INTERGER WHICH ARE MERGED

public class Assignment3 {
	public static void main(String[] args) {
		String s= "20dsd10fre5rtg5";
		String ss="";
		int a=0;
		int b=0;
		for(int i=0;i<s.length();i++) {
			if(Character.isDigit(s.charAt(i))) {
				ss=ss+s.charAt(i);
				a=1;
				if(i!=s.length()-1)
					continue;
			}
			if(a==1) {
				int value= Integer.parseInt(ss);
				ss="";
				b=b+value;
				a=0;
				}
			}
		System.out.println("addition is:"+b);
}
}