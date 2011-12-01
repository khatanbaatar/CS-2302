
public class ReverseChar {
	public static void main(String[] args)
	{
		System.out.println(reverse("Cat"));
	}
	public static String reverse (String s){
		String result = "";
		if(s.length() == 0){
		
			result = "";
		}
		else{
			result = reverse(s.substring(1)) + s.substring(0, 1);
		}
		return result;
		
	}
}
