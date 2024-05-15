package Tries;

public class TriesUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Trie t= new Trie();
		t.add("NOTE");
		t.add("NEFFI");
		t.add("QUID");
		System.out.println(t.search("NEFFI"));
		
		
//		t.remove("NEFFIT");
		System.out.println(t.search("NEFFI"));
		System.out.println(t.coundWords());
		System.out.println();
		Trie t1= new Trie();
		t1.add("A");
		t1.add("B");
	
		t1.print();
	
		
		

	}

}
