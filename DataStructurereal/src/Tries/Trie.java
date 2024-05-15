package Tries;


import java.util.ArrayList;

class trieNode{
	char data;
	boolean isTerminal;
	trieNode Children[];
	int childCount;
	boolean ending;
	boolean restPaidromr;
	public trieNode(char data){
		this.data=data;
		this.isTerminal=false;
		this.Children=new trieNode[26];
		this.childCount=0;
	}

}

public class Trie {

	private trieNode root;
	private int  numWords;

	public Trie() {
		root=new trieNode('\0'); 
	}

	private boolean addHelper(trieNode root, String word) {

		if(word.length()==0) {
			root.isTerminal=true;
			return true;
		}

		int childIndex= word.charAt(0) - 'A';

		trieNode child=root.Children[childIndex];
		if(child==null) {
			child=new trieNode(word.charAt(0));
			root.Children[childIndex]=child;
			root.childCount++;
		}
		return addHelper(child, word.substring(1));


	}

	public void add(String word){

		if(addHelper(root, word))
			numWords++;






	}

	private boolean searchHelper(trieNode root, String word) {

		if(word.length()==0) {
			//			System.out.println("HEy");



			return root.isTerminal;

		}

		int childIndex= word.charAt(0)-'A';
		trieNode child=root.Children[childIndex];

		if(child==null) {
			return false;
		}
		return searchHelper(child, word.substring(1));



	}

	public boolean search (String word) {
		return searchHelper(root, word);
	}


	private boolean removeHelper(trieNode root, String word) {

		if(word.length()==0 ) {
			if(root.isTerminal) {
				root.isTerminal=false;
				return true;
			}
			else {
				return false;
			}
		}


		int childIndex= word.charAt(0)-'A';
		trieNode child=root.Children[childIndex];
		if(child==null) {
			return false;
		}
		boolean ans=removeHelper(child, word.substring(1));

		// very important conditions
		if(child.isTerminal&& child.childCount==0) {
			root.Children[childIndex]=null;
			root.childCount--;
		}
		return ans;


	}


	public void remove(String word) {

		if(removeHelper(root,word))
			numWords--;

	}

	private void print(trieNode root,String word) {
		if(root==null) {
			return;
		}

		if(root.isTerminal) {
			System.out.println(word);
		}
		for(trieNode child: root.Children) {
			if(child==null) {
				continue;
			}
			String fwd=word+child.data;
			print(child,fwd);
		}
	}

	public void print() {
		print(this.root,"");
	}


	public int coundWords(){
		return numWords;
	}

	public boolean patternMatching(ArrayList<String> vect, String pattern) {
		// Write your code here
		for(int i=0;i<vect.size();i++) {
			String str=vect.get(i);
			for(int j=1;j<str.length();j++) {
				add(str.substring(j));
				add(str.substring(0, j));
			}

		}




		boolean ans=false;
		if(search(pattern)) {
			ans=true;
		}
		return ans;
	}

	/*
	 * 
	 * 
	 * 
	 * is Palidrome problem
	 * 
	 * 
	 */




	public String reverse(String word) {

		String xString="";
		for(int i=word.length()-1;i>=0;i--) {
			xString+=word.charAt(i);
		}
		return xString;

	}


	public boolean isPalindromePair(ArrayList<String> words) {
		for(String word : words) {
			this.add(reverse(word));
		}

		return isPalindromePair(this.root,words);

	}

	private boolean isPalindromePair(trieNode root,ArrayList<String> words ) {
		if(words==null|| words.size()==0) {
			return false;
		}
		for(String word: words) {
			if(doesPairExistFor(root,word,0)) {
				return true;
			}
		}
		return false;
	}

	private boolean doesPairExistFor(trieNode root, String word, int startIndex) {
		// since and empty string is alsways a palidrome there for return true;
		if(word=="") {
			return true;
		}
		if(startIndex==word.length()) {
			if(root.isTerminal) {

				// when there exist excat match of the word we are searching  for in the tries, irrespective of the tries
				//extends further in the same path.
				return true;
			}

			return checkRemainingBrancesIntries(root,"");
		}
		int  charIndex= word.charAt(startIndex)-'a';
		trieNode correspondingChild=root.Children[charIndex];

		if(correspondingChild==null) {
			// this means the cracter we are looking for does not exist in this brance down the lane

			if(root.isTerminal) {
				return checkWordForPalidrome(word.substring(startIndex));
			}
			return false;
		}
		return doesPairExistFor(correspondingChild,word,(startIndex+1));



	}

	private boolean checkRemainingBrancesIntries(trieNode root, String word) {
		/*
		 * This function recursively explore all the brances  from the  root  while keeping the track  of the characters in the 'word' and checks
		 * each word when ever the terminating condition is true
		 * 
		 * if the word is palidrome we return true and donot explore more if not we keep on checking other brances.
		 * 
		 * if all the brances are doen and we donot find any word we return false;
		 */
		if(root.isTerminal) {
			if(checkWordForPalidrome(word)) {
				return true;
			}

		}

		for(trieNode childNode:root.Children) {
			if(childNode==null)
			{
				continue;
			}

			String fwd=word+childNode.data;
			if(checkRemainingBrancesIntries(childNode,fwd)){
				return true;
			}

		}
		return false;

	}

	private static  boolean checkWordForPalidrome(String word) {
		int startIndex=0;
		int endIndex=word.length() -1;
		while(startIndex<endIndex) {
			if(word.charAt(startIndex)!=word.charAt(endIndex)) {return false;}
			startIndex+=1;
			endIndex+=1;
		}
		return true;

	}	






	/*
	 * 
	 * 
	 * Auto complete
	 */


	public void autoComplete(ArrayList<String> input, String word) {

		Trie t=new Trie();

		for(String data:input) {
			t.add(data);
		}
		
		if(root == null || root.childCount == 0) { 
            return;
        }

		findWord(root,word,word);




	}


	public void findWord(trieNode root, String word, String Oword) {

		if(word.length()==0) {
			allPossibleWords(root,Oword,"");
			return;

		}

		int childIndex=word.charAt(0)-'a';
		trieNode childNode=root.Children[childIndex];
		if(childNode==null) {
			return;
		}
		findWord(childNode, word.substring(1),Oword);
	}

	private void allPossibleWords(trieNode root, String word,String output) {
		if(root == null){
			return;
		}

		if(root!=null && root.childCount == 0) { 
			if(output.length() > 0) {
				System.out.println(word + output); 
			}
			return; 
		}
		if(root!=null && root.isTerminal == true) {
			System.out.println(word + output);
		}

		for(int i = 0; i < root.Children.length; i++) {
			if(root.Children[i] != null) {
				String ans = output + root.Children[i].data; 
				allPossibleWords(root.Children[i],word,ans);
			}
		}
	}

}








