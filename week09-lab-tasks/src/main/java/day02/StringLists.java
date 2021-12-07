package day02;

import java.util.ArrayList;
import java.util.List;

public class StringLists {

    public List<String> shortestWords(List<String> words) {
        int length = findShortestWord(words);
        List<String> result = new ArrayList<>();
        for (String actual: words) {
            if (actual.length() == length) {
                result.add(actual);
            }
        }
        return result;
    }

    private int findShortestWord(List<String> words) {
        int length = words.get(0).length();
        for (String actual: words) {
            if (actual.length() < length) {
                length = actual.length();
            }
        }
        return length;
    }
}
