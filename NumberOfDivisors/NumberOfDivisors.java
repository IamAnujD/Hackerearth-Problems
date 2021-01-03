import java.util.*;
public class NumberDivisors {
public static void main(String args[]) 
{
	Scanner sc = new Scanner(System.in);
	int testcases = sc.nextInt();StringBuilder mi = new StringBuilder();
	while(testcases-->0) {
		long n = sc.nextLong();
		long k = sc.nextLong();
		long sum =(n * (n+1)) /2;
		long temp=k;
		while(temp<=n) {
			long up = n/temp;
			sum= sum - (k - 1) * (up * (up + 1)) / 2;
			 temp *= k;
		}
		mi.append(sum+ "\n");
		
	}
	System.out.print(mi);}
}
