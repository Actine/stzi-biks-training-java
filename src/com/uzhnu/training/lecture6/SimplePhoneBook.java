package com.uzhnu.training.lecture6;

import javax.security.sasl.SaslClient;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Code for lecture ${LECTURE_NUMBER}
 *
 * @author Paul Danyliuk
 * @date 11:02 @ 26.11.2015.
 */
public class SimplePhoneBook {

    public static void main(String[] args) throws IOException {

        Map<String, String> contacts = new HashMap<>();
        contacts.put("Павло", "4-47-58");
        contacts.put("Петро", "4-41-58");
        contacts.put("Данило", "3-47-69");
        contacts.put("Сергій", "4-12-58");
        contacts.put("Дмитро", "4-47-81");
        contacts.put("Дарина", "4-44-33");

        PrintWriter writer = new PrintWriter(new FileWriter("D:/phones.txt"));
        writer.println(contacts.size());
        for (Map.Entry<String, String> entry : contacts.entrySet()) {
            writer.println(entry.getKey());
            writer.println(entry.getValue());
        }

        writer.close();

        Map<String, String> savedContacts = new HashMap<>();
        Scanner scanner = new Scanner(new File("D:/phones.txt"));
        int size = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < size; i++) {
            String name = scanner.nextLine();
            String phone = scanner.nextLine();
            savedContacts.put(name, phone);
        }

        System.out.println("Введіть рядок для пошуку");
        Scanner consoleScanner = new Scanner(System.in);
        String s = consoleScanner.nextLine();

        for (Map.Entry<String, String> entry : savedContacts.entrySet()) {
            if (entry.getKey().contains(s)) {
                System.out.println(entry.getKey() + " - " + entry.getValue());
            }
        }

//        System.out.println(savedContacts.equals(contacts));

    }

}
