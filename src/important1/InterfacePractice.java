package important1;

interface Bank{
	void credit();
	void debit();
}
interface Banks{
	void withdrawal();
	void withdrawal1();
}
class HDFC implements Bank,Banks{
	public void credit() {
		System.out.println("amount is credited");
	}
	public void debit() {
		System.out.println("amount is debited");
	}
	public void withdrawal() {
		System.out.println("money is withdrawal");
	}
	public void withdrawal1() {
		System.out.println("money is not withdrawal");
	}
	
	
}
class ICICI implements Bank,Banks{
	public void credit() {
		System.out.println("amount is credited");
	}
	public void debit() {
		System.out.println("amount is debited");
	}
	public void withdrawal() {
		System.out.println("money is withdrawal");
	}
	public void withdrawal1() {
		System.out.println("money is not withdrawal");
	}
}
public class InterfacePractice {
	
	public static void main (String args[]) {
	
		Banks i=new ICICI();
		i.withdrawal();
		i.withdrawal1();
	}

}