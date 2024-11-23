package sec001_String;

import java.util.Scanner;

public class P03_loginExercise {
    public static void main(String[] args) {
        String username = "Java";
        String password = "123456";
        for (int i = 2; i >= 0; i--) {
            Scanner sc = new Scanner(System.in);
            System.out.println("please input username:");
            String inputUsername = sc.next();
            System.out.println("please input password");
            String inputPassword = sc.next();

            if (username.equals(inputUsername) && password.equals(inputPassword)) {
                System.out.println("login success");
                break;
            } else {
                if (i == 0) {
                    System.out.println("Please try again tomorrow.");
                } else {
                    System.out.println("Invalid username or password, please try again. You have " + i + " opprotunities");
                }
            }
        }


    }
}
