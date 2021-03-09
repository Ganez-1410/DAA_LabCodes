import java.util.Scanner;

public class DAA_2_4_A {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int t=sc.nextInt(),i=0;
	int a[]=new int[t];
	int b[]=new int[t];
	while(t-->0) {
		a[i]=sc.nextInt();
		b[i]=sc.nextInt();
		i++;
		
	}
	int m=0,m1=0;
	for(i=0;i<a.length;i++) {
		if(m1>=a[i]) {
			m1=m1-a[i]+b[i];
		}
		else
		{
			m1++;
			m++;
			i--;
		}
	}
	System.out.println(m);
}
}
