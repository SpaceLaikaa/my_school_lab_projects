package bymyself.Old;

import java.util.Scanner;

public class AgeGate {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your age: ");
        int age = input.nextInt();

        if (age < 18) {
            System.out.println("Sorry, you are not old enough.");
        } else if (age >= 18) {
            System.out.println("Access granted. Welcome!");
        } else {
            System.out.println("Please enter a valid number.");
        }
    }
}
