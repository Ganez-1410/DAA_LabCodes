import java.util.Scanner;

public class DAA_3_2_B {
	static int max(int x, int y){
		return (x<y)?y:x;
	}
	static int lps(char a[],int i,int j){
	if(i==j)
	  return 1;
	if(a[i]==a[j]&&i+1==j)
	  return 2;
	if(a[i]==a[j])
	   return lps(a,i+1,j-1)+2;
	return max(lps(a,i,j-1),lps(a,i+1,j));
	}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int t=sc.nextInt();
	String st="";
	while(t-->0) {
	String s=sc.next();
	char[] arr=s.toCharArray();
	st+=lps(arr,0,arr.length-1)+"\n";
	}
	System.out.println(st);
  }
}
