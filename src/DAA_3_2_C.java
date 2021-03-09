import java.util.Scanner;
public class DAA_3_2_C
{
	public static void main(String[] args) { 
		Scanner sc=new Scanner(System.in); 
		int t=sc.nextInt();
		String s="";
		while(t--!=0){
			int m=sc.nextInt();
			int n=sc.nextInt();
			String s1=sc.next(); 
			String s2=sc.next();
			int count=0;
			for(int i=0;i<m;i++){
				for(int j=0;j<n;j++) 
					if(s1.charAt(i)==s2.charAt(j)) 
						count++;
				}
			s+=""+count+"\n";
			}
		System.out.println(s);
	}
}
