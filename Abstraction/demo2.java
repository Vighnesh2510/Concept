//interface
package Abstraction;

interface A{
	String str="Nimap"; // public + static + final 
	void display();// abstract + public 
	default void main() { // default 
		System.out.println("may or may not override in implementing class");
//		number(); // to access private method 
	}
	static void Name() {// static method
		System.out.println("static metod");
		number();
	}
	private static void number() {
		System.out.println("7715967754");// to access this method we have to give access to default method 
	}
}
class Company implements A{
	public void display() {
//		str="Google";  final  variable
		System.out.println("The company name : "+ str);// variable str is public 
	}
}

public class demo2 {

	public static void main(String[] args) {
	 Company n=new Company();
	 n.display();
	 n.main();
	 A.Name();
	 System.out.println("Name: "+ A.str);// variable is static
         
	}

}
