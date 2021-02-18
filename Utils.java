import java.util.ArrayList;
import java.util.List;

public class Utils {
    
    public static List<String> convert(String[] data) {
        List<String> list = new ArrayList<String>();
        for (String string : data) {
            list.add(string);
        }
        return list;
    }
}