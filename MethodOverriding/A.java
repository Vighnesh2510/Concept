// Method Overriding 
package MethodOverriding;

class Animal{
	void sound() {
		System.out.println("The sound of a particular animal");
	}
}
class Dog extends Animal{
	 @Override
	 void sound() {
		 System.out.println("The dogs barks");
	 }
}

class human extends Animal{
	@Override
	void sound() {
		System.out.print("The human speak and can craete multiple sound");
	}
}
public class A {

	public static void main(String[] args) {
		Animal obj= new Dog(); // Dog obj=new Dog();
		obj.sound();
		
		Animal obj1= new human();// human obj1= new human();
		obj1.sound();

	}

}
