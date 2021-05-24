package HolderYourObject;

/**
 * @program: ThinkingInJava
 * @description:
 * @author: LMH
 * @create: 2021-05-22
 **/

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Random;

public class Statistics {
    public static void main(String[] args) {
        Random rand = new Random(47);
        Map<Integer, Integer> m =
                new HashMap<Integer, Integer>();
        m.put(null,null);
        Map<Integer, Integer> t =
                new Hashtable<>();
        t.put(1,1);
        for (int i = 0; i < 10000; i++) {
            // Produce a number between 0 and 20:
            int r = rand.nextInt(20);
            m.putIfAbsent(r, 1);
            m.put(r, m.get(r) + 1);
        }
        System.out.println(m);
    }
}
