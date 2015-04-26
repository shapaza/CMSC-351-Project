package Tests;

import org.junit.*;
import static org.junit.Assert.*;
import sort.sortingAlgorithms;

@SuppressWarnings("unused")
public class myTests {
	sortingAlgorithms sortObject = new sortingAlgorithms();
	
	int[] worstCase50 = new int[50];
	int[] worstCase500 = new int[500];
	int[] worstCase5000 = new int[5000];
	int[] worstCase50000 = new int[50000];
	int[] worstCase100000 = new int[100000];
	int[] worstCase250000 = new int[250000];
	int[] worstCase500000 = new int[500000];
	
	int[] randomCase50 = new int[50];
	int[] randomCase500 = new int[500];
	int[] randomCase5000 = new int[5000];
	int[] randomCase50000 = new int[50000];
	int[] randomCase100000 = new int[100000];
	int[] randomCase250000 = new int[250000];
	int[] randomCase500000 = new int[500000];
	
	public boolean isSorted (int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] > arr[i+1])
				return false;
		}
		
		return true;
	}
	
	@Test
	public void setUpArrays() {
		for (int i = 0; i < 500000; i++) {
			if (i < 50)
				worstCase50[i] = worstCase50.length - i;
			if (i < 500)
				worstCase500[i] = worstCase500.length - i;
			if (i < 5000)
				worstCase5000[i] = worstCase5000.length - i;
			if (i < 50000)
				worstCase50000[i] = worstCase50000.length - i;
			if (i < 100000)
				worstCase100000[i] = worstCase100000.length - i;
			if (i < 250000)
				worstCase250000[i] = worstCase250000.length - i;
			
			worstCase500000[i] = worstCase500000.length - i;
		}
		
		assertTrue(true);
	}
	
	@Test
	public void worstCaseInsertion1() {
		assertEquals(true, isSorted(sortObject.insertionSort(worstCase50.clone())));
	}
	
	@Test
	public void worstCaseInsertion2() {
		assertEquals(true, isSorted(sortObject.insertionSort(worstCase500.clone())));
	}
	
	@Test
	public void worstCaseInsertion3() {
		assertEquals(true, isSorted(sortObject.insertionSort(worstCase5000.clone())));
	}
	
	@Test
	public void worstCaseInsertion4() {
		assertEquals(true, isSorted(sortObject.insertionSort(worstCase50000.clone())));
	}
	
	@Test
	public void worstCaseInsertion5() {
		assertEquals(true, isSorted(sortObject.insertionSort(worstCase100000.clone())));
	}
	
	@Test
	public void worstCaseInsertion6() {
		assertEquals(true, isSorted(sortObject.insertionSort(worstCase250000.clone())));
	}
	
	@Test
	public void worstCaseInsertion7() {
		assertEquals(true, isSorted(sortObject.insertionSort(worstCase500000.clone())));
	}
	
	@Test
	public void worstCaseSelection1() {
		assertEquals(true, isSorted(sortObject.selectionSort(worstCase50.clone())));
	}
	
	@Test
	public void worstCaseSelection2() {
		assertEquals(true, isSorted(sortObject.selectionSort(worstCase500.clone())));
	}
	
	@Test
	public void worstCaseSelection3() {
		assertEquals(true, isSorted(sortObject.selectionSort(worstCase5000.clone())));
	}
	
	@Test
	public void worstCaseSelection4() {
		assertEquals(true, isSorted(sortObject.selectionSort(worstCase50000.clone())));
	}
	
	@Test
	public void worstCaseSelection5() {
		assertEquals(true, isSorted(sortObject.selectionSort(worstCase100000.clone())));
	}
	
	@Test
	public void worstCaseSelection6() {
		assertEquals(true, isSorted(sortObject.selectionSort(worstCase250000.clone())));
	}
	
	@Test
	public void worstCaseSelection7() {
		assertEquals(true, isSorted(sortObject.selectionSort(worstCase500000.clone())));
	}
	
	
	
}
