package QuickSortFraction;

import SimplifyFractions.*;

class Fraction {
	private int numerator;
	private int denominator;


	public Fraction(int n, int d) {
		numerator = n;
		denominator = d;
        }

	public int getNumerator() {return numerator;}
	public int getDenominator() {return denominator;}
	public String toString() {return numerator + "/" + denominator;}
}