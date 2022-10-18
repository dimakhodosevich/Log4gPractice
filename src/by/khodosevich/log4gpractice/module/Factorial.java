package by.khodosevich.log4gpractice.module;

import by.khodosevich.log4gpractice.module.exception.WrongNumberException;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;

import static by.khodosevich.log4gpractice.controller.Main.LOGGER;

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
        LOGGER.debug("-----------------------");
        LOGGER.debug("Program calls: " + count);
        LOGGER.debug("Method starts with arg = " + number);
        if(number<0){
            LOGGER.debug("Exception. Wrong number!!! Number should be positive.");
            throw new WrongNumberException("Your number less then 0");
        }

        int factorial = 1;
        LOGGER.debug("Algorithm starts with factorial = " + factorial);

        if(number==0 || number == 1){
            return factorial;
        }

        for (int i = 2; i <= number; i++) {
            factorial *= i;
        }

        LOGGER.info("Method ends with result = "+ factorial);

        return  factorial;
    }
}
