/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package SimplitiDoubleNumbers;

import java.util.Random;
import java.util.Scanner;


public class Main {

    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите N ");
        int n = sc.nextInt();
        
        //init arrays        
        int []arrayA = new int[n];
        int []arrayB = new int[n];
        
        //filling
        Random rand = new Random();
        for(int i=0;i<arrayA.length;i++){
            arrayA[i]=rand.nextInt(99);
        }
        for(int i=0;i<arrayB.length;i++){
            arrayB[i]=rand.nextInt(99);
        }
        
        //display
        for(int i=0;i<arrayA.length;i++){
            System.out.println("arrayA["+i+"]="+arrayA[i]);
        }
        System.out.println();
        for(int i=0;i<arrayB.length;i++){
            System.out.println("arrayB["+i+"]="+arrayB[i]);
        }
        //input M
        sc = new Scanner(System.in);
        System.out.print("Введите M ");
        int m = sc.nextInt();
        
        boolean c;
        
        int count=0;
        for(int i = 0;i<n;i++){
            if(!(simples(arrayA[i],arrayB[i])))count++;
            System.out.println(simples(arrayA[i],arrayB[i]));
        }
        if(count>=m)c=true;
        else c=false;
        System.out.println("c="+c);
    }

    
    
    public static boolean simples(int a, int b) {
        int c;
        while (b > 0) {
            c = a % b;
            a = b;
            b = c;
        }
        if(!(Math.abs(a)>1))return true;
        return false;
    }
}