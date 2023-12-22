package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Write N: ");
        int n = scanner.nextInt();


        //Ітераційний метод:
        //Часова складність: O(n)
        //Просторова складність: O(1)
        System.out.println("Iter:");
        IterFibonacci iterFibonacci = new IterFibonacci(n);
        System.out.println(iterFibonacci);


        //РРекурсивний метод:
        //Часова складність: O(2n)
        //Просторова складність: O(n)
        System.out.println("Recursive: ");
        RecFibonacci recFibonacci = new RecFibonacci(n);
        System.out.println(recFibonacci);


        //Метод динамічного програмування:
        //Часова складність: O(n)
        //Просторова складність: O(n)
        System.out.println("Dynamic: ");
        DynamicFibonacci dynamicFibonacci = new DynamicFibonacci(n);
        System.out.println(dynamicFibonacci);
    }
}
