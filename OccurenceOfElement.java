import java.util.*;
class OccurenceOfElement{
	public static void main(String aa[]){
		Scanner sc = new Scanner(System.in);
		int count =0;
		int a[] = new int[6];
		System.out.println("enter desired elements:");
		int element =sc.nextInt();
		System.out.println("enter elements of array:");
		for(int i =0; i<a.length; i++){
			a[i]=sc.nextInt();	
		}
		
		for(int i =0 ; i<a.length; i++){
			if(element==a[i]){
				count++;
			}
		}
		if(count ==0){
			System.out.println("element is not present in array");
		}else{
			System.out.println("element present in array of occurance is :"+count);
		}
		
		
	}

}