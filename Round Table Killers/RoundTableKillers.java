import java.util.*;
class roundtablekiller {
public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	int n =sc.nextInt();
	int k = sc.nextInt();
	int x = sc.nextInt();int j=0;
	int people[] = new int[n];
	int noofpeopleleft=n;
	for(int i=0;i<n;i++)
	
		people[i]= i+1;
	
	int temp=x;
	motu: while(noofpeopleleft>1) {
		if(noofpeopleleft<=temp%k) break motu;
		if(temp%k==0) {
			for(int i=temp;i<=n;i++) {
				if(i==n)i=0;
				if(people[i]!=0) {
					temp=i+1;
					continue motu;}}
		}
			
		int mod = temp%k;
		noofpeopleleft=noofpeopleleft-mod;
				for(j=temp;mod>0;j++) {
					if(j==n) j=0;
					if(people[j]==0) continue;
					
			people[j]=0;
			mod--;
			
		}
				
			
		
				
					while(true) {
						if(j==n)j=0;
						if(people[j]!=0)
							break;
						j++;
					}
					temp=j+1;
					
				
				
				
	}
 
 
System.out.print(temp);
}
}
