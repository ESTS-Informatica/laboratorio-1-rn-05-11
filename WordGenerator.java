import java.util.ArrayList;
import java.util.Random;

/**
 * Write a description of class WordGenerator here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class WordGenerator
{
    private ArrayList<String> words;
    public WordGenerator()
    {
        words = new ArrayList<>();
        fillArrayList();
    }
    
    private void fillArrayList(){ 
        words.add("boolean");
        words.add("break");
        words.add("byte");
        words.add("case");
        words.add("char");
        words.add("class");
        words.add("continue");
        words.add("do");
        words.add("double");
        words.add("else");
        words.add("enum");
        words.add("for");
        words.add("if");
        words.add("import");
        words.add("int");
    }
    
    public String generateWord(){
        Random random = new Random();
        int number = random.nextInt(words.size());
        return words.get(number);
    }
    
    public void addWord(String word){
        words.add(word);
    }
}
