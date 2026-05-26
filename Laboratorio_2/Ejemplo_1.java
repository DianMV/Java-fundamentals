package Laboratorio_2;

import java.util.Scanner;

public class Ejemplo_1 {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        /*
         * Elabore un programa que permita ingresar el nombre, los apellidos, la edad y
         * el peso de una
         * persona, luego imprima todos los datos ingresados.
         */
        String name, lastName;
        int age;
        double weight;
        System.out.print("Insert your name: ");
        name = sc.nextLine();

        System.out.print("Insert your last name/s: ");
        lastName = sc.nextLine();

        System.out.print("Insert your age: ");
        age = sc.nextInt();
        sc.nextLine();

        System.out.print("Insert your weight: ");
        weight = sc.nextDouble();
        sc.nextLine();

        System.out.println("Name: " + name + "\nLast Name: " + lastName + "\nAge: " + age + "\nweight: " + weight);

    }
}
