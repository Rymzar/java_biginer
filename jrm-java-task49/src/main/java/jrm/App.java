package jrm;

public class App {
    public static void main(String[] args) {
        User user = new User();
        user.setFirstName("nik");
        user.setEmail("rmz@yandex.ru");
        UserDataValidator userDataValidator = new UserDataValidator();
        userDataValidator.validatePhoneNumber(user);
    }
}
