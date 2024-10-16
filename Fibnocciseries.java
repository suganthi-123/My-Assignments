package week.day2;

public class Fibnocciseries {
public static void main(String[] args) {
	int n=8,firstnumber=0, secondnumber=1;
	System.out.println("Fibnoacci Series");
	for (int i=1;i<=n;i++) {
		System.out.print(firstnumber+",");
		int nextnumber = firstnumber + secondnumber;
		firstnumber=secondnumber;
		secondnumber=nextnumber;
	
		
	}
}
}
