package Tests;

import org.junit.*;
import static org.junit.Assert.*;
import sort.sortingAlgorithms;

@SuppressWarnings("unused")
public class myTests {
	
	public boolean isSorted (int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] > arr[i+1])
				return false;
		}
		
		return true;
	}
	
	@Test
	public void worstCaseMillion() {
		sortingAlgorithms sortObject = new sortingAlgorithms();
		
		int[] worstCaseMillion = new int[100000];
		int index = 0;
		
		for (int i = worstCaseMillion.length; i > 0 ; i--) {
			worstCaseMillion[index] = i;
			index++;
			System.out.print(i + " ");
		}
		
		assertEquals(true, isSorted(sortObject.insertionSort(worstCaseMillion.clone())));
	}
}
