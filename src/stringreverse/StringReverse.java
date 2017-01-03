/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringreverse;

import java.util.Scanner;
import java.lang.*;
/**
 *
 * @author rubin
 */
public class StringReverse {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(strRev(sc.next()));
    }
    
    static String strRev(String abc){
        StringBuilder sb = new StringBuilder();
    
        for(int i = abc.length() - 1; i >= 0; i --){
            sb.append(abc.charAt(i));
        }
        
        return sb.toString();
        
    }
    
}
