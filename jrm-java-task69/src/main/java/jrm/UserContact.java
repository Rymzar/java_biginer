package jrm;

import java.util.HashMap;

public class UserContact {

    public static void main(String[] args) {
        String nameForFirstClient = "Иванов Иван Иванович";
        String phoneNumberForFirstClient = "89148500000";

        String nameForSecondUser = "Петров Петр Петрович";
        String phoneForSecondUser = "89148511111";


//создайте HashMap и добавьте key(телефон) и value(имя клиента)

//распечатйте все ключи, которые будут содержаться в HashMap ожидаем, что мы получим
        HashMap<String, String> contact = new HashMap<>();
        contact.put(phoneNumberForFirstClient, nameForFirstClient);
        contact.put(phoneForSecondUser, nameForSecondUser);

        for (String phone : contact.keySet()) {
            System.out.println(phone);
        }

    }
}
