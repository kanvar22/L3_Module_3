package abstract_classes.cities;

public class Atlanta extends City{

	public Atlanta(int population, double growthRate) {
		super(population, growthRate);
		// TODO Auto-generated constructor stub
	}
	public double getAnnualTaxes () {
		return growthRate * population * (growthRate*2);
	
	}
}
