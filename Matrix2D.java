import java.util.Scanner;
public class Matrix2D{
	public static void main(String aa[]){
		Scanner sc = new Scanner(System.in);

		int a[][] = new int[2][2];
		for(int i =0; i<2; i++){
			for(int j= 0; j<2; j++){
				a[i][j]=sc.nextInt();		
			}
		}


		System.out.println("matrix is:");
		for(int i=0;i<2; i++){
			for(int j=0; j<2; j++){
				System.out.print(a[i][j]+" ");
			}
		System.out.println("");

		}
	}
}