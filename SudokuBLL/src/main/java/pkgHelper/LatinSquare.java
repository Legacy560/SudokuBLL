package pkgHelper;

import java.util.Arrays;

public class LatinSquare {
	private int [][] LatinSquare;

	public LatinSquare(int[][] puzzle) {
		super(); //what does super mean?
		LatinSquare = puzzle;
	}

	public int[][] getLatinSquare() {
		return LatinSquare;
	}

	public void setLatinSquare(int[][] latinSquare) {
		LatinSquare = latinSquare;
	}
	public static boolean doesElementExist(int[] arr, int iValue) { //First three words, Access modifier, ???, return type.
		for (int x=0; x < arr.length; x++)
		{
			if (arr[x]==iValue) {
				return true;
			}
		}
		return false;
}
	public static boolean hasDuplicates (int[] arr) {
		int [] arrCopy = Arrays.copyOf(arr, arr.length); //this saves the original array from being changed completly.
		Arrays.sort(arr); // Arrays are passed by reference. Once the array is passed through this method, it will remain sorted and not revert back to its original form.
		
		for (int i = 0; i <arr.length - 1; i++) {
			if (arrCopy[i] == arrCopy[i+1]) {
				return true;
			}
		}
		
		return false;
	}
	/*public static boolean hasAllValues(int [] arr1, int[] arr2) {
		boolean hasAllValues = true;
		for (int j = 0; j < arr2.length; j++) 
		{
			boolean bFound = false;
			
			for(int i = 0; i < arr1.length; i++) {
		
	}
	}
		

	}*/
}
