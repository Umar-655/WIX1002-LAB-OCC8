/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week4;

/**
 *
 * @author umr
 */

//error
//for ( x==1, y==20; x < y, x++, y-=2);
//System.out.println(x & " " & y);

public class Tutorial2c {
    public static void main(String[] args) {
        int x;
        int y;
        for (x = 1, y = 20; x < y; x++){
            y-=2;
        }
        System.out.println(x + " " + y);
    }
}
