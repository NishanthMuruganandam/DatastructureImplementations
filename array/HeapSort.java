package algorithms.array;

public class HeapSort {

	static void swap(int arr[],int i, int j){
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	static void heapify(int[] arr,int start){
		for(int i = start;i>0;i--){

			int p = (int)Math.ceil(i/2.0) - 1;

			if(arr[p] > arr[i]){				
				int temp = arr[i];
				arr[i] = arr[p];
				arr[p] = temp;
			}
		}
	}

	static void heapSort(int[] arr){

		for( int end = arr.length-1;end>0;end--){
			heapify(arr,end);
			swap(arr,0,end);
		}

	}
	public static void main(String[] args) {
		
		int arr[] = {5,4,3,2,-1};
		heapSort(arr);		
		for(int i : arr){
			System.out.println(i);
		}
	}
}
