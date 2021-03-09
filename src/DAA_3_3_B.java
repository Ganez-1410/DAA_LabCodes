import java.util.Scanner;

public class DAA_3_3_B {
	
	public static int N;
	static void printSolution(int board[][])
	{
	    for (int i = 0; i < N; i++)
	    {
	        for (int j = 0; j < N; j++){
	             if(board[i][j] == 1)
	            System.out.print((j+1)+" ");
	        }
	    }
	    System.out.println();

	}

	static int isSafe(int board[][], int row, int col)
	{
	    int i, j;
	    for (i = 0; i < col; i++)
	        if (board[row][i]==1)
	            return 0;
	    for (i=row, j=col; i>=0 && j>=0; i--, j--)
	        if (board[i][j]==1)
	            return 0;
	 
	  
	    for (i=row, j=col; j>=0 && i<N; i++, j--)
	        if (board[i][j]==1)
	            return 0;
	 
	    return 1;
	}
	static int solveNQUtil(int board[][], int col)
	{
	    if (col == N)
	    {
	        printSolution(board);
	        return 1;
	    }
	    int res = 0;
	    for (int i = 0; i < N; i++)
	    {
	 
	        if ( isSafe(board, i, col)==1 )
	        {
	            board[i][col] = 1;
	            res = (solveNQUtil(board, col + 1)==1?true:false || res==1?true:false)?1:0;
	            board[i][col] = 0;
	        }
	    }
	 

	    return res;
	}
	static void solveNQ()
	{
	    int board[][]=new int[N][N];
	 
	    if (solveNQUtil(board, 0) == 0)
	    {
	        System.out.println("Solution does not exist");
	        return ;
	    }
	    return ;
	}
	 

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0) {
			N=sc.nextInt();
			solveNQ();	
		}
	    
	}
}
