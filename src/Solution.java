import javax.imageio.IIOException;
import java.io.*;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    public static List<String> words = new ArrayList<String>();

    static {
        words.add("файл");
        words.add("вид");
        words.add("В");
    }

    public static void main(String[] args) {

    try (BufferedReader readerconsol = new BufferedReader(new InputStreamReader(System.in)); BufferedReader reader = new BufferedReader(new FileReader(readerconsol.readLine()))) {

        int count = 0;
        while (reader.ready()) {
            String s = reader.readLine();
            for (int i = 0; i < words.size();i++){
                Pattern p = Pattern.compile("\\b"+ words.get(i)+"\\b");
                Matcher m = p.matcher(s);
                if (m.find()) count++;
            }

            if(count == 2){
                System.out.println(s);
                count = 0;
            }
            else {
                count = 0;
            }
        }

    } catch (IOException e) {
        e.printStackTrace();
    }

}
}