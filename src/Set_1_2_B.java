import java.util.Arrays;
import java.util.Scanner;

public class Set_1_2_B {
	static void sort(char[] arr) {
		for (int i = 0; i < arr.length-1; i++)
        {
            int min_idx = i;
            for (int j = i+1; j < arr.length; j++)
                if (arr[j] < arr[min_idx])
                    min_idx = j;
            char temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
	}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int t=sc.nextInt();
	String st="";
	while(t-->0) {
	String s=sc.next();
	char[] c=s.toCharArray();
	sort(c);
	int i;
	for(i=0;i<c.length-1;i++) {
		if((int)c[i]+1!=(int)c[i+1])
			break;
	}
	st+=i!=c.length-1?"NO\n":"YES\n";
	}
	System.out.println(st);
}
}
