import java.util.Scanner;

public class Set_1_3_A {
public static void main(String[] args) {
	int n=new Scanner(System.in).nextInt();
	String s="";
	while(n!=0) {
		s+=String.valueOf(n%2);
		n/=2;
	}
	for(int i=s.length()-1;i>=0;i--)
	System.out.print(s.charAt(i));
}
}
