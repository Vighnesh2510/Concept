
//package p2;
//
//import p1.A;
//
//public class C extends A {
//
//	public static void main(String[] args) {
//		 TODO Auto-generated method stub
//      C obj=new C();
//      System.out.println("Public a: " + obj.a);   // Accessible
//       System.out.println("Private b: " + obj.b); // Not accessible (private)
//      // System.out.println("Default c: " + obj.c); // Not accessible (default)
//      System.out.println("Protected d: " + obj.d); // Accessible (inherited)
//	}
//
//}


//accessing outside the package
//package p2; 
//
//import p1.A;
//
//public class C{
//	public static void main(String[] args) {
//		A n= new A();
//		System.out.println(n.a);
//	}
//}