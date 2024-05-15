package classes;

public class Fraction {
	int numerator;
	int denominator;
	public Fraction(int numerator, int denominator) {
		this.numerator=numerator;
		this.denominator=denominator;
		simplify();
	}
	private void simplify() {
		int gcd=1;
		int smaller=Math.min(numerator, denominator);
		for(int i=2; i<=smaller;i++) {
			if(numerator%i==0 && denominator%i==0) {
				gcd=i;
			}
		}
		numerator=numerator/gcd;
		denominator=denominator/gcd;
		
	}
	
	  void print () {
		 System.out.println(numerator+"/"+ denominator);
		
	}
	  
	  public void increment() {
		 numerator=numerator+denominator;
		 simplify();
	  }
	public void setnumerator(int numerator) {
		this.numerator=numerator;
		simplify();
	
	}
	public int getnumerator() {
		return numerator;
	}
	
	public void setdenominator(int denominator) {
		if(denominator==0) {return;}
		this.denominator=denominator;
		simplify();
	
	}
	public int getdenominator() {
		return denominator;
	}
	public void add(Fraction f2) {
		numerator=numerator*f2.denominator + f2.numerator*denominator;
		denominator=denominator*f2.denominator;
		simplify();
		
	}
	public static Fraction add(Fraction f1, Fraction f2) {
		int newnum=f1.numerator*f2.denominator + f2.numerator*f1.denominator;
		int newdeno= f1.denominator*f2.denominator;
		Fraction f3=new Fraction(newnum, newdeno );
		return f3;
	}
	 
	

}
