package jrm;

public class Example {
    public static void main(String[] args) {
        int[] array = {1, 1, 3, 4, 10, 12};
        // цикл в стиле foreach вывести на экран четные элементы массива
        int num;
        for (int i : array) {
            num = i % 2;
            if (num == 0) System.out.println(i);
        }
    }

}
