package org.example.HW1.Task2;
import java.util.Scanner;
public class Task2 {
    public static void main(String[] args) {

        System.out.printf("Введите последовательность чисел: ");
        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        int sum = 0;
        while (num1 != 0) {
            int num2 = scan.nextInt();
            if (num1 > 0 && num2 < 0) {
                sum += num1;
            }
            num1 = num2;
        }
        System.out.printf("Сумма = %s", sum);

    }
}

