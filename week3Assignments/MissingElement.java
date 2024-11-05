package week3Assignments;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List ;
public class MissingElement {
	public static void main(String[] args) {
        // Declare and initialize the array
        int[] array = {1, 2, 3, 4, 10, 6, 8};
        
        
        List<Integer> list = new ArrayList<>();
        for (int num : array) {
            list.add(num);
        }
        
        
        Collections.sort(list);
        
        
        for (int i = 0; i < list.size() - 1; i++) {
            int current = list.get(i);
            int next = list.get(i + 1);
            
            if (current + 1 != next) {
                
                for (int j = current + 1; j < next; j++) {
                    System.out.println("Missing number: " + j);
                }
            }
        }
	}}

