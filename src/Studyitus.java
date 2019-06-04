// Jobanpreet Singh - C0748529
public class Studyitus {

	public static void main(String[] args) {
		// Quiz 5 & 6

		//Testing Requirement 1
		String output = studying("Shivam");
		System.out.println(output);
		
		//Tesing Requirement 2
		output = studying(null);
		System.out.println(output);
		
		//Testing Requirement 3
		output = studying("ROMIL");
		System.out.println(output);
		
		//Testing Requirement 4
		output = studying("Romil,Joao");
		System.out.println(output);
			
				
	}
	
	public static String studying(String names) {
		
		if(names == null) {
			return "Nobody is studying";
		
		} else if(isPlural(names)) {
			
			int index = 0;
			for(int i=0 ; i<names.length() ; i++) {
				if(names.charAt(i) == ',') {
					index = i;
				}
			}
			
			return names.substring(0,index) + " and " + names.substring(index+1, names.length()) + " are studying";
		
		
		} else if(names.equals(names.toUpperCase())) {
				return names + " IS STUDYING";
		
		} else {
			return names + " is studying";
		
		}
	}
	
	public static boolean isPlural(String names) {
		
		for(int i=0 ; i<names.length() ; i++) {
			
			if(names.charAt(i) == ',') {
				return true;
			}
			
		}
	
		return false;
	}

}
