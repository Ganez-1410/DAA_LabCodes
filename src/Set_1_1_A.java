import java.util.Scanner;

public class Set_1_1_A {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt(),h,min,max=Integer.MIN_VALUE;
	int[] a=new int[n];
	for(int i=0;i<n;i++)
		a[i]=sc.nextInt();
	for(int i=0;i<n;i++) {
		h=0;
		min=Integer.MAX_VALUE;
		for(int j=i;j<n;j++) {
			if(a[j]!=0) {
				if(min>a[j])
					min=a[j];
				h++;
			}
			else 
			  break;
		}
		if(max<(h*min))
			max=h*min;
	}
	System.out.println(max);
}
}
