
class TennisPlayer extends SportsPlayer
{
	private double height;
	private String born;
	private String coach;
	private int bestAtpRanking;
	private int prizeMoney;
	private String plays;
	private static int playerCount = 0;
	

	public TennisPlayer(int yearofBirth, String Category, String Country, double height, String born, String coach,
			int bestAtpRanking, int prizeMoney, String plays) {
		super(yearofBirth, Category, Country);
		this.height = height;
		this.born = born;
		this.coach = coach;
		this.bestAtpRanking = bestAtpRanking;
		this.prizeMoney = prizeMoney;
		this.plays = plays;
		playerCount++;
	}

	

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public String getBorn() {
		return born;
	}

	public void setBorn(String born) {
		this.born = born;
	}

	public String getCoach() {
		return coach;
	}

	public void setCoach(String coach) {
		this.coach = coach;
	}

	public int getBestAtpRanking() {
		return bestAtpRanking;
	}

	public void setBestAtpRanking(int bestAtpRanking) {
		this.bestAtpRanking = bestAtpRanking;
	}

	public int getPrizeMoney() {
		return prizeMoney;
	}

	public void setPrizeMoney(int prizeMoney) {
		this.prizeMoney = prizeMoney;
	}

	public String getPlays() {
		return plays;
	}

	public void setPlays(String plays) {
		this.plays = plays;
	}



	@Override
	public String toString() {
		return super.toString() + 
				"\nHeight: " + height*3.28 + " feet" + 
				"\nBorn:" + born +
				"\nCoach:" + coach + 
				"\nBest Atp Ranking:" + bestAtpRanking + 
				"\nPrize Money= $" + prizeMoney + 
				"\nPlays=" + plays +
				"\n";
	}

	public void playerCount() {
		System.out.println("\nPlayers Created: " +  playerCount);
	}
	
}


	

