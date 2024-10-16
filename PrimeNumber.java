package week.day2;

public class PrimeNumber {
public static void main(String[]args) {
	int num=34;
	int count=0;
	for(int i=2;i<num;i++) {
	if(num%2==0) {
		count=1;
		break;
	}
	}
if(count==0) {
	System.out.println("prime");
}else {
	System.out.println("notprime");
}
}
}
