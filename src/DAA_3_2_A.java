import java.util.Scanner;

public class DAA_3_2_A {
	static int MatrixChainOrder(int p[], int i, int j) 
	{ 
		int min = Integer.MAX_VALUE; 
		int count; 
		if (i == j) 
			return 0; 
		for (int k = i; k < j; k++) 
		{ 
			count = MatrixChainOrder(p, i, k) + MatrixChainOrder(p, k + 1, j) + p[i - 1] * p[k] * p[j]; 
			if (count < min) 
				min = count; 
		} 
		return min; 
	} 
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		String s="";
		while(t-->0) {
		int n=sc.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		s+=MatrixChainOrder(arr, 1, n - 1)+"\n";
	}
		System.out.println(s);
	}
}
