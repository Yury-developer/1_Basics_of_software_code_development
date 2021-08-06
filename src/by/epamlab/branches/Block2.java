package by.epamlab.branches;

/**
 * -= Ветвления =-
 *
 * @author Yury Lapitski
 */
import static java.lang.Math.*;
public class Block2 {

    // 1. Даны два угла треугольника (в градусах).
    // Определить, существует ли такой треугольник, и если да,
    // то будет ли он прямоугольным
    public static void getResultTask1(double alfa, double beta) {
        String message = "\n 2.1 Даны два угла треугольника (в градусах). " +
                "Определить, существует ли такой треугольник, " +
                "и если да, то будет ли он прямоугольным";
        boolean isExists = ((alfa + beta) < 180) ? true : false; // существует
        System.out.println(message + "\n" +
                " alfa = " + alfa + "; beta = " + beta + ";");

        System.out.print("\t Такой треугольник ");
        if (isExists) {
            System.out.println("существует;");
            String isRectangular = ((alfa==90) || beta==90 || abs(alfa)+abs(beta)==90)
                    ? "прямоугольный."
                    : "НЕ прямоугольный."; // прямоугольный?
            System.out.println("\t Такой треугольник " + isRectangular);
        } else {
            System.out.print("\n" +"НЕ существует.");
        }
    }


    // 2. Найти max{min(a, b), min(c, d)}
    public static void getResultTask2(double a, double b, double c, double d) {
        String message = "\n 2.2 Найти max{min(a, b), min(c, d)}";
        double result = max( min(a, b), min(c, d));
        System.out.println(message + "\n" +
                " a = " + a + "\n b = " + b + "\n с = " + c + "\n d = " + d +
                "\n    результат: " + result);
    }


    // 3. Даны три точки А(х1,у1), В(х2,у2) и С(х3,у3). Определить, будут ли они расположены на одной прямой.
    public static void getResultTask3(int x1, int y1,
                                      int x2, int y2,
                                      int x3, int y3) {
        String message = "\n 2.3 Даны три точки А(х1,у1), В(х2,у2) и С(х3,у3). " +
                "Определить, будут ли они расположены на одной прямой";
        String result = (x1*y2 + x3*y1 + x2*y3 - x3*y2 - x2*y1 - x1*y3 == 0) ? " Лежат " : " НЕ лежат ";
        System.out.println(message +
                "\n x1 = " + x1 + "   \t y1 = " + y1 +
                "\n x2 = " + x2 + "   \t y2 = " + y2 +
                "\n x3 = " + x3 + "   \t y3 = " + y3 +
                "\n\t  результат: точки" + result + "на одной прямой");
    }

    // 4. Заданы размеры А, В прямоугольного отверстия и размеры х, у, z  кирпича.
    // Определить, пройдет ли кирпич через отверстие.
    public static void getResultTask4(int a, int b, int x, int y, int z) {
        String message = "\n 2.4 Заданы размеры А, В прямоугольного отверстия и размеры х, у, z  кирпича. " +
                "Определить, пройдет ли кирпич через отверстие.";

        String result = (
                ((a>=x) && (b>=y))||((a>=y) && (b>=x))
                                  ||
                ((a>=x) && (b>=z))||((a>=z) && (b>=x))
                                  ||
                (((a>=z)&& (b>=y))||((a>=y) && (b>=z))
        ) ? " Пройдет " : " НЕ пройдет ");
        System.out.println(message +
                "\n a = " + a + "\t b = " + b +
                "\n x = " + x + "\t y = " + y + "\t z = " + z  +
                "\n\t  результат: кирпич" + result + "через ответстие");
    }


    // 5. Вычислить значение функции.
    public static void getResultTask5(int x) {
        String message = "\n 2.5. Вычислить значение функции..";

        double result = (x <= 3)
                ? pow(x, 2) - 3 * x + 9
                : 1 / (pow(x, 3) + 6);

        System.out.println(message +
                "\n x = " + x +
                "\n\t  результат: F(x) = " + result);
    }


}