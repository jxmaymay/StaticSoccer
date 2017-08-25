
public class TournamentTester {
	public static void main(String[] args) {
		SoccerTeam team1 = new SoccerTeam();
		SoccerTeam team2 = new SoccerTeam();
		SoccerTeam team3 = new SoccerTeam();
		SoccerTeam team4 = new SoccerTeam();
		
		team1.play(team2, 2, 2);
		team3.play(team4, 3, 1);
		team1.play(team4, 2, 5);
		team2.play(team3, 1, 0);
		team1.play(team3, 4, 4);
		team2.play(team4, 2, 4);
		
		System.out.println("Games played: " + SoccerTeam.getGamesPlayed());
		System.out.println("Total points scored: " + SoccerTeam.getTotalGoals());
	    System.out.println("Team 1 TPoints: " + team1.getTP() + ", Team 2 TPoints: " + team2.getTP());
	    System.out.println("Team 3 TPoints: " + team3.getTP() + ", Team 4 TPoints: " + team4.getTP());
	}
}
