package important1;

public class CountOvels {
	
public static void main (String args[]) {
	String str="Automation is easy";
	int count =0;
	for(int i=0;i<str.length();i++) {
		char s=str.charAt(i);
		if(s=='i'||s=='o') {
			count++;
			
	}
		
}
	System.out.println(count);
}
}