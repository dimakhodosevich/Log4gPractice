package by.khodosevich.log4gpractice.controller;

import by.khodosevich.log4gpractice.module.Factorial;
import by.khodosevich.log4gpractice.module.exception.WrongNumberException;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("\nInput factorial number: ");
            int number = scanner.nextInt();

            if(number == -1){
                break;
            }

            try {
                System.out.printf("\nYour result %d!=%d", number, Factorial.factorial(number));
            } catch (WrongNumberException e) {
                System.out.println(e);
                System.out.println(e.getMessage());
            }
        }
    }
}
