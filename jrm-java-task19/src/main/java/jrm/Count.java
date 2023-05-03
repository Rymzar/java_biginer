package jrm;

import java.util.Scanner;

public class Count {

    private String stopWord = "стоп";


    void counting() {
        int count = 0;
        int sum = 0;
        String systemInput;

        do {
            System.out.println("введите число");
            Scanner inConsole = new Scanner(System.in);
            systemInput = inConsole.nextLine();
            if (!systemInput.equals(stopWord)) {
                count += 1;
                sum += count;
            }

        } while (!systemInput.toLowerCase().equals(stopWord));
        System.out.println("общее количество введенных цифр = " + count);
        System.out.println("общая сумма = " + sum);
    }
}
