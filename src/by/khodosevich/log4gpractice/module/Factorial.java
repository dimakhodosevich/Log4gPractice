package by.khodosevich.log4gpractice.module;

import by.khodosevich.log4gpractice.module.exception.WrongNumberException;

public class Factorial {
    public static int factorial(int number) throws WrongNumberException{
        System.out.println("Method starts with arg = " + number);
        if(number<0){
            System.out.println("Exception. Wrong number!!! Number should be positive.");
            throw new WrongNumberException("Your number less then 0");
        }

        int factorial = 1;
        System.out.println("Algorithm starts with factorial = " + factorial);

        if(number==0 || number == 1){
            return factorial;
        }

        for (int i = 2; i <= number; i++) {
            factorial *= i;
        }

        System.out.println("Method ends with result = "+ factorial);
        return  factorial;
    }
}
