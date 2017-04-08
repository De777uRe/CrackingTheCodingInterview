/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.util.Scanner;

/**
 *
 * @author willi
 */
public class LeftRotation {
    
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int numNumbers = input.nextInt();
        int numRotations = input.nextInt();
        
        int array[] = new int[numNumbers];
        
        for (int i = 0; i < numNumbers; i++) {
            array[i] = input.nextInt();
        }
        
        for (int i = 0; i < numRotations; i++) {
            int start = array[0];
            System.arraycopy(array, 1, array, 0, array.length - 1);
            array[array.length - 1] = start;
        }
        
        for (int i = 0; i < numNumbers; i++) {
            System.out.print(array[i] + " ");
        }
        
    }
    
}
