package trees;

public interface Traversals {

	public void inOrder(Node root,OperationDuringTraversal operation);
	public void preOrder(Node root,OperationDuringTraversal operation);
	public void postOrder(Node root,OperationDuringTraversal operation);
	
	
}
