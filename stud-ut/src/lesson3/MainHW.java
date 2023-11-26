package lesson3;

//Напишите тесты, покрывающие на 100% метод evenOddNumber, который проверяет, является ли переданное число четным или нечетным. (код приложен в презентации)
public class MainHW {
    public static boolean evenOddNumber(int number) {
        if (number % 2 == 0) {
            return true;
        }
        return false;
    }
// Разработайте и протестируйте метод numberInInterval, который проверяет, попадает ли переданное число в интервал (25;100). (код приложен в презентации)

    public static boolean numberInInterval(int number) {
        if (number >= 25 && number <= 100) {
            return true;
        }
        return false;
    }
}
