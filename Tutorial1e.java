/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week4;

/**
 *
 * @author umr
 */
public class Tutorial1e {
    public static void main(String[] args){
    double Sum = 0.0;

for (int i = 1; i <= 25; i++) {
    Sum += (double) i / (26 - i);
}

System.out.printf("Sum of series: %.2f%n", Sum);
}
}