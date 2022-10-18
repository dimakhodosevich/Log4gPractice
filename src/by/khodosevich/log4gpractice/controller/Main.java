package by.khodosevich.log4gpractice.controller;

import by.khodosevich.log4gpractice.module.Factorial;
import by.khodosevich.log4gpractice.module.exception.WrongNumberException;

import java.util.Scanner;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;

public class Main {
    public final static Logger LOGGER;

    static {
        LOGGER = Logger.getRootLogger();
    }

    public static void main(String[] args) {
        BasicConfigurator.configure();
        LOGGER.setLevel(Level.ALL);
        LOGGER.fatal("Logger fatal");
        LOGGER.error("Logger error");
        LOGGER.warn("Logger warn");
        LOGGER.info("Logger warn");
        LOGGER.debug("Logger debug");
        LOGGER.trace("Logger trace");


//        Scanner scanner = new Scanner(System.in);
//
//        while (true) {
//            System.out.print("\nInput factorial number: ");
//            int number = scanner.nextInt();
//
//            if(number == -1){
//                break;
//            }
//
//            try {
//                String msg = String.format("\nYour result %d!=%d", number, Factorial.factorial(number));
//                System.out.printf(msg);
//                LOGGER.info(msg);
//            } catch (WrongNumberException e) {
//
//                LOGGER.fatal(e.getMessage(), e);
//            }
//        }
    }
}
