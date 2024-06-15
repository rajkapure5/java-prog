package important1;

public class OddOrEvenNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]=new int[] {11,12,14,15,17,16};
		for(int i=0;i<a.length;i++) {
			if(a[i]%2==0) {
				System.out.println("Number is even"+a[i]);
			}
			else {
				System.out.println("Number is odd"+a[i]);
			}
		}
	}

}
