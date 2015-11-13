package algorithms.array;

public class ZigZag {

	static int max(int arr[] ,int i , int j ,int k){
			
		if(arr[i]>=arr[j]&&arr[i]>=arr[k]){
			return i;
		}		
		else if(arr[j] >= arr[i] &&arr[j] >= arr[k]){
			return j;
		}
		return k;
	}
	
	static int min(int arr[] ,int i , int j ,int k){
		
		if(arr[i]<=arr[j]&&arr[i]<=arr[k]){
			return i;
		}		
		else if(arr[j] <= arr[i] &&arr[j] <= arr[k]){
			return j;
		}
		return k;
	}
	
	static void swap(int arr[],int i,int j){
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
	static void display(int arr[]){
		for(int i:arr){
			System.out.print(i+" ");
		}
		System.out.println();
	}
	static void zigzag(int arr[]){
		if (arr.length == 0 || arr.length == 1){
			return;
		}
		//Length 2 is a special case
				
		if (arr.length == 2){
			if (arr[1] >= arr[0]){
				return;
			}
			swap(arr,0,1);
		}
		for(int  i = 1;(i+1)<arr.length;i+=2){
			int maxIndex = max(arr,i-1,i,i+1);
			swap(arr,i,maxIndex);
			int minIndex = min(arr,i-1,i,i+1);
			swap(arr,i-1,minIndex);
		}
	}
	
	public static void main(String[] args) {
		int arr[] = {3,7,4,5,2,9,12,6};				
		zigzag(arr);
		System.out.println("Output:");
		display(arr);
		
	}
}
