import tester.Validation;


public class DigitRemover {
	
	public  static String removeDigits (String s){
		String result = "";
		if(s == null){
			Validation.reportError("String is null");
		}
		else{
			for(int x = 0; x < s.length(); x++){
				if(!Character.isDigit(s.charAt(x))){
					result += s.charAt(x);
				}
			}
		}
		return result;
		
	}

}
