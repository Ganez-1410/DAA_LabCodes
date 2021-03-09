import java.util.Scanner;

public class Set_1_3_B {
	static void subsetSum(int[] a,int low,int high,int sum) 
	{ 
		if (low>high) 
		{ 
		System.out.print(sum+" "); 
		return; 
		}  
		subsetSum(a,low+1,high,sum);
		subsetSum(a,low+1,high,sum+a[low]); 
} 
public static void main (String[] args) 
{ 
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int []a = new int[n];
	for(int i=0;i<n;i++)
		a[i]=sc.nextInt();
	subsetSum(a,0,n-1,0); 
} 
}
