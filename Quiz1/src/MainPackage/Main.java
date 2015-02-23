package MainPackage;
import java.util.Scanner;

public class Main {

	double TD;
	double YDS;
	double INT;
	double comp;
	double ATT;
	
	public static void main(String[] args) {
		
		Main a = new Main();
		a.getStats();
		a.computePasserRating();

	}
	
	public void getStats() {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter touch downs: ");
		TD = input.nextDouble();
		
		System.out.print("Enter yards: ");
		YDS = input.nextDouble();
		
		System.out.print("Enter interceptions: ");
		INT = input.nextDouble();
		
		System.out.print("Enter completions: ");
		comp = input.nextDouble();
		
		System.out.print("Enter passes attempted: ");
		ATT = input.nextDouble();
		
		input.close();
	}
	
	public void computePasserRating() {
		double rating = (8.4*YDS + 330*TD + 100*comp - 200*INT) / ATT;
		System.out.printf("This player's passing rating is %.2f", rating);
	}
}
