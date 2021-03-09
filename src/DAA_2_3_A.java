import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class DAA_2_3_A {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int t=sc.nextInt();
	String s="";
	while(t-->0) {
	int a=sc.nextInt(),b=sc.nextInt();
	ArrayList<Integer> ar=new ArrayList<Integer>();
	for(int i=b;i<=a;i+=b)
		ar.add(i);
	int c=b;
	while(b<=ar.size()) {
		ar.clear();
		c*=b;
		for(int i=c;i<=a;i+=c)
			ar.add(i);
	  }
	s+=String.valueOf(ar.get(0))+"\n";
	}
	System.out.println(s);
	sc.close();
}
}
