/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package QuickSortFraction;

/**
 *
 * @author kalpak44
 */
public class SortFraction {
    public static void main(String[] args){
        //Problem 30 - Sort array of fractions
       System.out.println("\nProblem 30 - Sort array of fractions");
	int N = 5;
	Fraction[] toSort = new Fraction[N];
	//generating N random fractions range from 1 to N
	for (int i=0;i<N;i++) {
            toSort[i] = new Fraction((int)Math.ceil(Math.random()*N),(int)Math.ceil(Math.random()*N));

	}
        //before sort
        System.out.println("Before:");
        for (int i=0;i<N;i++) {
            System.out.print(toSort[i].toString() + "; ");
	}
        //after sort
        System.out.println("");
        toSort = sort_fraction(toSort,0,toSort.length-1);
        System.out.println("\nAfter:");
        for (int i=0;i<N;i++) {
            System.out.print(toSort[i].toString() + "; ");
	}
    }
    
       public static Fraction[] sort_fraction(Fraction[] A, int low, int high){
       int i = low;
       int j = high;
       Fraction x = A[(low+high)/2];

       do {
         while(A[i].getNumerator()/A[i].getDenominator() < x.getNumerator()/x.getDenominator()) ++i;
         while(A[j].getNumerator()/A[j].getDenominator() > x.getNumerator()/x.getDenominator()) --j;
         
         if(i <= j){
            int n = A[i].getNumerator();
            int d = A[i].getDenominator();
            Fraction temp = new Fraction(n, d);
            A[i] = A[j];
            A[j] = temp;
            i ++ ; j --;
         }
                 
      } while(i <= j);
       
       //рекурсивные вызовы функции qSort
      if(low < j) sort_fraction(A, low, j);
      if(i < high) sort_fraction(A, i, high);
  
      return A;

   }
        
    
}
