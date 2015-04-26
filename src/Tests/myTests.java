package Tests;

import org.junit.*;
import static org.junit.Assert.*;
import sort.sortingAlgorithms;

@SuppressWarnings("unused")
public class myTests {
	
	int[] worstCase50 = new int[50];
	int[] worstCase500 = new int[500];
	int[] worstCase5000 = new int[5000];
	int[] worstCase50000 = new int[50000];
	int[] worstCase500000 = new int[500000];
	
	public boolean isSorted (int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] > arr[i+1])
				return false;
		}
		
		return true;
	}
	
	@Test
	public void worstCase() {
		sortingAlgorithms sortObject = new sortingAlgorithms();
		
		int[] worstCaseMillion = new int[100000];
		int index = 0;
		
		for (int i = worstCaseMillion.length; i > 0 ; i--) {
			worstCaseMillion[index] = i;
			index++;
		}
		
		assertEquals(true, isSorted(sortObject.insertionSort(worstCaseMillion.clone())));
	}
}
