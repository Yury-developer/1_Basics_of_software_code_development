package by.epamlab;

import by.epamlab.cycles.Block3;
import by.epamlab.linearPrograms.Block1;
import by.epamlab.branches.Block2;

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
        // 1
        {
            System.out.println("\n 3.1. Напишите программу, где пользователь вводит " +
                    "любое целое положительное число. А программа суммирует " +
                    "все числа от 1 до введенного пользователем числа.");
            Scanner in = new Scanner(System.in);
            System.out.println("Введите целое положительное число: ");
            int number = in.nextInt();
            int result = Block3.getResultTask1(number);
//            int result = Block3.getResultTask1(4); // 10
            System.out.println("number = " + number + "\n\t результат = " + result );
        }

    }

}
