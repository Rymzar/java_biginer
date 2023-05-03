package jrm;

import java.util.Scanner;

public class WriteItDown {
    int consoleRead() {
        System.out.println("введите-что нибудь на консоль");
        Scanner inConsole = new Scanner(System.in);
        int result = inConsole.nextInt();
        return result;
    }

}
