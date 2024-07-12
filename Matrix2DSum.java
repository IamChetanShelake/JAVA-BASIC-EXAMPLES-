import java.util.Scanner;
public class Matrix2DSum{
	public static void main(String aa[]){
		Scanner sc = new Scanner(System.in);
		
			System.out.println(" Enter matrix of 3*3:");	
		int a[][] = new int[3][3];
		for(int i =0; i<3; i++){
			for(int j= 0; j<3; j++){
				a[i][j]=sc.nextInt();		
			}
		}

	System.out.println("row sum is : ");
	
	for(int i=0;i<3; i++){
	int sum1=0;
			for(int j=0; j<3; j++){
				System.out.print(a[i][j]+" ");
				sum1=sum1+a[i][j];
			}
		System.out.print(" = "+sum1);
		System.out.println(" ");
		}
		
	System.out.println("column sum is:");
		for(int j=0;j<3; j++){
			int sum2=0;
			for(int i=0; i<3; i++){
				System.out.print(a[i][j]+" ");
				sum2=sum2+a[i][j];
			}
		System.out.print(" = "+sum2);
		System.out.println(" ");
		}

	
	

	}
}