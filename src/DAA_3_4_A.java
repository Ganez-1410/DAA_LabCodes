import java.util.Scanner;

public class DAA_3_4_A{
	static int getRandom(int x, int y)
	{
		return (x + (int)(Math.random() % (y-x+1)));
	} 
	static int randomizedBinarySearch(int arr[],int low, int high, int key){
	if (high >= low)
	{
	int mid = getRandom(low, high);
	if (arr[mid] == key)
		return mid;
	if (arr[mid] > key)
		return randomizedBinarySearch(arr, low, mid-1, key);
	return randomizedBinarySearch(arr, mid+1, high, key);
	}
	return -1;
	}
public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int[] a=new int[n];
	for(int i=0;i<n;i++)
		a[i]=sc.nextInt();
	int key=sc.nextInt();
	int result = randomizedBinarySearch(a, 0, n-1, key);
	System.out.println((result == -1)?"Element is not present in array":"Element is present at index " + result);
	}
}
