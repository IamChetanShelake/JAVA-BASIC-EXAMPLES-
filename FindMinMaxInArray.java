import java.util.Scanner;
class FindMinMaxInArray {
    public static void main(String[] args) {
        int[] a = new int[6];
        Scanner sc = new Scanner(System.in);
	System.out.println("Enter array of elemented:");

	for(int i=0; i<a.length; i++){
		a[i]=sc.nextInt();
	}

        int min = a[0];
        int max = a[0];
        
        for (int i = 1; i < a.length; i++) {
           

		max = (a[i]> max) ? a[i] : max;
		min = (a[i]< min) ? a[i] : min;
           
        }
        
        System.out.println("Minimum element is " + min);
        System.out.println("Maximum element is " + max);
    }
}
