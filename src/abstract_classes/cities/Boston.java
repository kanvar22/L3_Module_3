package abstract_classes.cities;

public class Boston extends City{

	public Boston(int population, double growthRate) {
		super(population, growthRate);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getAnnualTaxes() {
		
		return growthRate * population + (.5 * population);		
	}

}
