package tries;

public class Trie {
	public static void main(String[] args) {
		Node root = new Node(false);
		root.insert("Hello");
		System.out.println(root.checkIfWord("Helo"));
		
		System.out.println(root.checkIfWord("Helllo"));
	}
	
}
