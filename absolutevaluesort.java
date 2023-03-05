import java.io.*;
import java.util.*;
import java.lang.Math;

class Solution {

	static int[] absSort(int[] arr) {
		// your code goes here
    
    // 1. math.abs(), sort the array ->
    // need to check if same abs number is there then place negative first
    
    for(int i=0; i<arr.length; i++) {
      for(int j = i+1; j<arr.length; j++) {
        int temp = 0;
        // [2, 7, 2, 2, 0]
        if(Math.abs(arr[i]) > Math.abs(arr[j])) {
          temp = arr[i];
          arr[i] = arr[j];
          arr[j] = temp;
        }
        
        if(Math.abs(arr[i]) == Math.abs(arr[j])){
          if(arr[i] > arr[j]) {
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
          }
        }        
      }
    }
    return arr;
	}

	public static void main(String[] args) {
	
	}
}
