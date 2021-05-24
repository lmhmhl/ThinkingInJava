package HolderYourObject;

import java.util.*;
import java.util.function.Supplier;

/**
 * @program: ThinkingInJava
 * @description:
 * @author: LMH
 * @create: 2021-05-21
 **/
public class PrintingContainers {
    static Collection<String> fill(Collection<String> collection) {
        collection.add("rat");
        collection.add("cat");
        collection.add("dog");
        collection.add("dog");
        return collection;
    }

    static Map<String, String> fill(Map<String, String> map) {
        map.put("rat", "Fuzzy");
        map.put("cat", "Rags");
        map.put("dog", "Bosco");
        map.put("dog", "Spot");
        return map;
    }

    public static void main(String[] args) {
        printCollection(ArrayList::new);
        printCollection(LinkedList::new);
////        print(fill(new HashSet<String>()));
//        print(fill(new TreeSet<String>()));
//        print(fill(new LinkedHashSet<String>()));
//        print(fill(new TreeMap<String,String>());
        printMap(HashMap::new);
//        );
//        print(fill(new LinkedHashMap<String,String>()));
    }

    private static void printCollection(Supplier<Collection> supplier) {
        Object container = supplier.get();
        fill((Collection<String>) container);
        System.out.println(container);
    }
    private static void printMap(Supplier<Map> supplier) {
        Object container = supplier.get();
        fill((Map<String, String>) container);
        System.out.println(container);
    }
}
