import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		
	int row, col, i, j,t,c=0;
    int a[][] = new int[10][10];
    Scanner scan = new Scanner(System.in);
    System.out.println("No of Enter TC");
	t =  scan.nextInt();
	for(int z=0;z<t;z++) {
	System.out.println("Enter Rows");
    row = scan.nextInt();
    System.out.println("Enter Columns");
    col = scan.nextInt();
	   
    for(i=0; i<row; i++)
    {
        for(j=0; j<col; j++)
        {
            a[i][j] = scan.nextInt();
        }
    }
    for(i=0; i<row; i++)
    {
        for(j=0; j<col; j++)
        {
        System.out.print(a[i][j]);
        }
    System.out.println();
    }
    
    
	}
	
	
	
	
	}
}
