package Task2;

import java.io.IOException;
import java.util.Arrays;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class Task2 {

    static int[] array = {305, 247, 502, 156, 230};

    public static void main(String[] args) {

        int count = 0;

        try {
            Logger logger = Logger.getLogger(Task2.class.getName());
            FileHandler fh = new FileHandler("D:\\Программирование\\Java Core\\Java\\Lesson2\\homework2\\homework2\\src\\main\\java\\org.example\\logger.txt");
            logger.addHandler(fh);
            SimpleFormatter sFormat = new SimpleFormatter();
            fh.setFormatter(sFormat);
            logger.setUseParentHandlers(false);
            logger.log(Level.INFO, "Начало логирования");

            //ПУЗЫРЬКОВАЯ СОРТИРОВКА
            for (int out = array.length - 1; out >= 1; out--) {  //Внешний цикл
                for (int in = 0; in < out; in++) {       //Внутренний цикл
                    if (array[in] > array[in + 1])               //Если порядок элементов нарушен
                        toSwap(in, in + 1);             //вызвать метод, меняющий местами
                    printer();
                    count++;
                    logger.log(Level.INFO, "Иттерация " + count + ": " + Arrays.toString(array));
                }
            }


        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public static void toSwap(int first, int second) { //метод меняет местами пару чисел массива
        int dummy = array[first];      //во временную переменную помещаем первый элемент
        array[first] = array[second];       //на место первого ставим второй элемент
        array[second] = dummy;          //вместо второго элемента пишем первый из временной памяти
    }

    public static void printer() {          //метод вывода массива в консоль
        for (int i = 0; i < array.length; i++) {    //для каждого элемента в массиве
            System.out.print(array[i] + " ");   //вывести в консоль
        }
        System.out.println();
    }
}