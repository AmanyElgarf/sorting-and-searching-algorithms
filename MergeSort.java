class MergeSort{
	int[] arr;
	MergeSort(int arr[]){
		this.arr = arr;
	}
	
	private void merge(int arr[], int l, int m, int r) {
		
		int arrL[] = new int[m - l + 1];
		int arrR[] = new int[r - m];
		
		for(int x = 0; x < arrL.length; ++x) {
			arrL[x] = arr[l + x];
			}
		for(int y= 0; y< arrR.length; ++y) {
			arrR[y] = arr[m + 1 + y];
			}
		
		int i=0, j=0;
		int k=l;
		
		while(i<arrL.length && j<arrR.length) {
			if (arrL[i] <= arrR[j]) {
				arr[k] = arrL[i];
				i++;
			}
			else {
				arr[k] = arrR[j];
				j++;
			}
			k++;
		}
		
		while(i < arrL.length) {
			arr[k] = arrL[i];
			i++;
			k++;
		}
		
		while(j < arrR.length) {
			arr[k] = arrR[j];
			j++;
			k++;
		}
		
	}
	
	private void sort(int arr[], int l, int r) {
		if(l < r) {
			int m = (l+r)/2;
			sort(arr, l, m);
			sort(arr, m+1, r);
			merge(arr, l, m , r);
			}
	}
	
	public void main() {
		int size = this.arr.length;
		System.out.print("Original array is: ");
		for(int i=0; i<size; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		sort(this.arr, 0, size-1);
		System.out.print("Sorted array is: ");
		for(int i=0; i<size; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}