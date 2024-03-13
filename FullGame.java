
/**
 * Write a description of class FullGame here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class FullGame
{

    private WordGuessingGame game;
    private InputReader reader;
    
    public FullGame()
    {
        game = new WordGuessingGame();
        reader = new InputReader();
    }
    
    public void play(){
        do{
            game.reset();
            game.play();
        }while(reader.getChar("Quer continuar a jogar? (S para continuar)") == 'S');
    }

}
