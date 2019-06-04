// Jobanpreet Singh - C0748529
public class Studyitus {

	public static void main(String[] args) {
		// Quiz 5 & 6

		//Requirement 1
		//String output = studying("Shivam");
		//System.out.println(output);
		
		//Requirement 2
		//String output = studying(null);
		//System.out.println(output);
		
		//Requirement 2
		String output = studying("ROMIL");
		System.out.println(output);
				
		
	}
	
	public static String studying(String name) {
		
		if(name == null) 
			return "Nobody is studying";
		else if(isUpper(name))
			return name + " IS STUDYING";
		else
			return name + " is studying";
	}
	
	public static boolean isUpper(String name) {
		
		String nameUpper = name.toUpperCase();
		int index = 0;
		for(int i=0; i < name.length(); i++) {
			if(name.charAt(i) == nameUpper.charAt(i)) {
				index++;
			}
		}
		if(index == (name.length()))
			return true;
		else
			return false;
			
	}
	

}
