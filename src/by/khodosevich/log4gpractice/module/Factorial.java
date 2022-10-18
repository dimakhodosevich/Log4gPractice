package by.khodosevich.log4gpractice.module;

import by.khodosevich.log4gpractice.module.exception.WrongNumberException;

public class Factorial {
    public static int factorial(int number) throws WrongNumberException{
        if(number<0){
            throw new WrongNumberException("Your number less then 0");
        }

        int factorial = 1;

        if(number==0 || number == 1){
            return factorial;
        }

        for (int i = 2; i <= number; i++) {
            factorial *= i;
        }

        return  factorial;
    }
}
