
public class Control {
	
	public static void main(String[] args)
	{
		TennisPlayer p1 = new TennisPlayer(1996, "Male", "Russia", 1.98, "Moscow", "Gilles Cervara", 0, 197937050, "right-handed,");
		TennisPlayer p2 = new TennisPlayer(2002, "Female", "Canada", 1.75, "Toronto", "Andrew Richardson", 23, 2803376, "right-handed");

		System.out.println(p1);
		
		System.out.println(p2);
		
		
		p1.showAge();
		
		p1.showNationality();
		
		p2.playerCount();
	}
}

