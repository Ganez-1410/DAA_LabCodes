import java.util.Scanner;

public class DAA_2_3_B {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt(),in;
	int a[]=new int[n];
	for(int i=0;i<n;i++)
		a[i]=sc.nextInt();
	for(int i=0;i<n-1;i++) {
		in=i;
		for(int j=i+1;j<n;j++) {
			if(a[j]>a[in])
				in=j;
		}
		int temp=a[i];
		a[i]=a[in];
		a[in]=temp;
	}
	int sum=0;
	for(int i=0;i<n;i++) {
		sum+=(a[i]*pow(i));
	}
	System.out.println(sum);
}
static int pow(int i) {
	if(i==0)
		return 1;
	int mul=1;
	for(int k=0;k<i;k++)
		mul*=2;
	return mul;
}
}
