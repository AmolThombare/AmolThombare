package Stringclass;

// PRINT CHARACTERS AND THEIR COUNTS

public class Assignment8 {
	public static void main(String[] args) {
		String s="adsadsbas";
		char[] ss = s.toCharArray();
       int count=0;
       int size=ss.length;
       for(int i=0; i<size;i++) {
    	   count=0;
    	   for(int j=0;j<size;j++) {
    		   if(j<i && ss[i]==ss[j]) {
    			   break;
    		   }
    		   if(ss[j]==ss[i]) {
    			   count++;
    		   }
    		   if(j==size-1) {
    			   System.out.print(ss[i]+""+count);
    		   }
    	   }
       }

		
		
		
                 }
			
		
	}

