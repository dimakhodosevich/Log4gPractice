package by.khodosevich.log4gpractice.module;

import by.khodosevich.log4gpractice.module.exception.WrongNumberException;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;

public class Factorial {
    private static int count; // count program calls

    static{
        String fileName = "Log4gPractice.txt";
        try {
            System.setErr(new PrintStream(new File(fileName)));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
    public static int factorial(int number) throws WrongNumberException{
        count++;
        System.err.println("-----------------------");
        System.err.println("Program calls: " + count);
        System.err.println("Method starts with arg = " + number);
        if(number<0){
            System.err.println("Exception. Wrong number!!! Number should be positive.");
            throw new WrongNumberException("Your number less then 0");
        }

        int factorial = 1;
        System.err.println("Algorithm starts with factorial = " + factorial);

        if(number==0 || number == 1){
            return factorial;
        }

        for (int i = 2; i <= number; i++) {
            factorial *= i;
        }

        System.err.println("Method ends with result = "+ factorial);

        return  factorial;
    }
}
