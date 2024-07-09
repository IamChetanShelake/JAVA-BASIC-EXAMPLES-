import java.util.*;
class IntInput {
	public static void main(String aa[]){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
	
		while(a!=1 && a!=2 && a!=3 && a!=4 && a!=5 && a!=6 && a!=7 && a!=8){
		System.out.println("invalid input , Enter new One :");
		 a = sc.nextInt();
		}
		System.out.println("valid input");
			
		}
}