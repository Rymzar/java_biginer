package jrm;

public class App {
    //после изменения метода validatePhoneNumber() расскоментируйте код, запустите и убедитесь, что на консоли
    // получим строку : "Номер телефона не заполнен"
    public static void main(String[] args) {
       User user = new User();
       user.setEmail("email");
       user.setFirstName("name");
        UserDataValidator.validatePhoneNumber(user);
    }
}
