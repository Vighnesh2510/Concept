
// PARAMETRIZED CONSTRUCTOR
//package Const;
//
//public class Constructor {
//
//	  Constructor(int x){
//		System.out.println("The first value is"+x);
//	}
//	  Constructor(int y,int z){
//		  System.out.println("The first value is"+y);
//		  System.out.println("The second value is"+z);
//		  System.out.println("Total value is"+(y+z));
//	  }
//	public static void main(String[] args) {
//		Constructor n= new Constructor(10);
//		Constructor n1=new Constructor(10,20);
//	}
//}

//COPY CONSTRUCTOR 
//package Const;
//
//public class Constructor{
//	int a;	
//	String b;
//	int x;
//	String y;
//	Constructor(){
//		a=10;
//		b="Vighnesh";
//		System.out.println(a+" "+b);
//	}
//	Constructor(Constructor ref){
//		x=ref.a;
//		y=ref.b;
//		System.out.println(x+" "+y);
//	}
//	public static void main(String[] args) {
//		Constructor n= new Constructor();
//		Constructor n1= new Constructor(n);
//	}
//}


//private Constructor
//package Const;
//class Constructor{
//	int a,b;
//	private Constructor() {
//		a=10;
//		b=20;
//		System.out.println(a+b);
//	}
//	public static void main(String[] args) {
//		Constructor n=new Constructor();
//	}
//}

//Default Constructor
//package Const;
//
//class Constructor{
//	int a; String n;
//	Constructor(){
//		 a=10;
//		 n="Nimap";
//	}
//	void show() {
//		System.out.println(n+" "+a);
//	}
//	public static void main(String[] args) {
//		Constructor n=new Constructor();
//		n.show();
//	}
//}

//constructor Overloading
//package Const;
//
//class Constructor{
//	int a;
//	String b;
//	
//	Constructor(){
//	a=10;
//	b="ram";
//	System.out.println(a+" "+b);
//	}
//	
//	Constructor(String n){
//		a=15;
//		System.out.println(n+" as "+a+" chocolates");
//	}
//	Constructor(int x, int y, String c){
//		System.out.println(c+" as "+(x+y)+" more chocolate then him");
//	}
//	public static void main(String[] args) {
//		Constructor n=new Constructor();
//		Constructor n1=new Constructor("vighnesh");
//		Constructor n2=new Constructor(12,10,"Lucky");
//	}
//}