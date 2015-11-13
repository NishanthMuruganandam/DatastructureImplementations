package algorithms.array;

public class Kadane {

	static int maximumSum(int arr[]){
		int maxEndingHere = 0, maxSoFar = 0;
		
		for(int i=0;i<arr.length;i++){
			maxEndingHere = maxEndingHere + arr[i];
			if(maxEndingHere<0){
				maxEndingHere = 0;
			}
			if(maxSoFar<maxEndingHere){
				maxSoFar = maxEndingHere;						
			}
		}
		return maxSoFar;
	}
	
	public static void main(String[] args) {
		int arr[] = {-2, -3, 4, -1, -2, 1, 5, -3};
		System.out.println(maximumSum(arr));		
	}

}
