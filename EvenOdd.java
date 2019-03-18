import java.util.Scanner;

//loops

public class EvenOdd {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	
	
	int a = scan.nextInt();
	int i = scan.nextInt();
	
	System.out.println("a:" + a);
	
	
	for(i=0;i<=a;i++) {
		if(i%2 == 1) {
			System.out.println(i);
			
		}
		
	}
		
		//todo: The program takes a number as input.
		//It then goes through all integer values till reaching that value and prints all the odd ones.
	scan.close();
		
		//todo: The program takes a number as input.
		//It then goes through all integer values till reaching that value and prints all the odd ones.
		
	}
	
}
