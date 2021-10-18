import java.time.Year;

public class SportsPlayer implements PrintValues{
	private int yearofBirth;
	private String Category;
	private String Country;
	private int year = Year.now().getValue();

	public SportsPlayer(int yearofBirth, String Category, String Country)
	{
		this.yearofBirth = yearofBirth;
		this.Category = Category;
		this.Country = Country;
	}

	public int getYearofBirth() {
		return yearofBirth;
	}

	public String getCategory() {
		return Category;
	}

	public String getCountry() {
		return Country;
	}

	public void setYearofBirth(int yearofBirth) {
		this.yearofBirth = yearofBirth;
	}

	public void setCategory(String category) {
		Category = category;
	}

	public void setCountry(String country) {
		Country = country;
	}	
	
	
	@Override
	public String toString() {
		return "\nYear of birth:" + yearofBirth +
				"\nCategory: " + Category + 
				"\nCountry: " + Country ;
	}

	@Override
	public void showNationality() {
		System.out.println("Nationality: " + Country);
	}

	@Override
	public void showAge() {
		System.out.println("Age: " + (year - yearofBirth));
		
	}
	


	
	
}


