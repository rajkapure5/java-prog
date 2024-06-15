package important1;

public class ConvertOneArrayToAnotherArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]=new int[]{1,2,3,4,5};//create one array a
		int b[]=new int[a.length]; //create array B with length array a
		for(int i=0;i<a.length;i++) {
		b[i]=a[i];						//convert array a to b
		}
		for(int i=0;i<a.length;i++) {	//print array a value
			System.out.print(a[i]+" ");
			
		}
		System.out.println();
			
			for(int i=0;i<b.length;i++) {	//print array b value
				System.out.print(b[i]+" ");
			}
	}

}
