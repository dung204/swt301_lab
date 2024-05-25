import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Test;

import com.J1_S_P0010.LinearSearch;

@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
public class J1_S_P0010Test {
  private static LinearSearch searcher;
  private static int[] array = {12, 5, 14, 16, 2, 18, 4, 1, 17};
  private static int[] emptyArray = {};

  @BeforeAll
  public static void setup() {
    searcher = new LinearSearch();
  }

  @Test
  @DisplayName("1. Should return index of search value in array")
  public void testLinerSearch1() {
    int search = 14;
    int expected = 2;
    int result = searcher.linerSearch(array, search);
    assert (expected == result);
  }

  @Test
  @DisplayName("2. Should return -1 when search value is not in array")
  public void testLinerSearch2() {
    int search = 15;
    int expected = -1;
    int result = searcher.linerSearch(array, search);
    assert (expected == result);
  }

  @Test
  @DisplayName("3. Should return -1 when array is empty")
  public void testLinerSearch3() {
    int search = 15;
    int expected = -1;
    int result = searcher.linerSearch(emptyArray, search);
    assert (expected == result);
  }

  @Test
  @DisplayName("4. Should return 0 when search value is the first element of array")
  public void testLinerSearch4() {
    int search = 12;
    int expected = 0;
    int result = searcher.linerSearch(array, search);
    assert (expected == result);
  }

  @Test
  @DisplayName("5. Should return the last index when search value is the last element of array")
  public void testLinerSearch5() {
    int search = 17;
    int expected = 8;
    int result = searcher.linerSearch(array, search);
    assert (expected == result);
  }
}
