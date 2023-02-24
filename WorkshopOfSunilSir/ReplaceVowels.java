package WorkshopOfSunilSir;

/*
 * WAP to replace all the vowels in a given string with a specified character and to remove all non-alphanumeric 
  Characters from a given string.
 */
public class ReplaceVowels {

	// functions to remove non-alphanumeric and charecters from string
	
	//for removing special charrecters
	public static String removalofString(String inputString) {

		// replacing with given string
		inputString = inputString.replaceAll("[^a-zA-Z0-9]", "");

		// returning the string
		return inputString;

	}
	//for removing Vowels
	public static String removalofVowels(String inputString2) {

		inputString2 = inputString2.replaceAll("[aeiouAEIOU]", "");
		
		return inputString2;

	}

	//for ewmoving Numbers
	public static String removalOfNumbers(String inputString3) {
		
		inputString3 = inputString3.replaceAll("[0-9]", "");
		
		return inputString3;

	}
	//removing ALL in One Method
	public static String removeAll(String inputString4)
	{
		
		inputString4 = inputString4.replaceAll("[\\dAEIOUaeiou\\W]","");
		
		return inputString4;
		
		
	}

	public static void main(String[] args) {

		String givenString = "@!Soumya-Sourav12?[][]";
		String givenString2 = "SoumyaSourav&$ Behera?{}[]";
		String givenString3 = "SoumyaSourav12324";
		String givenString4= "soumya@123";

		// test case 1
		System.out.println(removalofString(givenString));
		// test case 2
		System.out.println(removalofString(givenString2));
		// test case 3
		System.out.println(removalofString(givenString3));
		// test case 4
		System.out.println(removalofVowels(givenString));
		// test case 5
		System.out.println(removalOfNumbers(givenString3));
		// test case 6
		System.out.println(removalofVowels(givenString3));
		
		//test case 7
		System.out.println(removeAll(givenString4));

	}

}
