import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class DAA_3_1_A {
	public static ArrayList<Integer> maxset(int[] a) {
	int maxSum = 0,newSum = 0;
	ArrayList<Integer> newlist=new ArrayList<Integer>();
	ArrayList<Integer> maxlist=new ArrayList<Integer>();
	for (int i=0;i<a.length;i++) {
		if (a[i] >= 0) {
			newSum +=a[i];
			newlist.add(a[i]);
		}
		else { 
			newSum = 0;
			newlist=new ArrayList<Integer>();
	    }
		if ((maxSum < newSum || maxSum == newSum) && maxlist.size()<newlist.size()) {
			maxSum = newSum;
		    maxlist=newlist;
		}
	    else if(newlist.size() == maxlist.size() && maxlist.size() != 0) {
			if(a[newlist.get(0)] < a[maxlist.get(0)]) {
				maxSum = newSum;
			    maxlist=newlist;
			}
	     }
	  }
	return maxlist;
	}
public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		String s="";
		while(t-->0) {
			int n=sc.nextInt();
			int[] a=new int[n];
			for(int i=0;i<n;i++)
				a[i]=sc.nextInt();
		    s+=maxset(a).stream().map(Object::toString).collect(Collectors.joining(" "))+"\n";
		}
		System.out.println(s);
	}
}
