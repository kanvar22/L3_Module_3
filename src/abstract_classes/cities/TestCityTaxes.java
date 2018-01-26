package abstract_classes.cities;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Test;

public class TestCityTaxes {

	@Test
	public void testPrjections() {
		ArrayList<City> cities = new ArrayList<City>();
		City san = new SanDiego(1407000, 1.6);
		City bos = new Boston(673184, 1.2);
		City lax = new LosAngeles(3976000, 1.4);
		City atl = new Atlanta(472522, 1);
		
		cities.add(san);
		cities.add(bos);
		cities.add(lax);
		cities.add(atl);
		
		
		assertEquals(3251200.00, cities.get(0).getAnnualTaxes(), 0.01);
		assertEquals(1144412.80, cities.get(1).getAnnualTaxes(), 0.01);
		assertEquals(3896480.00, cities.get(2).getAnnualTaxes(), 0.01);
		assertEquals(945044.00, cities.get(3).getAnnualTaxes(), 0.01);
	}

}