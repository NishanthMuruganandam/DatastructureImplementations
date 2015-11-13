package tries;

import java.util.HashMap;
import java.util.Map;

public class Node {
	boolean isWord;
	Map<Character,Node> children;
		
	Node(boolean isWord){
		this.isWord = isWord;
	}
	
	public void insert(String str){		
		if(str == null || str.isEmpty()){
			return;
		}		
		if (this.children == null){
			this.children = new HashMap<Character, Node>();						
		}
		this.children.put(str.charAt(0), new Node(true));
		this.children.get(str.charAt(0)).insert(str.substring(1));
	}
	
	public boolean checkIfWord(String str){
		if(str == null){
			return false;
		}		
		if (str.isEmpty()){
			return this.isWord;
		}
		if (this.children == null || this.children.get(str.charAt(0)) == null){
			return false;
		}
		return this.children.get(str.charAt(0)).checkIfWord(str.substring(1));		
	}
}
