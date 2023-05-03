package jrm;

public class Example {

    public static void main(String[] args) {
        int[] array = {13, 1, 1, 3, 4, 10, 12};

        int firstMax = array[0];  // берем два первых элемента
        int secondMax = array[1];

        if (firstMax < secondMax) {
            firstMax = array[1];  // сравниваем кто больше
            secondMax = array[0];
        }

        for (int i = 2; i < array.length; i++) {
            if (firstMax < array[i]) {
                secondMax = firstMax;    // перебираем элементы сравнивая с первыми двумя
                firstMax = array[i];    //  если нашли больший элемент перезаписываем firstMax
            } else if (secondMax < array[i]) {
                secondMax = array[i];   //  если нашли больший элемент перезаписываем secondMax
            }
        }
        System.out.println(firstMax);
        System.out.println(secondMax);
    }
}
