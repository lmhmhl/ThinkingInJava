package HolderYourObject;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/**
 * @program: ThinkingInJava
 * @description:
 * @author: LMH
 * @create: 2021-05-22
 **/
public class SetOfInteger {
    public static void main(String[] args) {
        Random rand = new Random(47);
        Set<Integer> intset = new HashSet<>();
        for(int i = 0; i < 10000; i++)
            intset.add(rand.nextInt(30));
        System.out.println(intset);
    }
}