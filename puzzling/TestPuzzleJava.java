import java.util.ArrayList;
import java.util.Random;
public class TestPuzzleJava {
    
	public static void main(String[] args) {
		PuzzleJava generator = new PuzzleJava();
		ArrayList<Integer> randomRolls = generator.getTenRolls();
		System.out.println(randomRolls);
		
		char randomLetter = generator.getRandomLetter();
		System.out.println(randomLetter);
		
		String randomPassword = generator.generatePassword();
		System.out.println(randomPassword);
		
		ArrayList<String> listPassword = generator.getNewPasswordSet(10);
		System.out.println(listPassword);
    	//..
		// Write your other test cases here.
		//..
	}
}
