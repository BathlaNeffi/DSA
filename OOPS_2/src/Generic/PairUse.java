package Generic;

public class PairUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Pair<String,Integer> InngerP=new Pair<>("we",100);
		
		
		Pair<Pair<String,Integer>,String> psi=new Pair<Pair<String,Integer>,String>();
		psi.setFirst(InngerP);
		System.out.println(psi.getFirst());
		System.out.println(psi.getFirst().getFirst());
		System.out.println(psi.getFirst().getSecond());
		
//		psi.setSecond("abcd");
//
//		System.out.println(psi.getSecond());
		
//		Pair<Integer> p1=new Pair<Integer>(5,10);
//		Pair<String> p2=new Pair<String>("aa","bb");
//		System.out.println(p2.getFirst()+" "+p2.getSecond());
//		System.out.println(p1.getFirst()+" "+p1.getSecond());
		
		
		
		
		

	}

}
