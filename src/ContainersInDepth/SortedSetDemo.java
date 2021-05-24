package ContainersInDepth;

/**
 * @program: ThinkingInJava
 * @description:
 * @author: LMH
 * @create: 2021-05-23
 **/
import java.util.*;


public class SortedSetDemo {
    public static void main(String[] args) {
        SortedSet<String> sortedSet = new TreeSet<String>();
        Collections.addAll(sortedSet,
                "one two three four five six seven eight"
                        .split(" "));
        print(sortedSet);
        String low = sortedSet.first();
        String high = sortedSet.last();
        print(low);
        print(high);
        Iterator<String> it = sortedSet.iterator();
        for(int i = 0; i <= 6; i++) {
            if(i == 3) low = it.next();
            if(i == 6) high = it.next();
            else it.next();
        }
        print(low);
        print(high);
        print(sortedSet.subSet(low, high));//[)
        print(sortedSet.headSet(high));
        print(sortedSet.tailSet(low));
    }

    public static void print(Collection c){
        System.out.println(c);
    }

    public static void print(String c){
        System.out.println(c);
    }
}
