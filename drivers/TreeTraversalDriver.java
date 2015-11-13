package drivers;

import trees.BinarySearchTree;
import trees.OperationDuringTraversal;
import trees.Printer;

public class TreeTraversalDriver {
	public static void main(String[] args) {
		BinarySearchTree myTree = new BinarySearchTree(10);
		OperationDuringTraversal operation = new Printer();
		myTree.insert(3);
		myTree.insert(12);
		myTree.inOrder(operation);
		System.out.println();
		myTree.postOrder(operation);
		System.out.println();
		myTree.preOrder(operation);
	}
}
