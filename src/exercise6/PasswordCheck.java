package exercise6;

import java.util.Scanner;


public class PasswordCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        boolean valid = false;
        System.out.println("Enter password: "); 

        do{
          String password = input.nextLine();
          if (password.length() < 8) {
            valid = true;
          }
          for (int i = 0; i < password.length(); i++) {
            if (Character.isLetterOrDigit(password.charAt(i))) {
              valid = true;
              
            }
          }
          int counter = 0;
          for (int i = 0; i < password.length(); i++) {
            if (Character.isDigit(password.charAt(i))) {
              counter ++;
            }
          }
          if ( counter >= 2) {
            valid = true;
          }
        } while (valid == false);
        System.out.println("Password valid!");
    }
}
