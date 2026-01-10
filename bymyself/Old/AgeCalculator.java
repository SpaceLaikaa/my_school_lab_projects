package bymyself.Old;

import java.util.Scanner;

public class AgeCalculator {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Don't know your age? You're in the right place! Just enter your birth year and we'll calculate it for you: ");

        int birthYear = input.nextInt();
        int age = 2025 - birthYear;

        System.out.printf("Hmm... Your age might be %02d, or maybe your birthday hasn't come yet this year.", age);
    }
}
