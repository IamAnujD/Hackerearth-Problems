import java.util.*;
class test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int testcases = sc.nextInt();
        StringBuilder mi = new StringBuilder();
        while(testcases-->0){long result=1;
        
            long n = sc.nextLong();
            if(n==2) result=3;
           if(n>=3)
          result = (n*(n-1))+1;
            mi.append(result+"\n");
        }
        System.out.print(mi);
    }
}
