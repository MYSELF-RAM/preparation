package AutomationPractice;

public class SuperChild extends SuperParent{
	//using super keyword we get both child and parent property
	public void mobile() {
		System.out.println("iphone");
		super.mobile();
	}
	public static void main(String[] args) {
		SuperChild obj=new SuperChild();
		obj.mobile();

		
	}
	

}
