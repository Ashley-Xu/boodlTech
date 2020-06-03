package boodlTech;
import java.util.HashMap;
import java.util.Arrays;
public class sumToN {

//	 Ideas
//		Approach 1: Brute Force 
//	        We can loop through the array of integers using a nested for loop to calculate the sum of each combination.
//	        And then we can check if any of those match with the target
//	        If such pair exists, return their indices, if no return -1
//	        --> Time complexity: O(N^2) Space complexity: O(1) 
//		    ==> Too slow!
//	
//		Approach 2: Using a Hashmap
//	        We can loop through the array and put each element into a hashmap.
//	        Then we calculate the difference of each element and the target, see if the difference exist in the hashmap
//	        If yes, return the pair's indices. if no, return -1
//	        --> Time complexity: O(2N) Space Complexity: O(N)
//	   
//	        
//	    Approach 3: Using a Hashmap and check while storing 
//			As we are looping through the array to put into the hashmap, we can calculate the difference and check if it matches with current elements in the hashmap  
//	        This way, we don't even need to loop through the entire array and store everything in the hashmap
//	        --> Time complexity worst case: O(N) Space Complexity worst case: O(N)
//	
//	    I have implemented Approach 3 below: 
	
	public static int[] sum_to_n(int[] arr, int target) {
		
		HashMap<Integer, Integer> hmap = new HashMap<>();
		int difference = 0;
		int[] result = new int[2];
		for (int i = 0; i < arr.length; i++) {
			hmap.put(arr[i], i);
			difference = target - arr[i];
			if (hmap.containsKey(difference)) {
				result[1] = i;
				result[0] = hmap.get(difference);
				return result;
			}
		}	
		return result;
	}
	
	public static void main(String[] args) {
		int[] input = {1, 3, 7, 2}; 
		
	    System.out.print(Arrays.toString(sum_to_n(input, 8)));
	  }
	
}
