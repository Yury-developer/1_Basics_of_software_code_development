package by.epamlab;

import by.epamlab.linearPrograms.Block1;
import by.epamlab.branches.Block2;
import by.epamlab.cycles.Block3;

import java.math.BigInteger;
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
//        {
//            System.out.println("\n 3.4. Составить программу нахождения " +
//                    "произведения квадратов первых двухсот чисел.");
//            System.out.println("введите первое число (целое)");
//            int begin = new Scanner(System.in).nextInt();
//            BigInteger result = Block3.getResultTask4(begin);
//            System.out.printf("\t %s %d \n\t %s :\n%,d",
//                    "первое число = ", begin, "результат (произведение квадратов первых двухсот чисел): ", result);
//            // in: 1
//            // out: 25 128 663 744 189 487 775 489 899 066 182 921 175 211 974 763 542 354 688 277 446 394 918 011 715 697 378 163 303 339 044 461 856 058 220 906 988 168 171 109 560 032 198 802 315 669 508 447 560 043 732 872 820 462 764 424 165 625 712 252 501 043 362 723 651 179 743 636 235 002 076 229 038 772 663 312 390 033 604 698 828 851 653 663 031 680 834 705 482 232 294 729 205 520 880 352 027 824 452 519 297 082 210 555 698 461 975 301 259 486 371 660 308 638 703 422 177 453 899 466 972 126 771 693 641 352 007 088 533 823 555 556 152 878 525 419 137 401 090 101 403 229 112 077 406 746 349 627 897 195 552 670 065 932 233 430 401 453 994 535 650 286 924 842 259 902 215 448 012 076 456 046 354 349 012 843 043 046 370 448 049 437 388 154 393 828 721 774 065 914 446 356 097 338 747 590 547 342 616 795 627 011 803 443 831 479 879 467 397 505 707 944 043 028 986 664 749 262 438 400 000 000 000 000 000 000 000 000 000 000 000 000 000 000 000 000 000 000 000 000 000 000 000 000 000 000 000 000 000 000 000 000
//        }

        // Task 3.5
//        {
//            System.out.println("\n 3.5. Даны  числовой  ряд  и  некоторое  число  е." +
//                    " Найти  сумму  тех  членов  ряда,  модуль  которых " +
//                    "больше  или  равен заданному е. \n" +
//                    "Общий член ряда имеет вид: a(n) = 1/(2^n) + 1/(3^n).");
//            System.out.println("введите число (вещественное)");
//            double e = new Scanner(System.in).nextDouble();
//            double result = Block3.getResultTask5(e);
//            System.out.println("\t Результат: сумму членов ряда по заданному условию = " + result);
//            // in: 0,1
//            // out: 0.5231481481481481
//        }

        // Task 3.6
        {
            System.out.println("\n 3.6. Вывести на экран соответствий между символами " +
                    "и их численными обозначениями в памяти компьютера.");
            System.out.println("введитес строку: ");
            String inputString = new Scanner(System.in).nextLine();
            char[] result = Block3.getResultTask6(inputString);
            System.out.println(" Результат: соответствия между символами и их численными обозначениями");
            for (Character item: result) {
                System.out.println("\t '" + item + "' -> " + (int) item + " ;");
            }
            // in: z 12
            // out:
//            'z' -> 122 ;
//            ' ' -> 32 ;
//            '1' -> 49 ;
//            '2' -> 50 ;
        }


    }

}
