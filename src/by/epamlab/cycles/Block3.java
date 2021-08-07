package by.epamlab.cycles;

/**
 * -= Циклы =-
 *
 * @author Yury Lapitski
 */
import static java.lang.Math.*;
public class Block3 {


    // 3.1. Напишите программу, где пользователь вводит любое целое положительное число.
    // А программа суммирует все числа от 1 до введенного пользователем числа.
    public static int getResultTask1(int number) {
        int result = number;
        while (number >= 1) {
            result = result + (--number);
        }
        return result;
    }

    // 3.2. Вычислить значения функции на отрезке [а,b] c шагом h:
    // y = x при x > 2   и   y = -x при x <= 2.
    public static []int getResultTask2(int a, int b, int h) {
        int arrazSize = (a - b) / h;
        int result[] = new int[arrazSize];
        for(int i = a; i <= b; i = i + h) {
            result[i] = (i > 2) ? i : -i;
        };
        return result;
    }

}
