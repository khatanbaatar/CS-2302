
public class ArrayEquality {
	
	public static boolean areEqual (int[] a1, int[] a2){
		
		boolean result;
		if(a1 == null)
			if(a2 == null)
				result = true;
			else result = false;
		else if(a2 == null)
			result = false;
		else if(a1.length != a2.length)
			result = false;
		else{
			int i = 0;
			while(i< a1.length && a1[i] == a2[i])
				i++;
			if(i == a1.length)
				result = true;
			else 
				result = false;
		}
		return result;	
	}
}
