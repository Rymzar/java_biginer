package jrm;

public class App {
    public static void main(String[] args) {
        Server.establishingConnection(new HttpConnection("admin", "123"));
    }
}
