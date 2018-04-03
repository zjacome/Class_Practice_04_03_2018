import java.util.Scanner;
public class ScannnerSum_of_Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
				int [] x= new int[3];
				int [] y= new int[3];
				int [] sum= new int [3];
				
				for(int v=0; v<sum.length;v++ ) {
				System.out.println("Enter a number in the first array");
					x[v]=sc.nextInt();
			
				
				}
				for(int v=0; v<sum.length;v++ ) {
					
					System.out.println("Enter a number in the second array");
					
					y[v]=sc.nextInt();
				
				
				
				
			}
				for(int v=0; v<sum.length;v++ ) {
				
					sum[v]=((x[v]+y[v]));	
					System.out.println("The sum is"+" "+ sum[v]);

				}


	}

}