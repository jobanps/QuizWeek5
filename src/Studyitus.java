// Jobanpreet Singh - C0748529
public class Studyitus {

	public static void main(String[] args) {
		// Quiz 5 & 6

		//Requirement 1
		//String output = studying("Shivam");
		//System.out.println(output);
		
		//Requirement 2
		String output = studying(null);
		System.out.println(output);
				
		
	}
	
	public static String studying(String name) {
		
		if(name == null) 
			return "Nobody is studying";
		else
			return name + " is studying";
	}

}
