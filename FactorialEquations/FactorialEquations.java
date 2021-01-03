import java.util.*; import java.math.BigInteger;
class FactorialEquations{
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);long result=0;
		int x = sc.nextInt();int fact=1;
		long n = sc.nextLong(); int lastx = x%10;
		if(n>=5) 
		result=1;
		else {
			for(int i=1;i<=n;i++){    
			      fact=fact*i;    
			  }    
		BigInteger b1 = BigInteger.valueOf(lastx);
		BigInteger b2 = b1.pow(fact);
		String s = b2.toString();
		String ch = s.charAt(s.length()-1)+ "";
		result = Integer.parseInt(ch);
			
 			
		}
		if(x==1) result=1;
		if(x==0) result=0;
		System.out.print(result);
		
	}
}
