package InitializationAndCleanUp;

/**
 * @program: ThinkingInJava
 * @description:
 * @author: LMH
 * @create: 2021-05-21
 **/
public enum Spiciness {
    A(1), B(2), C(3);
    int value;

    Spiciness(int a) {
        this.value = a;
    }
} ///:~

class EnumOrder {
    public static void fun(Spiciness s) {
        switch (s) {
            case A:
                System.out.println("A value is "+s.value);
                break;
            case B:
                System.out.println("B value is "+s.value);
                break;
            case C:
                System.out.println("C value is "+s.value);
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + s);
        }
    }

    public static void main(String[] args) {
        for (Spiciness s : Spiciness.values()) {
            fun(s);
            System.out.println(s + ", ordinal " + s.ordinal());
        }
    }
}