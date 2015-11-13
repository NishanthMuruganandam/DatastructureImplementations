package algorithms.array;

public class QuickSort {

	static void swap(int arr[],int i, int j){
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
	static void sort(int arr[],int low,int high){
		int pivot = arr[(low+high)/2];
		
		int i = low,j=high;
		while(i<=j){
			
			while(arr[i]<pivot){
				i++;
			}
			while(arr[j]>pivot){
				j--;
			}
			if(i<=j){
				swap(arr,i,j);
				i++;j--;
			}
		}
		if(low<j){
			sort(arr,low,j);
		}
		if(i<high){
			sort(arr,i,high);
		}
	}
	
	static void sort(int [] arr){
		sort(arr,0,arr.length-1);
	}
	public static void main(String[] args) {
		int arr[] = {1,3,3,1};
		sort(arr);
		for(int i:arr){
			System.out.print(i+" ");
		}
	}
	
}
