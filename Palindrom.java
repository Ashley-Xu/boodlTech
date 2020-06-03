package boodlTech;

public class Palindrom {
//	Ideas
//	Approach 1: checking if   
//        We can 
//        --> Time complexity: O(N^2) Space complexity: O(1) 
//	    ==> Too slow!
//
//	Approach 2: Using a Hashmap
//        We can loop through the array and put each element into a hashmap.
//        Then we calculate the difference of each element and the target, see if the difference exist in the hashmap
//        If yes, return the pair's indices. if no, return -1
//        --> Time complexity: O(2N) Space Complexity: O(N)
//   
//        
//    Approach 3: Using a Hashmap and check while storing 
//		As we are looping through the array to put into the hashmap, we can calculate the difference and check if it matches with current elements in the hashmap  
//        This way, we don't even need to loop through the entire array and store everything in the hashmap
//        --> Time complexity worst case: O(N) Space Complexity worst case: O(N)
//
//    I have implemented Approach 3 below: 
}
