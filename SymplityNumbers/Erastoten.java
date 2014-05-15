/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package SymplityNumbers;

import java.util.Scanner;

/**
 *
 * @author kalpak44
 */
public class Erastoten {
    public static void main(String[] args) {
		
	System.out.println("Въведи лимита си");
	Scanner a = new Scanner(System.in); 
        int limit = a.nextInt();
        
        int []otherArray = erastotenMethod(limit);
        
        
        
        for(int i=2;i<limit;i++){
        	
        	if(otherArray[i]==1){
        		
        		System.out.println(i + " е просто число;");
        	}else{
        		System.out.print(i + " е съставно число, а негови прости делители са: ");
        		int []prDeliteli = erastotenMethod(i);
        		for(int j=0;j<i;j++){
        			if((prDeliteli[j]==1)&&(i%j==0)){
        				System.out.print(j +";");
        			}
        		}
        		System.out.println("");
        	}
        }
    }
    static int[] erastotenMethod(int limit){
		
		int []array = new int[limit];
		
		for(int i=2;i<limit;i++){
        	if(array[i]==0){
        		for(int j=i;j<limit;j+=i){
        			array[j]=2;
        		}
        		array[i]=1;
        	}
        }
    	return array;
    }
}
