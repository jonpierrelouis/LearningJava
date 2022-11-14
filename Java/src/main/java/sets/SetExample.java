package sets;

import java.util.HashSet;
import java.util.Set;

public class SetExample {

    /**
     * https://docs.oracle.com/javase/8/docs/api/java/util/Set.html
     *
     * A set is a data structure that does not have any repeated objects
     */

    public static void main(String[] args) {

    }

    static Set SimpleHashSet(){
        Set<Integer> set = new HashSet<>();
        
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(1);

        for(Integer i : set){
            System.out.println(i);
        }

        System.out.println("Size: " +set.size());

        return set;
    }
}
