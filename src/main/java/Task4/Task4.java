package Task4;

import Task2.Task2;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class Task4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try {
            Logger logger = Logger.getLogger(Task2.class.getName());
            FileHandler fh = new FileHandler("D:\\Программирование\\Java Core\\Java\\Lesson2\\homework2\\homework2\\src\\main\\java\\Task4\\logger.txt");
            logger.addHandler(fh);
            SimpleFormatter sFormat = new SimpleFormatter();
            fh.setFormatter(sFormat);
            logger.setUseParentHandlers(false);
            logger.log(Level.INFO, "Начало логирования");

            int res = 0;
            System.out.print("Введите первое число: \n");
            int num1 = scanner.nextInt();
            logger.log(Level.INFO, "Первое число " + num1);
            System.out.print("Введите второе число: \n");
            int num2 = scanner.nextInt();
            logger.log(Level.INFO, "Второе число " + num2);
            System.out.print("Введите результирующее действие: \n");
            String symbol = scanner.next();
            logger.log(Level.INFO, "Операция " + symbol);
            switch (symbol) {
                case "+":
                    res = num1 + num2;
                    logger.log(Level.INFO, "Результат: " + res);
                    break;
                case "-":
                    res = num1 - num2;
                    logger.log(Level.INFO, "Результат: " + res);
                    break;
                case "*":
                    res = num1 * num2;
                    logger.log(Level.INFO, "Результат: " + res);
                    break;
                case "/":
                    res = num1 / num2;
                    logger.log(Level.INFO, "Результат: " + res);
                    break;
            }
            System.out.printf("Результат: %d\n", res);
    } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}

