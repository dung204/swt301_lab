import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Map;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.J1_S_P0008.Counter;

public class J1_S_P0008Test {
  private Counter counter;

  @BeforeEach
  public void setup() {
    counter = new Counter();
  }

  @Test
  @DisplayName("1. Should return the correct number of distinct characters and words in the content")
  public void testCounter1() {
    String content = "Hello world hello Dung World";
    var result = counter.analyze(content);
    Map<Character, Integer> charCounter = result.getKey();
    Map<String, Integer> wordCounter = result.getValue();

    assertEquals(13, charCounter.size());
    assertEquals(3, wordCounter.size());

    assertEquals(1, charCounter.get('H'));
    assertEquals(1, charCounter.get('h'));
    assertEquals(2, charCounter.get('e'));
    assertEquals(6, charCounter.get('l'));
    assertEquals(4, charCounter.get('o'));
    assertEquals(1, charCounter.get('w'));
    assertEquals(1, charCounter.get('W'));
    assertEquals(2, charCounter.get('d'));
    assertEquals(2, charCounter.get('r'));
    assertEquals(1, charCounter.get('D'));
    assertEquals(1, charCounter.get('u'));
    assertEquals(1, charCounter.get('n'));
    assertEquals(1, charCounter.get('g'));

    assertEquals(2, wordCounter.get("hello"));
    assertEquals(2, wordCounter.get("world"));
    assertEquals(1, wordCounter.get("dung"));
  }

  @Test
  @DisplayName("2. Should return no characters and words in the empty content")
  public void testCounter2() {
    String content = "";
    var result = counter.analyze(content);
    Map<Character, Integer> charCounter = result.getKey();
    Map<String, Integer> wordCounter = result.getValue();

    assertEquals(0, charCounter.size());
    assertEquals(0, wordCounter.size());
  }

  @Test
  @DisplayName("3. Should return no characters and words in the content with only spaces")
  public void testCounter3() {
    String content = "   ";
    var result = counter.analyze(content);
    Map<Character, Integer> charCounter = result.getKey();
    Map<String, Integer> wordCounter = result.getValue();

    assertEquals(0, charCounter.size());
    assertEquals(0, wordCounter.size());
  }

  
}
