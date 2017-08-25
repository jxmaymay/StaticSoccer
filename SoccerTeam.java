
public class SoccerTeam {
	
	private static int gamesPlayed = 0;
	private static int totalGoals = 0;
	
	private int wins = 0;
	private int losses = 0;
	private int ties = 0;
	private int tPoints = 0;
	
	public SoccerTeam() {
	}
	
	public void play(SoccerTeam opponent, int myScore,
			int opponentScore) {
		
		totalGoals = totalGoals + myScore + opponentScore;
		gamesPlayed++;
		//System.out.println("Game #" + gamesPlayed + ": ");
		if (myScore > opponentScore) {
			wins++;
			tPoints = tPoints + 3;
		} else if (myScore < opponentScore) {
			losses++;
			opponent.wins++;
			opponent.tPoints = opponent.tPoints + 3;
		} else {
			ties++;
			opponent.ties++;
			tPoints++;
			opponent.tPoints++;
		}
		
    }
	
	public static int getGamesPlayed() {
		return gamesPlayed;
	}
	
	public static int getTotalGoals() {
		return totalGoals;
	}
	
	public int getTP() {
		return tPoints;
	}
 }
