/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week4;
import java.util.Scanner;

public class Tutorial1d {
    public static void main(String[] args) {
        Scanner givenNum = new Scanner(System.in);
        System.out.println("Enter a given number: ");
        int num = givenNum.nextInt();
        int sum = 0;
            for (int i = 1; i <= num; i++) {
                sum += i;
            }
        System.out.println("Sum from 1 until " + num + " is " + sum);
    }
}
