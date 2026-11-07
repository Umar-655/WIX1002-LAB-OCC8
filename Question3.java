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

public class Question3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double min = Double.MAX_VALUE;
        double max = Double.MIN_VALUE;
        double sum = 0;
        double sumSquare = 0;
        int count = 0;
        
        while (true) {
            System.out.print("Enter a score [negative score to quit]: ");
            double score = scanner.nextDouble();
            
            if (score < 0) {
                break;
            }
            
            if (score < min) min = score;
            if (score > max) max = score;
            
            sum += score;
            sumSquare += score * score;
            count++;
        }
        if (count > 0) {
            double average = sum / count;
            double stdDev = (count > 1) ? Math.sqrt((sumSquare - (sum * sum / count)) / (count - 1)) : 0.0;
            
            System.out.printf("Minimum Score: %.0f\n", min);
            System.out.printf("Maximum Score: %.0f\n", max);
            System.out.printf("Average Score: %.2f\n", average);
            System.out.printf("Standard Deviation: %.2f\n", stdDev);
        } else {
            System.out.println("No scores were entered.");
        }
    }
}
