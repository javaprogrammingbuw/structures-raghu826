import java.util.Scanner;


public class SumMeanMinMax {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		
		System.out.println( "a:" + a + "b:"+ b + "c:" + c );
		
		/*
		 * Todo: Print the sum, mean, max Value and min Value of a, b and c.
		 * */
		
		int sum = a + b + c	;
		System.out.println("sum:" + sum);
		
		double mean = sum/3;
		System.out.println("mean:" + mean);
		
		if(a>b && a>c) {
			
			System.out.println("a is max");
		}else if (b>a && b>c) {
			System.out.println("b is max");
			
		}else {
			System.out.println("c is max");
			
		}
		
        if(a<b && a<c) {
			
			System.out.println("a is min");
		}else if (b<a && b<c) {
			System.out.println("b is min");
			
		}else {
			System.out.println("c is min");
			
		}
		
		scan.close();
		
		/*
		 * Todo: Print the sum, mean, max Value and min Value of a, b and c.
		 * */
		

	}

}
