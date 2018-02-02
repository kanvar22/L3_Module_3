import java.util.ArrayList;

public class Farm {

	public static void main(String[] args) {
		ArrayList <Animal> farmAnimlas = new ArrayList<Animal>();
		farmAnimlas.add(new Goat());
		farmAnimlas.add(new Cow());
		farmAnimlas.add(new Chicken());
		farmAnimlas.add(new Pig());
		farmAnimlas.add(new Aidan());
		for (int i = 0; i < farmAnimlas.size(); i++) {
			farmAnimlas.get(i).makeNoise();
		}
	}
}
