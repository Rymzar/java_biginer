package jrm;

public class CheckNumber {
    void checkResult() {
        int intFromConsole = new WriteItDown().consoleRead();
        if (intFromConsole < 5) {
            System.out.println("введенное Вами число меньше 5");
        }
    }
}
