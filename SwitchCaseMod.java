import java.util.Scanner;


public class SwitchCaseMod {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		System.out.println("a" + a + "b" + b);
		
		
		if(b>0 && b<10) {
			
	         int mod = a%b;
			 switch(mod){
			 	//incomplete
			   case 2 :
				   System.out.println("two");
				   break;
			  default:
				  System.out.println("nothing");
			} 
		 }
			
		else{
			System.out.println("user enters wrong values");
		}
		  
		
		
		
		/*
		 * Todo: First check if 0<b<10.If this condition does not hold, print a little
		 * output informing the user that he or she enteres wrong values.
		 * If this conditions holds, perform a modulo operation for a%b.
		 * Print the result as a String (e.g. "five"). You can achieve that by using a switch case
		 * */
      scan.close();
		
		
	}

}
