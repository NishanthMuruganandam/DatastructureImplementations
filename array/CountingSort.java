package algorithms.array;


public class CountingSort {

	public static void countingSort(int[] array, int min, int max){
		int[] count= new int[max - min + 1];
		for(int number : array){
			count[number - min]++;
		}
		int z= 0;
		for(int i= min;i <= max;i++){
			while(count[i - min] > 0){
				array[z]= i;
				z++;
				count[i - min]--;
			}
		}
	}
	
	public static void countingSort(int [] arr){
		
		int min = arr[0],max = arr[0];
		
		for(int i:arr){
			if(i<min){
				min = i;
			}
			if(i> max){
				max = i;
			}
		}
		
		countingSort(arr, min, max);
	}
	public static void main(String[] args) {
		int arr[] = {4,2,-10,3,5};
		countingSort(arr);
		for(int i:arr){
			System.out.println(i);
		}
		
	}
}
