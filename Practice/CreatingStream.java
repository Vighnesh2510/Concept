package Practice;

import java.util.*;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class CreatingStream {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,23,4,45,56,8,54,34);
        System.out.println(list.stream().filter(x-> x%2==0).collect(Collectors.toList()));

        // Creating the Stream
        // 1. From collection
        Stream<Integer> stream = list.stream();

        // 2. From Array
        int[] array= {1,33,5,6,8,5};
//        Stream<Integer> stream1 = Arrays.stream(array).boxed();

        // 3. Direct method (stream.of)
        Stream<Integer> a = Stream.of(10,12,4,56,3);

        // 4. for iteration
        Stream<Integer> generate = Stream.generate(() -> 10).limit(100);
        List<Integer> collect = Stream.iterate(1, x -> x + 1).limit(100).collect(Collectors.toList());




    }
}
