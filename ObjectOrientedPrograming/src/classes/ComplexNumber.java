package classes;

public class ComplexNumber {
	int realno;
	int imgno;

	public ComplexNumber(int realno, int imgno) {
		this.realno=realno;
		this.imgno=imgno;
		
	}
	
	void print() {
		System.out.println(realno +" + "+ "i"+imgno );
	}

	public void setReal(int i) {
		this.realno=i;
		
	}

	public void setImg(int i) {
		this.imgno=i;
		
	}

	public void add(ComplexNumber c2) {
		this.realno=this.realno+c2.realno;
		this.imgno=this.imgno+c2.imgno;
		
	}
	
	public void multiply(ComplexNumber c2) {
		int newrealno=this.realno*c2.realno -this.imgno*c2.imgno;
		int newimgno=this.realno*c2.imgno + this.imgno*c2.realno;
		this.realno=newrealno;
		this.imgno=newimgno;
	}

	public static ComplexNumber multiply(ComplexNumber c3,ComplexNumber c2) {
		int newrealno=c3.realno*c2.realno -c3.imgno*c2.imgno;
		int newimgno=c3.realno*c2.imgno + c3.imgno*c2.realno;
		ComplexNumber c4=new ComplexNumber(newrealno,newimgno);
		return c4;
		
		
	}

}
