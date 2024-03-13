
/**
 * Write a description of class WordGuessingGame here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class WordGuessingGame
{
    private String hiddenWord;
    private String guessedWord;
    private int numberOfTries;
    
    public WordGuessingGame()
    {
        hiddenWord = "abc";
        guessedWord = "___";
    }
    
    public String getHiddenWord(){
        return hiddenWord;
    }
    
    public String getGuessedWord(){
        return guessedWord;
    }
    
    public int getNumberOfTries(){
        return numberOfTries;
    }
    
    public void showGuessedWord(){
        System.out.println("Palavra adivinhada: " + guessedWord);
    }
}
