import java.util.ArrayList;

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
    private InputReader reader;
    private WordGenerator generatedWord;
    ArrayList<Integer> indexCharacter = new ArrayList<>();

    public WordGuessingGame()
    {
        numberOfTries = 0;
        reader = new InputReader();
        generatedWord = new WordGenerator();
        hiddenWord = generatedWord.generateWord();
        guessedWord = "";
        initializeGuessedWord();
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

    private void showGuessedWord(){
        System.out.println("Palavra adivinhada: " + guessedWord);
    }

    private void showWelcome(){
        System.out.println("Bem-vindo, tente adivinhar a palavra!");
    }

    public boolean guess (char guessedLetter){
        if(guessedWord.indexOf(guessedLetter) >= 0){
            System.out.println("Essa letra já foi adivinhada!");
            numberOfTries++;
            return false;
        } else if(hiddenWord.indexOf(guessedLetter) >= 0){
            for(int i=0; i < hiddenWord.length();i++){
                if (hiddenWord.charAt(i) == guessedLetter){
                    guessedWord = guessedWord.substring(0, i) +
                    guessedLetter + guessedWord.substring(i + 1);
                }
            }
            System.out.println("Palavra: " + guessedWord); 
            numberOfTries++;
            return true; 
        }
        System.out.println("Essa letra não pertence à palavra"); 
        return false;
    }

    private void showResult(){
        System.out.println("Jogo concluido!");
        System.out.println("Número de tentativas = " + numberOfTries);
    }

    public void play(){
        do {
            char guessedChar = reader.getChar("Introduza uma letra: ");
            guess(guessedChar);
        } while (!guessedWord.equals(hiddenWord));
        showResult();
    }

    public String initializeGuessedWord(){
        int hiddenWordlength = hiddenWord.length();
        for(int i=0; i<hiddenWord.length(); i++){
            guessedWord += "_";
        }
        return guessedWord;
    }

    public void reset(){
        hiddenWord = generatedWord.generateWord();
        guessedWord = "";
        initializeGuessedWord();
        numberOfTries = 0;
    }

}
