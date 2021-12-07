package day02;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class StringListsTest {

    @Test
    void testShortestWords() {
        StringLists stringLists = new StringLists();
        List<String> words = List.of("ék", "kutya", "ló", "macska", "könyv", "ég", "cipő", "szerszám");
        List<String> result = stringLists.shortestWords(words);

        assertEquals(3, result.size());
        assertEquals("ég", result.get(2));
    }

}