import java.util.*;
class test1{
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int testcases = sc.nextInt();
		HashSet<Character> set1 = new HashSet<>();
		set1.add('a');
		set1.add('e');
		set1.add('i');
		set1.add('o');
		set1.add('u');
	StringBuilder mi = new StringBuilder();
		while(testcases-->0) {
			int length = sc.nextInt();
			String s  = sc.next();int count=0;
			for(int i=0;i<length-1;i++) {
			  char c1 = s.charAt(i);
			  char c2 = s.charAt(i+1);
			  if((set1.contains(c1)!=true )&& (set1.contains(c2)==true)) {count++;i=i+1;}
			}
			
			mi.append(count+"\n");
		}
		System.out.print(mi);
	}
}
