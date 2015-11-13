package trees;

import java.util.Queue;

public class BinarySearchTree implements Traversals{

	Node root;

	public BinarySearchTree(int data) {
		root = new Node(data);		
	}
	
	public void insert(int data){
		if (root == null){
			root = new Node(data);
		}
		insert(root,data);
	}
	
	
	private static void insert(Node node, int data) {
		if(data >= node.data){
			if (node.rightChild == null){
				node.rightChild = new Node(data);
			}else{
				BinarySearchTree.insert(node.rightChild, data);
			}						
		}else if(data < node.data){
			if(node.leftChild == null){
				node.leftChild = new Node(data);
			}else{
				BinarySearchTree.insert(node.leftChild,data);
			}
		}
	}

	public void inOrder(OperationDuringTraversal operation){
		inOrder(root,operation);
	}
	public void preOrder(OperationDuringTraversal operation){
		preOrder(root,operation);
	}
	public void postOrder(OperationDuringTraversal operation){
		postOrder(root,operation);
	}
	@Override
	public void inOrder(Node root,OperationDuringTraversal operation) {
		
		if(root == null){
			return;
		}
		inOrder(root.leftChild,operation);
		operation.task(root.data);
		inOrder(root.rightChild,operation);
		
	}

	@Override
	public void preOrder(Node root,OperationDuringTraversal operation) {
		if(root == null){
			return;
		}
		operation.task(root.data);
		preOrder(root.leftChild,operation);
		preOrder(root.rightChild,operation);
			
	}

	@Override
	public void postOrder(Node root,OperationDuringTraversal operation) {
		if(root == null){
			return;
		}
		postOrder(root.leftChild,operation);
		postOrder(root.rightChild,operation);
		operation.task(root.data);
		
	}
		
}
