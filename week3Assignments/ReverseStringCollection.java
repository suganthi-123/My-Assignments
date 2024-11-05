package week3Assignments;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
public class ReverseStringCollection {

	public static void main(String[] args) {
		
		  
        String[] companies = { "HCL", "Wipro", "Aspire Systems", "CTS" };

        
        List<String> companyList = new ArrayList<>(Arrays.asList(companies));

        
        Collections.sort(companyList);

        
        Collections.reverse(companyList);

        
        for (String company : companyList) {
            System.out.print(company + ", ");
        }
        // Print a new line at the end
        System.out.println();
    }
}
	


