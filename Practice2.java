/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice2;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Practice2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n,n1=0,n2=1,n3;
        System.out.println("enter the number of fibonacci numbers");
        Scanner s = new Scanner(System.in);
        n=s.nextInt();
        System.out.println(n1+ "\n"+n2);
        for(int i=2;i<n;i++){
        n3=n1+n2;
        System.out.println(""+n3);
        n1=n2;
        n2=n3;
        }
        
        // TODO code application logic here
    }
    
}
