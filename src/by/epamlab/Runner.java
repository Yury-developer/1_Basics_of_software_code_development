package by.epamlab;

import by.epamlab.linearPrograms.Block1;
import by.epamlab.branches.Block2;
import by.epamlab.cycles.Block3;

import java.util.Arrays;
import java.util.Scanner;


/**
 * -= Тестовый класс =-
 *
 * @author Yury Lapitski
 */
public class Runner {

    public static void main(String[] args) {


        // Линейный программы
        Block1.getResultTask1(5,4,1); // 5
        Block1.getResultTask2(2,5,3); // -20.96
        Block1.getResultTask3(0.7,0.2); // 0,404288574
        Block1.getResultTask4(123.456); // 456.123
        Block1.getResultTask5(42944); // 11ч 55мин 44c
        Block1.getResultTask6(2,2); // true


        // Ветвления
        Block2.getResultTask1(45,45); // Такой треугольник существует / Такой треугольник прямоугольный
        Block2.getResultTask2(2.0, 2.1,100, 10.0); // 10.0
        Block2.getResultTask3(10, 10,   20, 20,   30, 30); // Лежат
        Block2.getResultTask4(10, 20,   10, 20,30); // Пройдет
        Block2.getResultTask5(2); // 7.0


        // Циклы
        // Task 3.1
//        {
//            System.out.println("\n 3.1. Напишите программу, где пользователь вводит " +
//                    "любое целое положительное число. А программа суммирует " +
//                    "все числа от 1 до введенного пользователем числа.");
//            Scanner in = new Scanner(System.in);
//            System.out.println("Введите целое положительное число: ");
//            int number = in.nextInt();
//            int result = Block3.getResultTask1(number);
////            int result = Block3.getResultTask1(4); // 10
//            System.out.println("number = " + number + "\n\t результат = " + result );
//        }

        // Task 3.2
        {
            System.out.println("\n 3.2. Вычислить значения функции на отрезке [а,b] " +
                    "c шагом h: \n\t y = x при x > 2   и   y = -x при x <= 2.");
            System.out.println("введите a (координату начала отрезка, целое положительное число)");

//            int a = new Scanner(System.in).nextInt();
//            System.out.println("введите b (координату конца отрезка, целое положительное число)");
//            int b = new Scanner(System.in).nextInt();
//            System.out.println("введите h (шага, целое положительное число)");
//            int h = new Scanner(System.in).nextInt();

            int a=-5; int b = 5; int h = 2; //результат: 5, 4, 3, 2, 1, 0, -1, -2, 3, 4, 5
            int result[] = Block3.getResultTask2(a, b, h);
            System.out.println("\t " +
                    "a = " + a + "\n\t " +
                    "b = " + b + "\n\t " +
                    "h = " + h + "\n " +
                    "результат (значения функции): \n\t" + Arrays.toString(result));
        }


        // Task 3.3
//        {
//            System.out.println("\n 3.3. Найти сумму квадратов первых ста чисел.");
//            System.out.println("введите первое число (целое)");
//            int begin = new Scanner(System.in).nextInt();
//            int result = Block3.getResultTask3(begin);
//            System.out.println("\t " +
//                    "первое число = " + begin + "\n " +
//                    "результат (сумму квадратов первых ста чисел): " + result);
//        }

        // Task 3.4
        {
            System.out.println("\n 3.4. Составить программу нахождения " +
                    "произведения квадратов первых двухсот чисел.");
            System.out.println("введите первое число (целое)");
            int begin = new Scanner(System.in).nextInt();
            long result = Block3.getResultTask4(begin);
            System.out.println("\t " +
                    "первое число = " + begin + "\n " +
                    "результат (произведение квадратов первых двухсот чисел): " + result);

        }

    }

}
