package AutomationPractice;
//method over loading is excecute the code with same method name with diffrent set of argument 
public class Methodoverloading {
	public void add(int a,int b) {
		System.out.println(a+b);
	}
	public void add(int a,int b,int c) {
		System.out.println(a+b+c);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Methodoverloading obj=new Methodoverloading();
		obj.add(5, 5);
		obj.add(2, 2, 2);
	}

}
