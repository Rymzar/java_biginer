package jrm;

public abstract class Connection {
    private String connectionType;
    private String password;
    private String user;

    //Создайте геттеры на уже три существующих поля. Название методов не должно отходить от конвенций
    //Создайте абстрактный метод protected abstract void connect()
    Connection(String connectionType, String user, String password) {
        this.connectionType = connectionType;
        this.user = user;
        this.password = password;
    }

    public String getConnectionType() {
        return connectionType;
    }

    public void setConnectionType(String connectionType) {
        this.connectionType = connectionType;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    protected abstract void connect();
}
