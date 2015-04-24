package sort;

public class sortingAlgorithms {
	
	public int[] insertionSort (int[] arr) {
		for (int i = 1; i < arr.length; i++) {
			int temp = arr[i];
			int j;
			
			for (j = i - 1; j >= 0 ; j--) {
				if (temp < arr[j])
					arr[j + 1] = arr[j];
			}
			
			arr[j + 1] = temp;
		}
		return arr;
	}
}
