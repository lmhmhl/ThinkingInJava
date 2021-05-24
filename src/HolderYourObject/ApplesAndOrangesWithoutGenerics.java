package HolderYourObject;

/**
 * @program: ThinkingInJava
 * @description:
 * @author: LMH
 * @create: 2021-05-21
 **/
import java.util.*;
class Apple {
    private static long counter;
    private final long id = counter++;
    public long id() { return id; }
}
class Orange {}
public class ApplesAndOrangesWithoutGenerics {
    @SuppressWarnings("unchecked")
    static List list = new LinkedList();

    public static void main(String[] args) {
        list.add(new Apple());
        Collection<Integer> c = new ArrayList<Integer>();
        ArrayList apples = new ArrayList();
        for(int i = 0; i < 3; i++)
            apples.add(new Apple());
        // Not prevented from adding an Orange to apples:
        apples.add(new Orange());
        apples.stream().map(Object::getClass).forEach(System.out::println);
        // Orange is detected only at run time
    }
} /* (Execute to see output) *///:~

