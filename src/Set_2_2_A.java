import java.util.Scanner;

public class Set_2_2_A {
	static int largeIntegerMult(int a,int b) {
		if(a==0 || b==0)
			return 0;
		int n=numOfDigits(a,b);
		if(n==1)
			return a*b;
		else {
			int r=n/2;
			int p=exponential(10,r);
			int a1=a/p,a0=a%p,b1=b/p,b0=b%p;
			int c2=largeIntegerMult(a1,b1);
			int c0=largeIntegerMult(a0,b0);
			int c1=largeIntegerMult(a0+a1,b0+b1)-(c2+c0);
			int c=c2*exponential(10,2*r)+c1*exponential(10,r)+c0;
			return c;
		}
	}
	static int numOfDigits(int a,int b) {
		int max=a>b?a:b,c=0;
		while(max!=0) {
			c++;
			max/=10;
		}
		return c;
	}
	static int exponential(int m,int n) {
		int mul=1;
		for(int i=0;i<n;i++)
			mul*=m;
		return mul;
	}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt(),b=sc.nextInt();
	System.out.println(largeIntegerMult(a,b));
	sc.close();
}
}
