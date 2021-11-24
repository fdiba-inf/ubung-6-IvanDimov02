package exercise6;

import java.util.Arrays;
import java.util.Scanner;
import java.lang.Math;
import java.util.Random;

public class Hangman {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String words[] = {"First", "Second", "Third", "Fourth", "Fifth"};

          int a = new Random().nextInt(4);
          String con = "yes";
          String word = words[a];   
          char[] guess = new char[word.length()];
          char letter;
          int counter = 0;
          System.out.println("How many tries will you have? Minimum 7: ");
        int size = input.nextInt();
        char[] ch = new char[size];
        int right = 0;

        for (int i = 0; i < word.length(); i++) {
            guess[i] = '_';
        }
        int time = (int) System.currentTimeMillis();
        while (con.equals("yes")) {
            letter = input.next().charAt(0);
            counter++;
            for (int i = 0; i < counter; i++) {
                if (letter == ch[i]) {
                    System.out.print("Letter already used! Try another one: ");
                    letter = input.next().charAt(0);
                    i = 0;
                }
            }
            ch[counter-1] = letter;
            for (int i = 0; i < word.length(); i++) {
                if (letter == word.charAt(i)) {
                    guess[i] = letter;
                    right++;
                }
            }
            System.out.println(guess);
            if (right == word.length()) {
                counter = size;
            }

            if (counter == size) {
                System.out.print("Do you want to begin a new game? ");
                input.nextLine();
                con = input.nextLine();
                if (con.equals("yes")) {
                    right = 0;
                    a = new Random().nextInt(4);
                    word = words[a];
                    counter = 0;
                    System.out.println("How many tries will you have?");
                    size = input.nextInt();
                    char[] temp = new char[size];
                    ch = temp;
                    for (int i = 0; i < word.length(); i++) {
                        guess[i] = '_';
                    }

                }
            }
        }
        int timeend = (int) System.currentTimeMillis();
        int total = timeend - time;
        System.out.println("Time: " + total);
    }
}