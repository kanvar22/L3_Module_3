package abstract_classes.cities;

public class SanDiego extends City{

	public SanDiego(int population, double growthRate) {
		super(population, growthRate);
		// TODO Auto-generated constructor stub
	}
	public double getAnnualTaxes () {
		return growthRate * population - 1000000;
	
	}


}
