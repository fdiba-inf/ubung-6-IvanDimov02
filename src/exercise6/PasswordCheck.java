package exercise6;

import java.util.Scanner;
import java.lang.Math;

public class PasswordCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean valid = true;
        do{
          String password = input.nextLine();
          if (password.length() < 8) {
            valid = false;
          }
          for (int i = 0; i < password.length(); i++) {
            if (!(Character.isLetterOrDigit(password.charAt(i)))) {
              valid = false;
              break;
            }
          }
          int counter = 0;
          for (int i = 0; i < password.length(); i++) {
            if (Character.isDigit(password.charAt(i))) {
              counter ++;
            }
          }
          if ( counter < 2) {
            valid = false;
          }
        } while (valid == false);
        System.out.println("Password valid!");
    }
}
