import java.util.*;
class jayeshArray{
	public static void main(String aa[]){
int sum =0;
		Scanner sc = new Scanner(System.in);
		int[] a= new int[5];
		
		
		for(int i=0; i<5; i++){
			a[i]=sc.nextInt();
			
			
		}
		System.out.println("===================\nArray is :");
		for(int i=0; i<5; i++){
			 sum = sum+a[i];	
			System.out.println(a[i]);
		}

		System.out.println("sum is:"+sum);
		System.out.println("average of values is: "+sum/5);
	}
}