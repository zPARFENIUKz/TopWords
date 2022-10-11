import java.util.*;

public class TopWords {
    public static List<String> topWords(final String str) throws NullPointerException{
        if (str == null) throw new NullPointerException("str cannot be null");
        final List<String> words = Arrays.stream(str.replaceAll("[^a-zA-z']", " ").replaceAll(" {2}", " ").strip().toLowerCase().split(" ")).toList();
        final Set<String> uniqueWords = new HashSet<>(words);
        final List<String> topWords = uniqueWords.stream().sorted(Comparator.comparing(word -> -Collections.frequency(words, word))).toList();
        return topWords.subList(0, Math.min(3, topWords.size()));
    }
}

