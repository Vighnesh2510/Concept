// Final variable example
//package finalKeyword;
//
//class A {
//   final int VALUEs = 100; // Final variable (constant)
//    
//    A() { // Constructor
//        System.out.println("The value is " + VALUEs);
//    }
//}
//
//class B extends A {
//    B() { // Constructor
//        System.out.println("Subclass constructor executed.");
//      VALUEs=200;
//      System.out.print(VALUEs);
//    }
//}
//
//public class New {
//    public static void main(String[] args) {
//        B obj = new B(); // Creating an object
//    }
//}

//Final Method
//package finalKeyword;
//
//class A{
//	final void Display() {
//		System.out.print("Hello World!!");
//	}
//}
//class B extends A{
////	@Override 
////	void Display() { // final method cant e override
////		System.out.println("Welcome to the world of programmings");
////	}
//}
//class New{
//	public static void main(String[] args) {
////		B obj=new B();
////		obj.display();
//		
//		A obj1= new A();
//		obj1.Display();
//	}
//}

//Final class 
package finalKeyword;

 final class A{
	void Show(){
		System.out.println("Nimap Company");
	}
	
// class B extends A{ // final abstract class cant be override 
//	 @Override 
//	 void Show() {
//		 System.out.println("Google Company");
//	 }
// }
}
 class New{
	 public static void main(String[] args) {
		A obj=new A();
		obj.Show();
	}
}