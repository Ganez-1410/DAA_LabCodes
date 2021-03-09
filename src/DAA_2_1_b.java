import java.util.Scanner;

public class DAA_2_1_b {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int a[]=new int[n];
	for(int i=0;i<n;i++) 
		a[i]=sc.nextInt();
	int k=sc.nextInt(),j;
	for(int i=0;i<n;i++) {
		if(a[i]==k) {
			System.out.println("First Occurrence = "+i);
			for(j=i;j<n;j++) {
				if(a[j]!=k)
					break;
			}
			System.out.println("Last Occurrence = "+(j-1));
			break;
		}
	}
}
}