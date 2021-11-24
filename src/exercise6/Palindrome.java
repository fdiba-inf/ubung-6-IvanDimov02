package exercise6;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int n1 = n;
        int first = n;
        int counter = 1;
        while (n != 0) {
          n = n / 10;
          counter++;
        }
        int a[] = new int [counter-1];
        for (int index = 0; index < counter-1; index++) {
            a[index] = n1 % 10;
            n1 = n1 / 10;
        }
        int last = 0;
        for (int index = 0; index < counter-1; index++) {
          last = last * 10;
          last = last + a[index];
        }
        if (last == first) {
          System.out.println("Palindrome: true");
        } else {
          System.out.println("Palindrome: false");
        }
    
     

    }
}
