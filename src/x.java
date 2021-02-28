
public class x {
	
	
public static void main(String[] args) {
	String str="aaccfrfffggg";
	int count=0;
	int max=0;
	char b=0;
	boolean v=false;
	
	for(int i='A';i<='z';i++) {
		v=false;
		
		count=0;
		for(int j=0;j<str.length();j++) {
			if(str.charAt(j)==(char)i) {
				v=true;
				
				count++;
				
				
			}
			
		}
		
		if(v){  
			System.out.println((char)i+""+count);
		}if(max<count) {
			max=count;
			b=(char)i;
			
			
		}
		
	
	}System.out.println(b+""+max);
	
	
	
}
}
