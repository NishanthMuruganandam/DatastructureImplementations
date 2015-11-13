package algorithms.array;

public class MergeSort {

	static void merge(int arr[],int low,int mid,int high){
		
		int[] temp = new int[arr.length];
		for(int i = low;i<=high;i++){
			temp[i] = arr[i];
		}
		
		int i=low,j=mid+1,k=low;		
		while(i<=mid&&j<=high){
			if(temp[i]<=temp[j]){
				arr[k] = temp[i];
				i++;
			}else{
				arr[k] = temp[j];
				j++;
			}
			k++;
		}		
		while(i<=mid){
			arr[k++] = temp[i++];
		}	
		while(j<=high){
			arr[k++] = temp[j++];
		}
	}
	
	static void mergeSort(int arr[],int low,int high){
		if(low < high){
			
			int mid = (low+high)/2;
			mergeSort(arr, low, mid);
			mergeSort(arr, mid+1, high);
			merge(arr, low, mid, high);
		}
	}	
	
	static void mergeSort(int arr[]){		
		
		mergeSort(arr, 0, arr.length-1);
	}
	
	public static void main(String[] args) {
		int arr[] = {2,4,1,5,3};
		mergeSort(arr);
		for (int i: arr){
			System.out.println(i);
		}
	}
	
}
