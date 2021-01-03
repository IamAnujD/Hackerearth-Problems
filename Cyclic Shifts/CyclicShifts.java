import java.util.Scanner;
class CyclicShift{
 
 
public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	short a = (short) 55587;
	
	int testcases = sc.nextInt();StringBuilder mi = new StringBuilder();
	while(testcases-->0) {int N = sc.nextInt();
	
	 
	int m = sc.nextInt(); int sap = 0;
	
	String s = sc.next();
	if(s.equals("L"))  sap =Short.toUnsignedInt((short)((N << m) + (N >> (16-m)))); 
	else
		sap =Short.toUnsignedInt((short)((N >> m) + (N << (16-m)))); 
	mi.append(sap+ "\n");
	
	
		
	}
	System.out.print(mi);
 
}
}
