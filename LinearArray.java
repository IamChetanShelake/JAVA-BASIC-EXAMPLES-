import java.util.Scanner;
class LinearArray{
	public static void main(String aa[]){
		Scanner sc = new Scanner(System.in);
		int count =0;

		System.out.println("enter the value you want to find:");
		int element=sc.nextInt();

		int[] a= new int[5];
		
		System.out.println("enter elements:");

		for(int i=0; i<a.length; i++){
			a[i]=sc.nextInt();	
		}
		
		for(int i =1; i<a.length ;i++){
			if(a[i]==element){
				System.out.println("element is present at "+(i+1)+" position");
				count = 1;
				break;
			}
			
		}
			if(count == 0){
				System.out.println("element is not present in array");
				
				}
	}
}