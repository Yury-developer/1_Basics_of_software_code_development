package by.epamlab.cycles;

/**
 * -= Циклы =-
 *
 * @author Yury Lapitski
 */
import java.math.BigInteger;

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
    public static int[] getResultTask2(int a, int b, int h) {
        int arrazSize = (b - a) / h + 1;
        int result[] = new int[arrazSize];
        for(int i = 0; i < arrazSize; i++) {
            result[i] = ((a + (i*h)) > 2) ? a + (i*h) : -(a + (i*h));
        }
        return result;
    }

    // 3.3. Найти сумму квадратов первых ста чисел.
    public static int getResultTask3(int begin) {
        int result = 0;
        for (int i=0; i < 100; i++) {
            result = result + (int) pow(begin + i, 2);
        }
        return result;
    }

    // 3.4. Составить программу нахождения произведения квадратов первых двухсот чисел.
    public static long getResultTask4(int begin) {
        BigInteger result = new BigInteger();
        for (int i=1; i < 200; i++) {
            result = result * (int) pow(begin + i, 2);
            System.out.println(result);
        }
        return result;
    }


}
