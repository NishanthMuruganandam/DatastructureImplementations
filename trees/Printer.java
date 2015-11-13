package trees;

public class Printer implements OperationDuringTraversal{

	@Override
	public void task(Object arguments) {
		System.out.print(arguments.toString()+" ");
	}


	
}
