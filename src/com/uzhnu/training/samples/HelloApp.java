// У Java, файли (і, відповідно, класи) групуються у «папки» - пакети. Зазвичай у проекті створюється ієрархія пакетів,
// подібно до папок на ваших комп’ютерах
package com.uzhnu.training.samples;

// Для того, щоб використовувати деякі інші класи, вони повинні бути ІМПОРТОВАНІ. Зазвичай IDEA або інший редактор
// зробить це за Вас
import java.util.Scanner;

/**
 * Перша програма мовою Java, яка запитує ім’я і вік, і виводить привітання.
 *
 * Кожен .java файл містить один ПУБЛІЧНИЙ КЛАС із таким же іменем.
 *
 * Принаймні один із класів повинен мати метод public static void main(String[] args), через який відбувається
 * запуск програми
 */
public class HelloApp {

    /**
     * Головний метод, який обов’язково має бути public static void main(String[] args).
     * Насправді, замість args може бути будь-яка інша назва параметру.
     * </p>
     * Спробуйте клацнути десь на слові main і натиснути Ctrl+Q
     *
     * @param args Тут можуть бути аргументи, якщо програма запущена із ними (наприклад, із командного рядка)
     */
    public static void main(String[] args) {

        // Створимо об’єкт «сканер» для вхідного потоку даних.
        // Це не єдиний спосіб, але поки що просто завчіть цей.
        Scanner scanner = new Scanner(System.in);

        // Вивід на екран відбувається через вихідний потік System.out

        // Метод println виведе текст і перенесе курсор на новий рядок
        System.out.println("Як Вас звати?");

        // String - це тип даних, який містить у собі рядок тексту

        // ОГОЛОСИМО змінну name...
        String name;

        // ...і ПРИСВОЇМО їй уведене із консолі ім’я
        name = scanner.nextLine();

        // Насправді, оголошення і присвоєння тут було необов’язково розділяти. Можна було зробити просто так
        // (зверніть увагу, що рядок «закоментований» - не можна двічі оголосити змінну із тим же іменем. Спробуйте прибрати // на початку рядка)
//        String name = scanner.nextLine();

        // Метод print виведе текст, але не перенесе рядок.
        System.out.print("Введіть свій вік: ");

        // Задля простоти, зчитаємо вік не як число, а теж як рядок тексту
        String age = scanner.nextLine();

        // Виведемо привітання:
        String hello = "Привіт, " + name + ", якому " + age + " років.";
        System.out.println(hello);

        // Рекомендую пролистати: http://learnxinyminutes.com/docs/ru-ru/java-ru/
    }
}
