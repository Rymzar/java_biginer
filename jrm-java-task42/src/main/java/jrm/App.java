package jrm;

public class App {
    public static void main(String[] args) {
        HttpConnection httpConnection = new HttpConnection("http connection", "admin", "123");
        httpConnection.connect();
    }
}
