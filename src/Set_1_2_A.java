import java.util.Scanner;

public class Set_1_2_A {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int t=sc.nextInt();
	int[] b=new int[t];
	for(int k=0;k<t;k++){
	int n=sc.nextInt();
	int[] a=new int[n];
	for(int i=0;i<n;i++)
		a[i]=sc.nextInt();
//	int c=0,z=0,flag=0;
//	for(int i=0;i<n-1;) {
//		int count=1;
//		if(a[i+1]==1) {
//			int j=i+2;
//			flag=1;
//			while(j<n) {
//				if(a[j]!=1)
//					break;
//				j++;
//				count++;
//			}
//			c++;
//		}
//		else
//			z++;
//		if(count>=3) {
//			System.out.println("Never Give Up");
//			System.exit(1);
//		}
//		i+=count;
//	}
//	System.out.println(flag==1?(c+z)/2:z/2);
	int j=0;
	for(int i=0;i<n-1;) {
		if(i+3<n && a[i+3]==0)
			i+=3;
		else if(i+2<n && a[i+2]==0)
			i+=2;
		else if(i+1<n && a[i+1]==0)
			i+=1;
		else {
			j=-1;
			break;
		}
		j+=1;
	}
	b[k]=j;
	}
	for(int i=0;i<t;i++)
		System.out.println(b[i]==-1?"Never Give Up":b[i]);
}
}
