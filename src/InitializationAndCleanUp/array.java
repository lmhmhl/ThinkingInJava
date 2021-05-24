package InitializationAndCleanUp;

/**
 * @program: ThinkingInJava
 * @description:
 * @author: LMH
 * @create: 2021-05-20
 **/
import java.lang.reflect.Array;
import java.util.*;

import static jdk.nashorn.internal.objects.Global.print;
class ArrayClassObj {
    public static void main(String[] args) {
        Random rand = new Random(47);
        Integer[] a = new Integer[rand.nextInt(20)];
        System.out.println(Arrays.toString(a));
        System.out.println("length of a = " + a.length);
        for(int i = 0; i < a.length; i++)
            a[i] = rand.nextInt(500); // Autoboxing
        System.out.println(Arrays.toString(a));
    }
}
