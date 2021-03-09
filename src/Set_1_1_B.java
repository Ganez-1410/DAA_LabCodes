import java.util.Scanner;

public class Set_1_1_B {
	static int top=-1;
	static char[] stack = new char[100];
	static void push(char ch) {
		stack[++top]=ch;
	}
	static void pop() {
		top--;
	}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	String s=sc.next();
	char[] c=s.toCharArray();
	for(int i=0;i<s.length();i++) {
		if(top == -1)
			push(c[i]);
		else {
			if(stack[top] == c[i])
				pop();
			else
				push(c[i]);
		}
	}
	System.out.println(top+1);
	for(int i=0;i<=top;i++)
		System.out.print(stack[i]);
}
}
