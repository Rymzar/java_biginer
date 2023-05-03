package jrm;

public class ReloadExample {
    public static void main(String[] args) {
// вызовите три конструктора по очереди
        System.out.println(new Reload(1));
        System.out.println(new Reload(1,2));
        System.out.println(new Reload(1,2,3));
    }
}
