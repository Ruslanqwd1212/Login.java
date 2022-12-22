package org.example;

import java.util.Scanner;

public class Students {
    public static void go() {


        Scanner in = new Scanner(System.in);
        for (int i = 1; i < 27; i++) {
            String surname = in.nextLine();
            System.out.println("Enter surname");

            System.out.print("Input name: ");
            String name = in.nextLine();

            System.out.println("Enter patronymic ");
            String patronymic = in.nextLine();

            System.out.print("Input age: ");
            int age = in.nextInt();


            System.out.printf("Name: " + name + " Age: " + age + " surname: " + surname + " patronymic: " + patronymic);

        }
        in.close();
    }
}