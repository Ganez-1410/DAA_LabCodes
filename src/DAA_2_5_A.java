import java.util.Arrays;
import java.util.Scanner;

public class DAA_2_5_A {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int t=sc.nextInt();
	String s="";
	while(t-->0) {
		int n=sc.nextInt();
		int arr[]=new int[n];
		int dep[]=new int[n];
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		for(int i=0;i<n;i++)
			dep[i]=sc.nextInt();
		s+=mini(arr,dep,n)+"\n";
	}	
	System.out.println(s);
	}
static int mini(int arr[],int dep[],int n) {
	int max=1,cur=1;
	Arrays.sort(arr);
	Arrays.sort(dep);
	int i=1,j=0;
	while(i<n && j<n) {
		if(arr[i]<dep[j]) {
			cur++;
			if(cur>max) 
				max=cur;
			i++;
		}
		else {
			cur--;
			j++;
		}
	}
	return max;
}
}
