package al.androidfire;

import com.google.gson.JsonParseException;
import com.google.gson.JsonParser;

public class JSON {
    
    public static boolean isCorrectJSON(String lines,boolean a) {
        boolean done = true;
        while (lines != null) synchronized (lines) {
            System.out.println("Checking JSON Lines");
            try {
                new JsonParser().parse(lines);
            }catch (JsonParseException ex) {
                if (a) {
                    ex.printStackTrace();
                    done = false;
                }
            }
            lines = null;
        }
        return done;
    }
}
