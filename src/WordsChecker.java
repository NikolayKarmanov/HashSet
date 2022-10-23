import java.util.HashSet;
import java.util.Set;

public class WordsChecker {
    private String text;

    public WordsChecker(String text) {
        this.text = text;
    }

    public boolean hasWord(String word) {
        Set<String> set = new HashSet<>();
        String[] words = text.split("\\P{IsAlphabetic}+");
        for (int i = 0; i < words.length; i++) {
            set.add(words[i]);
        }
        if (set.contains(word)) {
            return true;
        } else {
            return false;
        }
    }
}
