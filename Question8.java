/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week4;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
/**
 *
 * @author umr
 */

public class Question8 {
    public static void main(String[] args) {
        Random rand = new Random();
        int n = rand.nextInt(101); // Random integer within 0 to 100
        System.out.println("Generated n = " + n);

        if (n <= 0) {
            System.out.println("n is 0, no prime numbers to display.");
            return;
        }

        System.out.print("The first " + n + " prime numbers are: ");
        int count = 0;
        int num = 2;

        while (count < n) {
            if (isPrime(num)) {
                System.out.print(num + " ");
                count++;
            }
            num++;
        }
        System.out.println();
    }

    public static boolean isPrime(int number) {
        if (number <= 1) return false;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) return false;
        }
        return true;
    }
}