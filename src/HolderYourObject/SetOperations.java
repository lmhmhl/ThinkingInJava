package HolderYourObject;

/**
 * @program: ThinkingInJava
 * @description:
 * @author: LMH
 * @create: 2021-05-22
 **/
import java.util.*;
public class SetOperations {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        String alphabet = "A B C D E F G H I G K L M N O P Q R S T U V W X Y Z";
        Collections.addAll(set,alphabet.split(" "));
        System.out.println(set.contains("A"));
        System.out.println(set.contains("a"));

        Set<String> set1 =  new HashSet<>();
        set.add("A");
        System.out.println(set.containsAll(set1));
    }
}
