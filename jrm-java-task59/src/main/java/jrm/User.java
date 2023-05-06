package jrm;

public class User {
    private String password;
    private Role role;

    public User(String password, Role role) {
        this.password = password;
        this.role = role;
    }

    public String getPassword() {
        return password;
    }

    public Role getRole() {
        return role;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setRole(Role role) {
        this.role = role;
    }
}
