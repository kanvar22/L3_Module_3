package interfaces;

public class MixedCapsString extends SpecialString{

	public MixedCapsString(String s) {
		super(s);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String funkifyText(String s) {
		// TODO Auto-generated method stub
		String mixedString = "";
for (int i = 0; i < s.length(); i++) {
	if (i%2 == 1) {
		mixedString = mixedString + s.valueOf(s.charAt(i)).toUpperCase();
	
	}
	else {
		mixedString = mixedString + s.valueOf(s.charAt(i)).toLowerCase();
	}
}
		
return mixedString;
}
}