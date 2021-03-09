import java.util.*;
public class DAA_2_5_B_1{
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int []a=new int[n];
	for(int i=0;i<n;i++) 
	    a[i]=sc.nextInt();
	int maxFromEnd[] = new int[n + 1];
	Arrays.fill(maxFromEnd, Integer.MIN_VALUE);
	for (int i = n- 1; i >= 0; i--)
		maxFromEnd[i] = Math.max(maxFromEnd[i + 1],a[i]);
	int result = 0;
	for (int i = 0; i < n; i++)
	{
		int low = i + 1, high =n- 1,
		ans = i;
		while (low <= high)
		{
			int mid = (low + high) / 2;
			if (a[i] <= maxFromEnd[mid])
			{
				ans = Math.max(ans, mid);
				low = mid + 1;
			}
			else
			high = mid - 1;
	    }
	result = Math.max(result, ans - i);
	}
	System.out.print(result + "\n");
	}
}