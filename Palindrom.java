package boodlTech;

public class Palindrom {
//	Ideas
//	Approach 1: Check its reverse   
//        We can use % 10 to access each digit in the number as the remainder of number % 10
//        For each iteration, we will update the number with number/10, and we will stop until it reaches 0
//        We can then make a reversedNumber by adding the new remainder to the previous * 10, then compare if the original is the same as the reversed       
//	      --> Time complexity: O(N) Space complexity: O(1)
//
//	Approach 2: Using Recursion
//        Create a copy of the number
//        Recursively pass the copy by reference, and pass the original number by value 
//        In the recursive calls, divide number by 10 while moving down the recursion tree
//        While moving up the recursion tree, divide the copy by 10
//        --> Time complexity: O(2N) Space Complexity: O(N)
//   
//    I have implemented Approach 2 below because it's more interesting, even though there will be call stacks taking up memory:
//

	public static int helper (int num, int copy) throws Exception {
		//Base case: return once we move past first digit
		if(num == 0) 
			return copy;
		else
			copy = helper(num/10, copy);
		//Check if the first digits of num and its copy are the same
		if(num % 10 == copy % 10) 
		// if first digit values of num and copy are equal, divide copy value by 10 to keep moving in sync with num. 
			return copy/10;
		else
			// At position values are not  
            // matching throw exception and exit.  
            // no need to proceed further. 
			throw new Exception();
	}
	
	public static int isPalindrome (int num) throws Exception {
		if (num < 0)
			num = -num;
		int copy = num; 
		return helper(num, copy);
	}
	public static void main(String args[]) { 
		   
        int n = 8; 
        try { 
            isPalindrome(n); 
            System.out.println("Yes"); 
        } catch (Exception e) { 
            System.out.println("No"); 
        } 
        
        n = 5556; 
        try { 
        	isPalindrome(n); 
            System.out.println("Yes"); 
        } catch (Exception e) { 
            System.out.println("No"); 
        } 
   
        n = 101; 
        try { 
        	isPalindrome(n); 
            System.out.println("Yes"); 
        } catch (Exception e) { 
            System.out.println("No"); 
        } 
   
    } 
} 
   

