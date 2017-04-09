/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.util.*;

/**
 *
 * @author willi
 */
public class Anagrams {
    
    public static int numberNeeded(String first, String second) {
        StringBuilder firstBuilder = new StringBuilder(first);
        StringBuilder secondBuilder = new StringBuilder(second);
        int deletions = 0;
        
        if (first.length() < second.length()) {
            firstBuilder = new StringBuilder(second);
            secondBuilder = new StringBuilder(first);
        }

        char selectedChar;
        for (int i = 0; i < firstBuilder.length(); i++) {
            selectedChar = firstBuilder.charAt(i);
            if (secondBuilder.toString().contains(Character.toString(selectedChar))) {
                secondBuilder.deleteCharAt(secondBuilder.toString().indexOf(selectedChar));
            }
            else {
                deletions++;
            }
        }
        
        deletions += secondBuilder.length();
        
        return deletions;
    }
  
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.next();
        String b = in.next();
        System.out.println(numberNeeded(a, b));
    }
    
}
