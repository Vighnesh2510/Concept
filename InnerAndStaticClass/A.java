//Inner class
//package InnerAndStaticClass;
//
//public class A {
//
//	private String str="Nimap";
//	
//	void show() {
//		int a =0;
//		int b=20;
//		System.out.println("sum is "+(a+b));
//		}
//	  class B{
//		 void display() {
//			 System.out.println(str+" is a IT company"); 
//		 }
//	 }
//	
//	public static void main(String[] args) {
//		A n=new A();
//		A.B n2= n.new B();
//		n.show();
//		n2.display();
//		
//	}
//
//}

//Static class
package InnerAndStaticClass;

public class A {

	private static String str="Nimap";
	
	void show() {
		int a =0;
		int b=20;
		System.out.println("sum is "+(a+b));
		}
	  static class B{
		 void display() {
			 System.out.println(str+" is a IT company"); 
		 }
	 }
	
	public static void main(String[] args) {
		A n=new A();
		B n2= new B();
		n.show();
		n2.display();
		
	}

}
