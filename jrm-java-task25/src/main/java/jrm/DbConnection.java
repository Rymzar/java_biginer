package jrm;

public class DbConnection {

    private String host;
    private String port;

    public DbConnection(String host, String port) {
        this.host = host;
        this.port = port;
    }

    public DbConnection() {
        this.host = "localHost";
        this.port = "8080";
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }




}
