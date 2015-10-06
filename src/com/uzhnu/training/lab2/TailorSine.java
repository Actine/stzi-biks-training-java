package com.uzhnu.training.lab2;

/**
 * Обчислення функції f(x) = sin x методом розкладу у ряд Тейлора (див.
 * <a href="https://upload.wikimedia.org/math/9/d/a/9dae5ee367147333b7077d47b1c3b6de.png">формулу</a>).
 *
 * @author Paul Danyliuk
 * @date 12:48 @ 06.10.2015.
 */
public class TailorSine {

    public static void main(String[] args) {

        double x = Math.PI / 6;         // 30 градусів, точніше, трохи менше через недостатню точність Math.PI
        double precision = 0.00001;     // Необхідна точність нашого обчислення

        // Як і в TailorExponent, щоб не обчислювати x^(2n+1) і (2n+1)! кожного разу, зберігатимемо попередні значення
        // чисельника і знаменника, і просто домножуватимемо їх, щоб отримати необхідні значення
        long fact = 1;
        double numerator = x;

        // Перший доданок (при n = 0) - x^1 / 1!, або ж просто x
        double result = x;

        // Від n = 1 і до нескінченності...
        int n = 1;
        while (true) {
            // ...вирахуємо значення чисельника і знаменника для нинішнього n,..
            numerator = numerator * x * x;          // чисельник домножується на x^2
            fact = fact * 2 * n * (2 * n + 1);          // у знаменнику число, з якого береться факторіал, теж збільш. на 2

            // ...порахуємо n-товий доданок,..
            double member = numerator / fact;

            // ...і якщо модуль доданка уже став менший за бажану точність обчислень, припиняємо цикл.
            if (Math.abs(member) <= precision) {
                break;
            }

            // Інакше - парні доданки додаються, непарні віднімаються
            if (n % 2 == 0) {
                result = result + member;
            } else {
                result = result - member;
            }

            // Оскільки це цикл без параметру, не забуваємо збільшити n на одиницю.
            n++;
        }

        System.out.printf("         x = %.16f°\n", Math.toDegrees(x));
        System.out.printf(" Очікування: %.16f\n", Math.sin(x));
        System.out.printf("  Результат: %.16f\n", result);
        System.out.printf("Розбіжність: %.16f\n", result - Math.sin(x));
    }
}
