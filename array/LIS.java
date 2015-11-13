package algorithms.array;

public class LIS {

	static int longestIncreasingSubsequence(int[] arr){
		int table [] = new int[arr.length];
		int index[] = new int[arr.length];
		
		for(int i = 0;i<table.length;i++){
			table[i] = 1;
			index[i] = -1;
		}
		
		for(int i = 0;i<table.length;i++){
			for(int j=0;j<i;j++){
				if(arr[i]>arr[j] && table[i] < table[j] + 1){
					table[i] = table[j] + 1;
					index [i] = j;
				}
			}
		}
		
		int maxIndex = 0;
		int max = table[0];
		for(int i=1;i<table.length;i++){			
			if(table[i] > max){
				max = table[i];
				maxIndex = i;
			}				
		}
		
		int[] longestIncreasingSubsequence = new int[max];
		int j = max-1;
		while(maxIndex>=0){
			longestIncreasingSubsequence[j] = arr[maxIndex];
			j--;
			//System.out.print(arr[maxIndex]+" ");
			maxIndex = index[maxIndex];
		}
		
		for(int i : longestIncreasingSubsequence){
			System.out.println(i);
		}
		
		return max;
	}
	public static void main(String[] args) {
		int arr[] = {80,50,75,35,100};
		System.out.println(longestIncreasingSubsequence(arr));
	}
}
