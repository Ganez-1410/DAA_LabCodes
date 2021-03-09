import java.util.Scanner;

public class Set_2_2_B {
	static void search(int a[],int low,int high) {
		if(low==high) {
			System.out.println(a[low]);
			return;
		}
		int mid=(low+high)/2;
		if(mid%2==0) {
			if(a[mid]==a[mid+1])
				search(a,mid+2,high);
			else
				search(a,low,mid);
		}
		else {
			if(a[mid]==a[mid-1])
				search(a,mid+1,high);
			else
				search(a,low,mid-1);
		}
	}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int a[]=new int[n];
	for(int i=0;i<n;i++)
		a[i]=sc.nextInt();
	search(a,0,n-1);
	sc.close();
}
}
