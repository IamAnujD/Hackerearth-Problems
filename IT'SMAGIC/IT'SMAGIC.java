import java.util.*;
class test1{
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	int  n = sc.nextInt();
	int array[] = new int[n];long sum = 0;
	for(int i=0;i<n;i++) {
		array[i] = sc.nextInt();
		
		sum=sum+array[i];
		
		
	}
	
	boolean b=false;int index=0;int low = 0;
	for(int i=0;i< n;i++) {
		if((sum-array[i])%7==0) {if(b==false) {low=array[i];index=i;}if(array[i]<low&& b!=false) {low=array[i];index=i;} b=true;}
		
	}
	if(b) System.out.print(index);
	else
		System.out.print("-1");
	}
	
}
