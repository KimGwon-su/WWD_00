package db;

import java.util.Arrays;

public class Solution15 {
	public int[] solution(int[] arr) {
		int left = 0;
		int right = arr.length - 1;
		
		while(right > left ) {
			int temp = arr[left];
			arr[left] = arr[right];
			arr[right] = temp;
			left += 1;
			right -= 1;
			
		}
		
		return arr;
	}


	public static void main(String[] args) {
		Solution15 sol = new Solution15();
		int[] arr = { 1, 4, 2, 3, 5, 8};
		int[] ret = sol.solution(arr);
		
		System.out.println(Arrays.toString(ret));

	}
}

