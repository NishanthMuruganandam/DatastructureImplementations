package algorithms.array;

public class VotingAlgorithm {
	
	
	static boolean findMajority(int[] arr){
		
		if (arr == null || arr.length == 0){
			return false;
		}
				
		int element = arr[0],count=1;
		
		for(int i = 1;i<arr.length;i++){
			
			if(element == arr[i]){
				count++;				
			}else{
				count--;
				if(count == 0){
					count = 1;
					element = arr[i];
				}
			}
		}
		count = 0;
		for(int i:arr){
			if(i == element){
				count++;
			}
		}
		
		if(count>(arr.length/2)){
			System.out.println(element);
			return true;
		}		
		return false;
	}
	
	
	public static void main(String[] args) {
			
		int arr[] = {3,3,5,2,4,4,2,4,4};
		System.out.println(findMajority(arr));
		
	
	}
}
