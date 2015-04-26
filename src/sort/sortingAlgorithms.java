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
	
	public int[] selectionSort(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
            int index = i;
            
            for (int j = i + 1; j < arr.length; j++)
                if (arr[j] < arr[index])
                    index = j;
      
            int smallerNumber = arr[index]; 
            arr[index] = arr[i];
            arr[i] = smallerNumber;
        }
        return arr;
	}
}
