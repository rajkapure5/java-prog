package important1;

public class FiboNacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a=0,b=1,c;
		
		System.out.println(a+" "+b);
		for(int i=0;i<=5;i++) {
			c=a+b;
			a=b;
			b=c;
			System.out.println(c);
		}
	}

}
