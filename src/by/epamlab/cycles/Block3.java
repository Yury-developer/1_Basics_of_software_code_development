package by.epamlab.cycles;

/**
 * -= Циклы =-
 *
 * @author Yury Lapitski
 */
import java.math.BigInteger;
import java.util.Arrays;

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
    public static BigInteger getResultTask4(int begin) {
        BigInteger result = BigInteger.valueOf(begin).pow(2);
        for (int i=1; i <= 200; i++) {
            BigInteger next = BigInteger.valueOf(begin + i).pow(2);
            result = result.multiply(next);
            System.out.println("\n\t" + result);
        }
        return result;
    }

    // 3.5. Даны  числовой  ряд  и  некоторое  число  е.
    // Найти  сумму  тех  членов  ряда,  модуль  которых
    // больше  или  равен заданному е. Общий член ряда имеет вид: a(n) = 1/(2^n) + 1/(3^n)
    public static double getResultTask5(double e) {
        int n = 1;
        double item = 0;
        double result = 0;
        do {
            result += item;
            item = 1/(2*pow(2,n)) + 1/(3*pow(3,n));
            n++;
        } while (abs(item) >= e);
        return result;
    }

    // 3.6. Вывести на экран соответствий между символами
    // и их численными обозначениями в памяти компьютера.
    public static char[] getResultTask6(String inputString) {
        char[] result = inputString.toCharArray();
        return result;
    }

    // 3.7. Для каждого натурального числа в промежутке от m до n
    // вывести все делители, кроме единицы и самого числа.
    // m и n вводятся с клавиатуры.
    public static int[][] getResultTask7(int m, int n) {
        int sizeDefault = n - m;
        int result[][] = new int[sizeDefault][];
        int iIter = 0;
        for(int i = m; i < n; i++) { // переберем все числа
            int items[] = new int[sizeDefault];
            int jIter = 0;
            for(int j = 2; j < i; j++) {
                if((i % j) == 0) {
                    items[jIter++] = j;
                }

            }
            if(jIter > 0) {
                result[iIter][1] = i;
                result[iIter][2] = items;
                iIter++;
            }
        }

        char[] result = inputString.toCharArray();
        return result;
    }
    public


}
