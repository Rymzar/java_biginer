package jrm;

public class UserDataValidator {
    //измените метод. В условиях if необходимо заменить вывод код вывода сообщения на консоль, на код который
    //генерирует IllegalArgumentException
    public static void validatePhoneNumber(User user) {
        try{
            if (user.getPhone().length() < 8) {
                throw new IllegalArgumentException("Телефон не может быть короче 8 символов");
            }
            if (!user.getPhone().startsWith("7")){
                throw new IllegalArgumentException("Номер телефона должен начинаться с цифры 7");
            }
        }catch (NullPointerException e){
            System.out.println("Номер телефона не заполнен");
        }
    }
}
