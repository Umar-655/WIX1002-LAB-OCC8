/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week4;

/**
 *
 * @author umr
 */
    import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter an integer n: ");
        int n = scanner.nextInt();
        
        int totalSum = 0;
        int currentSum = 0;
        
        for (int i = 1; i <= n; i++) {
            currentSum += i;
            totalSum += currentSum;
        }
        
        System.out.println("The sum of the series is: " + totalSum);
    }
}
