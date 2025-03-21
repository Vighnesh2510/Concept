package Generic;

//generic class
//public class AllGeneric {
//    public static void main(String[] args) {
//        // Generic is a feature in java which allows us to create the class, interface and method with the parameter <>
//        A<String> domeName = new A<>("Vighnesh");
//        System.out.println(domeName.getName());
//
//
//    }
//}
//
//class A<E>{
//    private E name;
//    public A(E name){
//        this.name= name;
//    }
//    public E getName(){
//        return name;
//    }
//
//}

// Generic Method
//public class AllGeneric {
//    public static void main(String[] args) {
//        // Generic is a feature in java which allows us to create the class, interface and method with the parameter <>
//        Utitlity.display(100);
//    }
//}
//
//class Utitlity{
//    public static <E> void display(E num){
//        System.out.println(num);
//    }
//}

//Generic Interface

interface Gene<E>{
    void display(E name);
    E get();
}
class A <E> implements Gene<E>{

    private E name;
    @Override
    public void display(E name) {
        this.name=name;
    }

    @Override
    public E get() {
        return name;
    }
}

public class AllGeneric {
    public static void main(String[] args) {
      Gene<String> ene = new A<String>();
      ene.display("Vighnesh");
        System.out.println(ene.get());

    }
}