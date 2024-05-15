package classes;

import java.lang.foreign.Addressable;

public class FractionUse {

	public static void main(String[] args) {
		Fraction f1=new Fraction(4,6);
		f1.print();
//		f1.setnumerator(5);
//		f1.print();
//		System.out.println(f1.getnumerator());
//		f1.setdenominator(7);
//		System.out.println(f1.getdenominator());
//		f1.increment();
//		f1.print();
		Fraction f2=new Fraction(8,16);
		f2.print();
		
//		f1.add(f2);
//		f1.print();
		Fraction f3;
		f3=Fraction.add(f1, f2);
		f3.print();
				
		
		
		
		

	}

}
