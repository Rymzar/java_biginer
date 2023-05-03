package jrm;

public class CheckerResult {
    public static void main(String[] args) {
        Checker checker = new Checker();
        System.out.println(checker.checkIt(2));
        System.out.println(checker.checkIt(2.3, 4.5));
    }
}
