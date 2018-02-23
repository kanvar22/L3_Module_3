package interfaces;

public class BackwardsString extends SpecialString{

	public BackwardsString(String s) {
		super(s);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String funkifyText(String s) {
		// TODO Auto-generated method stub'
		String flippedString = "";
		for (int i = 0; i < s.length(); i++) {
			flippedString = s.charAt(i) + flippedString;
			
		}
		
		return flippedString;
	}

}
