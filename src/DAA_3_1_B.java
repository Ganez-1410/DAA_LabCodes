import java.util.Scanner;

public class DAA_3_1_B {
  static int cutRod(int price[], int n)
	{
	if (n <= 0)
		return 0;
	int max_val=Integer.MIN_VALUE;
	for (int i=0;i<n;i++)
		max_val=Math.max(max_val,price[i]+cutRod(price,n-i-1));
	return max_val;
  }
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0) {
			int n=sc.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		System.out.println("Maximum Obtainable Value is "+cutRod(arr,n));
	}
	}
}
