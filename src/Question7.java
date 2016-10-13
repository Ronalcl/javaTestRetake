import java.util.ArrayList;

/**
 * Created by lrterry on 10/13/16.
 */
public class Question7 {
    //Create an ArrayList of Strings then add 5 values to it.
    public static void main(String[] args){
        ArrayList<String> audios = new ArrayList<>();
        String emigos = "Friends";
        for(int i = 0; i < 5; i++){
            audios.add(emigos);
        }System.out.println(audios);
    }
}
