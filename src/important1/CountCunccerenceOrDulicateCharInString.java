package important1;

public class CountCunccerenceOrDulicateCharInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Java is the best language";
		int count_length=str.length();//here counting total length
		int total_length_after_removing_a=str.replace("a", "").length();//it is total length after removing a
		int count=count_length-total_length_after_removing_a;
		System.out.println("counting of duplicate char is:"+count);
	}

}
