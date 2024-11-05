package week3Assignments;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class SecondLargest {
	 public static void main(String[] args) {
	        // Step 1: Declare an array
	        int[] numbers = {3, 2, 11, 4, 6, 7};
	        
	        // Step 2: Convert the array to a List
	        List<Integer> numberList = new ArrayList<>();
	        for (int number : numbers) {
	            numberList.add(number);
	        }
	        
	      
	        Collections.sort(numberList);
	        
	    
	        int secondLargest = numberList.get(numberList.size() - 2);
	        
	       
	        System.out.println("The second largest number is: " + secondLargest);
	      
	        int secondFromLast = numbers[numbers.length -2];
	        
	        
		       
	        System.out.println("The second element from the last is: " + secondFromLast);
	    }
	}