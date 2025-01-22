New! Keyboard shortcuts … Drive keyboard shortcuts have been updated to give you first-letters navigation
import java.util.ArrayList;
public class wordle_logic {
    static int wordSize;
    static ArrayList<String> answer = new
            ArrayList<>();
    private static Object java;

    wordle_logic(){
        answer.add("w");
        answer.add("a");
        answer.add("t");
        answer.add("e");
        answer.add("r");
        wordSize = answer.size();
    }
    static boolean matchExactLetter(int i){

        if(wordle.tf.get(i).getText().equals(answer.get(i)
        )){
            return true;
        }
        return false;
    }
    static boolean matchLetter(int i)
    {
        if(answer.contains(wordle.tf.get(i).getText())){
            return true;
            //wordle_logic.java
        }
        return false;
    }}