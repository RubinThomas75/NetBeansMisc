/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package urltester;
import java.io.*;
import java.net.*;
import java.util.Scanner;


/**
 *
 * @author rubin
 */
public class URLTester {

    /**
     * @param args the command line arguments
     * @throws java.net.MalformedURLException
     */
    public static void main(String[] args) throws MalformedURLException, IOException {
        URL u;
        Scanner s;
        
        u = new URL("http://www.this-page-intentionally-left-blank.org/whythat.html");
        s = new Scanner(u.openStream());
        
        while(s.hasNext()){
            System.out.println(s.nextLine());
        }
    }
    
    
}
