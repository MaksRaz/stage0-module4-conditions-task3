package school.mjc.stage0.conditions.task3;

public class AlphabeticCharacters {
    public void vowelDeterminer(char character) {
        if (!(character >= 'a' && character <= 'z' || character >= 'A' && character <= 'Z')){
            System.out.println("wrong alphabet!");
        }
        else if ("aeiou".indexOf(character) >= 0){
            System.out.println("Vowel");
        }
        else {
            System.out.println("Consonant");
        }
    }
}
