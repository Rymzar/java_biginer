package jrm;

public class UserDataValidator {
    public static void validatePhoneNumber(User user) {
        try{
            if (user.getPhone().length() < 8) {
                throw new InvalidPhoneLengthException();
            }
            if (!user.getPhone().startsWith("7")) {
                throw new InvalidPhoneFormatException();
            }
        }catch (NullPointerException e){
            System.out.println("Номер телефона не заполнен");
        }
    }
}
