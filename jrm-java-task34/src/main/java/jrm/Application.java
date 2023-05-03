package jrm;

public class Application {
    public static void main(String[] args) {
        User user = new User();
        user.setAge(18);
        Shop shop = new Shop();
        shop.sell(user);
    }
}
