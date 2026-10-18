package DAY6;
import java.util.*;
public class Player {
	private String Name;
	private int jerseyNum;
	private int MatchesPlayed;
	private int RunsScored;
	
	public void RegPlayer() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name of player: ");
		Name = sc.next();
		System.out.println("Enter the jerseynum of player: ");
		jerseyNum = sc.nextInt();
		System.out.println("Enter the total matches played by player: ");
		MatchesPlayed = sc.nextInt();
		System.out.println("Enter the Runs Scored by player: ");
		RunsScored = sc.nextInt();
		sc.close();
	}
	
	public double AverageRuns() {
		double Avg = RunsScored/MatchesPlayed;
		return Avg;
	}
	
	public void DispPlayer() {
		double result = AverageRuns();
		System.out.println("The name of player is: "+Name);
		System.out.println("The Jersey of player is: "+jerseyNum);
		System.out.println("The Matches played by player: "+MatchesPlayed);
		System.out.println("The Runs Scoreed by player is: "+RunsScored);
		System.out.println("The Avg.Runs Scoreed by player is: "+result);
		
	}
	
	public static void main(String[] args) {
		Player p1 = new Player();
		p1.RegPlayer();
		p1.DispPlayer();
	}
	
}
