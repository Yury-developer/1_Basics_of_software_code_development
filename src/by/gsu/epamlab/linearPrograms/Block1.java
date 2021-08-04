package by.gsu.epamlab.linearPrograms;

/*
    Линейный программы
 */
import static java.lang.Math.*;
public abstract class Block1 {

    // 1. Найдите значение функции: z = ( (a – 3 ) * b / 2) + c
    public static void getResultTask1(int a, int b, int c) {
        String message = "Найдите значение функции: z = ( (a – 3 ) * b / 2) + c";
        double z = ((a - 3) * b / 2) + c;
        System.out.println(message + "\n" +
                " a=" + a + "; b=" + b + "; c=" + c + "; \n" +
                " z=" + z + "; \n");
    }

    // 2. Вычислить значение выражения по формуле (все переменные принимают действительные значения)...
    public static void getResultTask2(double a, double b, double c) {
        String message = "Вычислить значение выражения по формуле " +
                "(все переменные принимают действительные значения) " +
                "(b + sqrt(b^2 + 4 * a * c)) / (2 * a) - a^3 * c + b^-2";
        double result = (b + sqrt(b * b + 4 * a * c)) / (2 * a) - a * a * a * c + pow(b,-2);
        System.out.println(message + "\n" +
                " a=" + a + "; b=" + b + "; c=" + c + ";" +
                " \n результат = " + result + "; \n");
    }

    // 3. Вычислить значение выражения по формуле (все переменные принимают действительные значения)...
    public static void getResultTask3(double x, double y) {
        String message = "Вычислить значение выражения по формуле (sin x + cos y) / (cos x - sin y) * tg xy";
        double result = ((sin(x) + cos(y)) / (cos(x) - sin(y))) * tan(x * y);
        System.out.println(message + "\n" +
                " x=" + x + "; y=" + y + ";" +
                " \n результат = " + result + "; \n");
    }

    // 4. Дано действительное число R  вида nnn.ddd  (три цифровых разряда в дробной и целой частях). Поменять местами  дробную и целую части числа и вывести полученное значение числа.
    public static void getResultTask4(double r) {
        String message = "Дано действительное число R  вида nnn.ddd  " +
                "(три цифровых разряда в дробной и целой частях). Поменять местами " +
                "дробную и целую части числа и вывести полученное значение числа.";
        int wholePart = (int) r;   //целая часть
        int fractionalPart = (int) ((r - wholePart) * 1000);   //дробная часть
        double result = fractionalPart + (double) wholePart / 1000;
        System.out.println(message + "\n" +
                " R=" + r + ";" +
                " \n результат = " + result + "; \n");
    }

    // 5.  Дано  натуральное  число  Т,  которое  представляет  длительность  прошедшего  времени  в  секундах.  Вывести
    //данное значение длительности в часах, минутах и секундах в следующей форме:
    //ННч ММмин SSc
    public static void getResultTask5(int t) {
        String message = "Дано  натуральное  число  Т,  которое  представляет  " +
                "длительность  прошедшего  времени  в  секундах.  " +
                "Вывести данное значение длительности в часах, минутах и секундах в следующей форме:" +
                "ННч ММмин SSc..";
        int hours = t / (60 * 60);
        int minutes = t / 60 - hours * 60;
        int seconds = t - (hours * 60 * 60 + minutes * 60);
        System.out.println(message + "\n" +
                " T=" + t + ";" +
                " \n результат: \n" +
                hours + "ч " + minutes + "мин " + seconds + "c" + "; \n");
    }

    // 6.  Для  данной  области  составить  линейную  программу,  которая  печатает  true,  если  точка  с  координатами  (х,  у) принадлежит закрашенной области, и false — в противном случае:
    public static void getResultTask6(int x, int y) {
        String message = "Для  данной  области  составить  линейную  программу,  " +
                "которая  печатает  true,  если  точка  с  координатами  (х,  у) " +
                "принадлежит закрашенной области, и false — в противном случае:";
        boolean result = false;
        if (x <= 2 && y <= 4) {
            result = true;
        } else {
            if (x <= 4 && y >= -3) {
                result = true;
            } else {
                if (x >= -4 && y >= -3) {
                    result = true;
                } else {
                    if (x >= -2 && y <= 4)  {
                        result = true;
                    }
                }
            }
        }
        System.out.println(message + "\n" +
                " \n результат: " + result + "; \n");
    }

}
