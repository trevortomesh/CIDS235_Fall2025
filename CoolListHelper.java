import java.util.List;

public class CoolListHelper {

    /** Adds the word "cool" to the end of every element in the list. */
    public void addCool(List<String> words) {
        if (words == null) {
            throw new IllegalArgumentException("words list cannot be null");
        }
        for (int i = 0; i < words.size(); i++) {
            words.set(i, words.get(i) + " cool");
        }
    }
}
