package Practice;

public class FunctionalInterface {
    public static void main(String[] args) {

        // Custom FunctionalInterface
//        MathOperator num= (a,b)->a+b;
//        int num2=num.solve(10,20);
//        System.out.println(num2);

        // Consumer FuctionalInterface
//        Consumer<Integer> num= x-> {
//            if(x%2==0){
//                System.out.println("even");
//            }else{
//                System.out.println("odd");
//            }
//        };
//        num.accept(10);


        //Supplier DFunctionalInterface
//        Supplier<String> num= ()-> "Hello";
//        System.out.println(num.get());


        //Predicate FunctionalInterface
//        Predicate<Integer> num= (x)-> x%2==0;
//        System.out.println(num.test(10));
//        Predicate<String> checkfirest = x-> x.toUpperCase().startsWith("A");
//        System.out.println(checkfirest.test("ansh"));


        //Function FunctionalInterface
//        Function<Integer, Integer> doublevalue= x->x*2;
//        System.out.println(doublevalue.apply(10));
//        Function<Integer, Integer>  tripleValue = x-> x*3;
//        System.out.println((tripleValue.apply(20)));
//
//        System.out.println(doublevalue.andThen(tripleValue).apply(20)); // first doublevalue oper and then triple
//        System.out.println(doublevalue.compose(tripleValue).apply(20)); // first triplevalue oper and then double
//
//        Function<Integer, Integer> idetity= Function.identity();
//        System.out.println(idetity.apply(5));

}
    }

    // functionalInterface
//interface MathOperator{
//
//    public int solve(int a , int b);
//}

