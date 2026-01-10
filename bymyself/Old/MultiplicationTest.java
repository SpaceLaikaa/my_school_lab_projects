package bymyself.Old;

import java.util.Scanner;

public class MultiplicationTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("You're about to multiply two numbers. Please enter the first number: ");
        int a = input.nextInt();

        System.out.println("Now enter the second number: ");
        int b = input.nextInt();

        System.out.print("Here is the result of your multiplication: " + (a * b));
    }
}
