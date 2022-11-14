package sets;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetExample {

    /**
     * https://docs.oracle.com/javase/8/docs/api/java/util/Set.html
     *
     * A set is a data structure that does not have any repeated objects
     */

    public static void main(String[] args) {
        simpleHashSet();

    }

    static void simpleHashSet(){
        Set<Integer> set = new HashSet<>();

        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(1);

        //for some reason this does not work
//        while(set.iterator().hasNext()){
//            System.out.print(set.iterator().next());
//        }

        set.forEach(System.out::println);

        System.out.println("--------------------");

        for(Integer i : set){
            System.out.print(i +" ");
        }
        System.out.println("");
        System.out.println("Size: " +set.size());

        System.out.println("Contains 1: " +set.contains(1));

        System.out.println("Removing the number 1");
        set.remove(1);

        System.out.println("Contains 1: " +set.contains(1));

        System.out.println(set);

    }

}
