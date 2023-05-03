package jrm;

import java.util.Objects;

public class ArrayChanger {

    public static void processArray(User[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (Objects.requireNonNull(arr[i]).getAge() < 18) {
                arr[i] = null;
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        User[] users = new User[2];
        users[0] = new User(17, "Ivan");
        users[1] = new User(21, "Stepan");

        processArray(users);
    }
}
