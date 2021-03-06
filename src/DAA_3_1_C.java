import java.util.Scanner;

public class DAA_3_1_C {
	static int max(int a, int b){
			return (a > b)?a:b;
		}
	static int knapSack(int W, int wt[], int val[], int n){
		if (n == 0 || W == 0)
			return 0; 
		if (wt[n-1]>W)
			return knapSack(W,wt,val,n-1);
		else
			return max(val[n-1]+knapSack(W-wt[n-1],wt,val,n-1),knapSack(W,wt,val,n-1));
		}
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		String s="";
		while(t-->0) {
			int n=sc.nextInt();
			int w=sc.nextInt();
			int[] val=new int[n];
			int[] wt=new int[n];
			for(int i=0;i<n;i++)
				val[i]=sc.nextInt();
			for(int i=0;i<n;i++)
				wt[i]=sc.nextInt();
			 s+=knapSack(w, wt, val, n)+"\n";
		}
		System.out.println(s);
		}
		

}
