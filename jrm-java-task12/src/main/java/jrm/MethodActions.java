package jrm;

public class MethodActions {
    void print(String stringForPrint) {
        System.out.println(stringForPrint);
    }

    void invokeMethod() {
        String stringForMethod = "Hello world";
        print(stringForMethod);
    }
}
