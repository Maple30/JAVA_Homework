import java.util.Scanner;

public class Q10 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);	
		int [] Qua = new int[3];		//declar a var to save Quality
		double [] pri = new double[3];	//declar a var to save price
		String [] name_of = new String[3];//declar a var to save name
		double Total = 0;					//declar a var to save Total
		
		for(int i = 0; i < 3; i++) {
			System.out.println("please enter name " + (i+1) + ":");
			if(i != 0) {
				String junk = input.nextLine();	//get rid of \"\n"
			}							
			name_of[i] = input.nextLine();							//enter name
			System.out.println("please enter Quality " + (i+1) + ":");
			Qua[i] = input.nextInt();								//enter Quality
			System.out.println("please enter price " + (i+1) + ":");
			pri[i] = input.nextDouble();							//enter price
				
		}
		System.out.println("Your bill \n\nTtem\t\t\tQuantity\tPrice\tTotal\t\n");
		for(int i = 0; i < 3; i++) {
			System.out.printf("%s\t\t%d\t\t%.2f\t%.2f%n", name_of[i], Qua[i], pri[i], (double)Qua[i]*pri[i]);
			Total += (double)Qua[i]*pri[i];
		}
		System.out.printf("Subtotal\t\t\t\t\t%.2f%n", Total);
		System.out.printf("6.25%% sales tax\t\t\t\t\t%.2f%n", Total*0.0625);
		System.out.printf("Total\t\t\t\t\t\t%.2f%n", Total + Total*0.0625);
	}
}
