package by.khodosevich.log4gpractice.module;

import by.khodosevich.log4gpractice.module.exception.WrongNumberException;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FactorialTest {

    @Test
    public void factorial_test_positive_with_zero(){
        int actual = 0;
        int expected = 1;
        int result = Factorial.factorial(actual);

        Assert.assertEquals(expected,result);
    }

    @Test
    public void factorial_test_positive_with_one(){
        int actual = 1;
        int expected = 1;
        int result = Factorial.factorial(actual);

        Assert.assertEquals(expected,result);
    }

    @Test
    public void factorial_test_positive_with_five(){
        int actual = 5;
        int expected = 120;
        int result = Factorial.factorial(actual);

        Assert.assertEquals(expected,result);
    }


    @Test(expected = WrongNumberException.class)
    public void factorial_test_negative_with_minus(){
        int actual = -1;
        int expected = 120;
        int result = Factorial.factorial(actual);

    }
}