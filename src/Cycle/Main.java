package Cycle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите длину массива: ");
        int size = input.nextInt();
        double[] array = new double[size];
        double b = 0;
        double c;
        System.out.println("Введите элемент массива: ");
        for (int i = 0; i < size; i++) {
            array[i] = input.nextDouble();
            }
            for (int i = 0; i < size; i++) {
                b = b + array[i];
        }
            for (int i = 0; i < size; i++)
            {
                c = array[i] * b/size;
                System.out.println( array[i] + " * " + b/size + " = " + c + " ");
            }
        System.out.println();
    }
}
