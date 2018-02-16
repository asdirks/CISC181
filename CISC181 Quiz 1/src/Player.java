
import java.util.Scanner;

public class Player {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter Player Name: ");
		String name = input.next();
		
		System.out.print("Enter Number of at Bats: ");
		int AB = input.nextInt();
		
		System.out.print("Enter Number of Hits: ");
		int H = input.nextInt();
		
		System.out.print("Enter Number of Doubles: ");
		int D = input.nextInt();
		
		System.out.print("Enter Number of Triples: ");
		int T = input.nextInt();
		
		System.out.print("Enter Number of Home Runs: ");
		int HR = input.nextInt();
		
		System.out.print("Enter Number of Runs: ");
		int R = input.nextInt();
		
		System.out.print("Enter number of Walks: ");
		int BB = input.nextInt();
		
		input.close();	
		
		System.out.println(name + "'s Stats: ");	
		
		BattingAverage(H,AB);
		OnBasePercentage(H,BB,AB);
		SluggingPercentage(H,D,T,HR,AB);
		OnBaseandSlugging(H,BB,AB,D,T,HR);
		TotalBases(H,D,T,HR);
		
	}
	
	public static void BattingAverage(float H, int AB) {
		float BA = H / AB;
		System.out.println("Batting Average: "+ BA);
		
	}
	
	public static void OnBasePercentage(float H, int BB,int AB) {
		float OBP = (H + BB) / (AB + BB);
		System.out.println("On Base Percentage: " + OBP);
		
	}
	
	public static void SluggingPercentage(float H, int D, int T, int HR, int AB) {
		float SLG = ((H-D-T-HR) + 2*D + 3*T + 4*HR) / AB;
		System.out.println("Slugging Percentage: " + SLG);
	}
	
	public static void OnBaseandSlugging(float H, int BB, int AB, int D, int T, int HR) {
		float OBS = (H + BB) / (AB + BB) + ((H-D-T-HR) + 2*D + 3*T + 4*HR) / AB;
		System.out.println("On Base & Slugging: " + OBS);
	}
	
	public static void TotalBases(int H, int D, int T, int HR) {
		int TB = (H-D-T-HR) + 2*D + 3*T + 4*HR;
		System.out.println("Total Bases: " + TB);
	}

}

	