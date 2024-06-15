package important1;

public class Overriding {
	public void r(int a,int b) {
		System.out.println(a+b);
	}
}
class Raj extends Overriding{
	public void r(int a,int b) {
		System.out.println(a-b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Raj j=new Raj();
		j.r(10,20);
		Overriding n=new Overriding();
		n.r(10,20);
	}
}
