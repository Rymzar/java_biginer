package jrm;

public class NestedCycle {
    //для прохождения смотри "шаги"
    public static void main(String[] args) {
        String[] strings = {"*", "**", "***", "****", "*****"};
        for (int i = 0; i<5; i++) {
            System.out.println(strings[i]);
        }
    }
}
