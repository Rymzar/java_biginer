package jrm;

public class OperationWithUser {
    public static void changePassword(User user, String newPassword) {
        if (user.getRole() != null & user.getRole() != Role.ADMIN) {
            System.out.printf(
                    "пароль не может быть изменен пользователем с роль %s \n",
                    user.getRole()
            );
        }

        if (user.getRole() != null & user.getRole() == Role.ADMIN) {
            user.setPassword(newPassword);
        }
    }
}
