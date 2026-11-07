/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week4;
import java.util.Random ;

public class Tutorial1c {
    public static void main(String[] args) {
        Random rand = new Random();
int[][] matrix = new int[4][5];

for (int i = 0; i < 4; i++) {
    for (int j = 0; j < 5; j++) {
        matrix[i][j] = rand.nextInt(101); 
        System.out.printf("%4d", matrix[i][j]);
    }
    System.out.println();
}
    }
}
