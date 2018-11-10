import java.util.Scanner;

public class Q_11 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);	
		int [] Score = new int[3];		//declar a var to save Score
		int [] points = new int[3];	//declar a var to save points
		String [] name_of = new String[3];//declar a var to save name of exercise
		int Total_s = 0;					//declar a var to save Total
		int Total_t = 0;
		
		for(int i = 0; i < 3; i++) {
			System.out.println("please enter name of exercise " + (i+1) + ":");
			if(i != 0) {
				String junk = input.nextLine();	//get rid of \"\n"
			}												
			name_of[i] = input.nextLine();							//enter name of exercise
			System.out.println("please enter Score received for exercise " + (i+1) + ":");
			Score[i] = input.nextInt();								//enter Score received for exercise
			System.out.println("please enter Total points possible for exercise " + (i+1) + ":");
			points[i] = input.nextInt();							//enter Total points possible for exercise
			
			Total_s += Score[i];
			Total_t += points[i];
		}
		
		System.out.println("Exrecise\t\tScore\t\tTotalPossible\n");
		
		for(int i = 0; i < 3; i++) {
			System.out.printf("%s\t\t%d\t\t%d\n", name_of[i], Score[i], points[i]);
		}
		System.out.printf("Total\t\t\t%d\t\t%d\n", Total_s, Total_t);
		System.out.printf("Your total is " + Total_s + "out of " + Total_t + ", %.2f%%.", (double)(Total_s / Total_t * 100));

	}
}
