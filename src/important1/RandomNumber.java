package important1;

import java.util.Random;

public class RandomNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number;
		Random random=new Random();
		number=random.nextInt(100);
		System.out.println("generate random number is:"+number);

	}

}
