package pkgHelper;

import java.util.Arrays;

public class LatinSquare {
	private int [][] LatinSquare;

	public LatinSquare(int[][] puzzle) {
		super(); //what does super mean? no need for this. since the variables are different.
		LatinSquare = puzzle;
	}

	public int[][] getLatinSquare() { //The getter method that will call this square.
		return LatinSquare;
	}

	public void setLatinSquare(int[][] latinSquare) { // The setter method.
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
		if (arr == null) {
			return false;
		}
		int [] arrCopy = Arrays.copyOf(arr, arr.length); //this saves the original array from being changed completly.
		Arrays.sort(arr); // Arrays are passed by reference. Once the array is passed through this method, it will remain sorted and not revert back to its original form.
		
		for (int i = 0; i <arr.length - 1; i++) {
			if (arrCopy[i] == arrCopy[i+1]) {
				return true;
			}
		}
		
		return false;
	}
	public static boolean hasAllValues(int [] arr1, int[] arr2) {
		boolean hasAllValues = true;
		for (int j = 0; j < arr2.length; j++) 
		{
			boolean bFound = false;
			
			for(int i = 0; i < arr1.length; i++) {
				if (arr1[i]==arr2[j]) {
					bFound = true;
					break;
					
				}
	}
			if (bFound == false) {
				hasAllValues = false;
				break;
				
			}
	}
		return hasAllValues;

	}
}
