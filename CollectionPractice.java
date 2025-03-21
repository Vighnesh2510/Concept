class CollectionPractice {
    public static void main(String[] args) {
//         Stack<String> Animal = new Stack<>();
//         Animal.push("Dog");
//         Animal.push("Cat");
//         Animal.push("Tiger");
//         Animal.push("Lion");
//
//         System.out.println(Animal);
//
//         System.out.println(Animal.peek());
//
//         System.out.println(Animal.pop());
//         System.out.println(Animal);
//         System.out.println(Animal.isEmpty());
//         System.out.println(Animal.search("Tiger"));
//
//         LinkedList<Integer> queue =new LinkedList<>();
//         queue.add(null);
//         queue.add(null);
//         queue.offer(20);
//         queue.offer(30);
//         queue.offer(40);
//         queue.offer(50);
//
//         System.out.println(queue);
//
//         System.out.println(queue.peek());
//
//         System.out.println(queue.poll());
//
//         System.out.println(queue);
//
//        queue.clear();
//         System.out.println(queue);
//
////        System.out.println(queue.element());
////       System.out.println(queue.remove());
//
//         System.out.println(queue.poll());
//
//
//         System.out.println("PriorityQueue");
//         Queue<Integer> pqueue = new PriorityQueue<>();
//         pqueue.offer(70);
//         pqueue.offer(20);
//         pqueue.offer(80);
//         pqueue.offer(40);
//         pqueue.offer(50);
//
//         System.out.println(pqueue);
//         System.out.println(pqueue.peek());
//         System.out.println(pqueue.contains(70));
//         System.out.println(pqueue.isEmpty());
//         pqueue.clear();
//         System.out.println(pqueue.isEmpty());
//
//         Queue<Integer> p1queue = new PriorityQueue<>(Collections.reverseOrder());
//         p1queue.offer(10);
//         p1queue.offer(30);
//         p1queue.offer(20);
//         p1queue.offer(60);
//         p1queue.offer(50);
//
//         System.out.println(p1queue);
//         System.out.println(p1queue.peek());
//         System.out.println(p1queue.poll());
//         System.out.println(p1queue);
//
//         ArrayDeque<Integer> arrd = new ArrayDeque<>();
//         arrd.offer(10);
//         arrd.offer(20);
//         arrd.offer(30);
//         arrd.offer(40);
//
//         System.out.println(arrd);
//
//         arrd.offerFirst(5);
//         System.out.println(arrd);
//
//         System.out.println(arrd.pollFirst());
//         System.out.println(arrd.pollLast());
//
//         System.out.println(arrd);
//
//         Set<String> hs= new HashSet<>();
//         hs.add(null);
//         hs.add("Anurag");
//         hs.add(null);
//         hs.add("Vighnesh");
//         hs.add("Aighnesh");
//
//         System.out.println(hs);
//
//         System.out.println(hs.size());
//
//         TreeSet<Integer> tree = new TreeSet<>();
//         tree.add(5);
//         tree.add(15);
//         tree.add(25);
//         tree.add(35);
//         tree.add(45);
//
//         System.out.println(tree);
//         System.out.println(tree.first());
//         System.out.println(tree);
//         System.out.println(tree.pollFirst());
//         System.out.println(tree.higher(35));
//         tree.clear();
//
//         Set<Student> StudentSet= new HashSet<>();
//         StudentSet.add(new Student("Anurag", 1));
//         StudentSet.add(new Student("Vighnesh", 2));
//         StudentSet.add(new Student("Siddhesh", 3));
//         StudentSet.add(new Student("Vighnesh", 3));
//
//         Student s1= new Student("Rahul", 10);
//         Student s2= new Student("Sam", 10);
//
//         System.out.println(s1.equals(s2));
//
//
//         System.out.println(StudentSet);
//
//
//         System.out.println("HashMap");
//         Map<String , Integer> HashMap = new HashMap<>();
//         HashMap.put("Vighnesh", 1);
//         HashMap.put(null, 2 );
//         HashMap.put(null, 3 );
//         HashMap.put(null, 2 );
//         HashMap.put("Raju", 2 );
//         HashMap.put("Rashmi", 2 );
//         HashMap.put("Raju", 20);// comman key is not added in the Hashmap
//
//         System.out.println(HashMap);
//         System.out.println(HashMap.get("Vighnesh"));
//
//         HashMap.remove("Vighnesh");
//         System.out.println(HashMap);
//
//         System.out.println(HashMap.containsKey("Vighnesh"));
//         System.out.println(HashMap.containsValue(2));
//
//         System.out.println(HashMap.keySet());
//         System.out.println(HashMap.values());
//         System.out.println(HashMap.entrySet());
//         HashMap.clear();
//         System.out.println(HashMap);
//
//         Map<String, Integer> treemap = new TreeMap<>();
//         treemap.put("Anuraj", 10);
//         treemap.put("Anushka", 20);
//         treemap.put("Ayushi", 30);
//         treemap.put("Anil" , 40);
//
//         System.out.println(treemap);
//         System.out.println(((TreeMap<String, Integer>) treemap).lowerEntry("Anushka"));

//         List<Integer> list= new LinkedList<>();
//         list.add(20);
//         list.add(10);
//
//         Collections.sort(list);
//
//         System.out.println(list);
//         list.sort(null);
//         System.out.println(list);
//
//         list.sort(new IntegerReverse());
//         System.out.println(list);
//         }
//     }
//
//     class IntegerReverse implements Comparator<Integer>{
//         @Override
//         public int compare(Integer o1, Integer o2) {
//             return o1-o2;
//         }

//
//

//
//         List<Student> students = new ArrayList<>();
//         students.add(new Student("Vighnesh", 10));
//         students.add(new Student("rahul", 20));
//         students.add(new Student("Rakesh", 30));
//         students.add(new Student("Sumit", 25));
//
//         students.sort(null);
//         System.out.println(students);

//         students.sort((a, b) -> (a.name.compareTo(b.name)));
//         Comparator<Student> comparator = Comparator.comparing(Student::hashCode).reversed();
//             students.sort(comparator);
//         System.out.println(students);
//         }

//     }
//class IntegerReverse implements Comparator<Student> {
//    @Override
//    public int compare(Student o1, Student o2) {
//        return o1.name.compareTo(o2.name);
//    }
//}
//
//class comparable implements Comparable<Integer>{
//
//    @Override
//    public int compareTo(Integer o) {
//        return 1;
//    }
//}

//        List<Student> stud= new ArrayList<>();
//        stud.add(new Student("Vighnesh", 1));;
//        stud.add(new Student("Rahul", 3));
//        stud.add(new Student("Akshay", 2));
//       students.sort((s1, s2)-> s2.name.compareTo(s1.name))
//        Collections.sort(stud, new Student());
//        System.out.println(stud);
//        stud.sort(null);
    }
}