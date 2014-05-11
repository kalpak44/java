package SimplifyFractions;


public class Main {
    public static void main(String[] args){
       //Problem 29 - Simplify fractions
       
       
       Fraction myfraction = new Fraction(3,9);
       
       System.out.println("before:");
       System.out.println("Drob = "+myfraction.toString());
       System.out.println("after:");
       myfraction = simplify_fraction(myfraction);
       System.out.println("result = "+myfraction.toString());
        
   }
 public static Fraction simplify_fraction(Fraction myfraction){
       int nominator = myfraction.getNumerator();
       int denominator = myfraction.getDenominator();
       
       //find mcd
       int r,mcd;
       while(denominator != 0){
           r = nominator%denominator;
           nominator = denominator;
           denominator = r;
       }
       mcd = nominator;
       //Fraction
       Fraction result = new Fraction(myfraction.getNumerator()/mcd, myfraction.getDenominator()/mcd);
       return result;
 }  
}
