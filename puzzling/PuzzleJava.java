import java.util.Random;
import java.util.ArrayList;

public class PuzzleJava {
    
    Random rand = new Random();

    public ArrayList getTenRolls(){
        ArrayList<Integer> tenRolls = new ArrayList<Integer>();
        for(int i = 0; i < 10; i++){
            int num = rand.nextInt(21);
            tenRolls.add(num);
        }
        return tenRolls;
    }
    public char getRandomLetter(){
        char[] letters = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        int num = rand.nextInt(26);
        return letters[num];
    }
    public String generatePassword(){
        String password = "";
        for(int i = 0; i < 8; i++){
            password += getRandomLetter();
        }
        return password;
    }
    public ArrayList<String> getNewPasswordSet(int length){
        ArrayList<String> newPasswords = new ArrayList<String>();
        for(int i = 0; i < length; i++){
            newPasswords.add(generatePassword());
        }
        return newPasswords;
    }
}