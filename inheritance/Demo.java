//Simple inheritance 
//package inheritance;
//
//class A{
//	int a,b,c;
//	void add() {
//		a=20;
//		b=10;
//		c=a+b;
//		System.out.println("add: "+c);
//	}
//}
//class Demo extends A{
//	
//	void sub() {
//		c=a-b;
//		System.out.print("Sub: "+c);
//	}
//	public static void main(String[] args) {
//		System.out.println("the number is 20 and 10");
//		Demo obj=new Demo();
//		obj.add();
//		obj.sub();
//	}
//}

//Multi-level inheritance 
//package inheritance;
//
//class GrandFather{
//	void showGeneration() {
//		System.out.println("Grandfather");
//	}
//}
//class parent extends GrandFather{
//	void  displayParents() {
//		System.out.println("Parenst-- MOM and DAD");
//	}
//}
//class Demo extends parent{
//	void introduce() {
//		System.out.println("I am son");
//	}
//	public static void main(String[] args)
//	{
//	Demo n=new Demo();
//	n.showGeneration();
//	n.displayParents();
//	n.introduce();
//	}
//	}

// Hierarchical inheritance
package inheritance;

class A{
	int a,b,c;
	void Add() {
		a=10;
		b=20;
		c=a+b;
	}
}
class B extends A {
	String str= "Vighnesh";
	void display() {
		System.out.println("The name is "+ str+"as total"+ c+"chocolate");
	}
}
class C extends A{
	void totalmember() {
		System.out.println("The total number of member is "+c);
	}
}
class Demo{
	public static void main(String[] args) {
		 B n=new B();
		 C n1=new C();
		 n.Add();
		 n.display();
		 n1.Add();
		 n1.totalmember();
		 
	}
}





