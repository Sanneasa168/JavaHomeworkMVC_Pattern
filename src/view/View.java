package view;

import controller.UserController;
import model.User;

public class View {
    private static final UserController userController = new UserController();
    public static void UI(){
        System.out.println("This is views :");
        userController.getAllUser()
                .forEach(System.out::println);
        System.out.println("=".repeat(50));

        userController.addNewUser(new User(3,"Maly","Maly@gmail.com"));
        System.out.println("After adding new user :");
        userController.getAllUser().forEach(System.out::println);
        System.out.println("=".repeat(50));

        System.out.println("Deleted User :");
        userController.deleteUser(2).forEach(System.out::println);

        System.out.println("=".repeat(50));
        System.out.println("Successfully deleted User :");
        userController.getAllUser()
                .forEach(System.out::println);
        System.out.println("=".repeat(50));
    }
}
