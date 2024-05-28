import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.J1_S_P0025.Manager;

public class J1_S_P0025Test {
  @Test
  @DisplayName("1. Test formatOneSpace with single space")
  public void testFormatOneSpaceWithSingleSpace() {
    String input = "Hello World";
    String expectedOutput = "hello world";
    String actualOutput = Manager.formatOneSpace(input);
    assertEquals(expectedOutput, actualOutput);
  }

  @Test
  @DisplayName("2. Test formatOneSpace with multiple spaces")
  public void testFormatOneSpaceWithMultipleSpaces() {
    String input = "Hello     World";
    String expectedOutput = "hello world";
    String actualOutput = Manager.formatOneSpace(input);
    assertEquals(expectedOutput, actualOutput);
  }

  @Test
  @DisplayName("3. Test formatOneSpace with leading and trailing spaces")
  public void testFormatOneSpaceWithLeadingAndTrailingSpaces() {
    String input = "   hello world   ";
    String expectedOutput = "hello world";
    String actualOutput = Manager.formatOneSpace(input);
    assertEquals(expectedOutput, actualOutput);
  }

  @Test
  @DisplayName("4. Test formatOneSpace with no spaces")
  public void testFormatOneSpaceWithNoSpaces() {
    String input = "HelloWorld";
    String expectedOutput = "helloworld";
    String actualOutput = Manager.formatOneSpace(input);
    assertEquals(expectedOutput, actualOutput);
  }

  @Test
  @DisplayName("5. Test formatOneSpace with special characters")
  public void testFormatOneSpaceWithSpecialCharacters() {
    String input = "Hello, World. :\"Hello\"";
    String expectedOutput = "hello , world . : \" hello";
    String actualOutput = Manager.formatOneSpace(input);
    assertEquals(expectedOutput, actualOutput);
  }

  @Test
  @DisplayName("6. Test formatSpecialCharacters with no special characters")
  public void testFormatSpecialCharactersWithNoSpecialCharacters() {
    String input = "Hello World";
    String expectedOutput = "Hello World";
    String actualOutput = Manager.formatSpecialCharacters(input);
    assertEquals(expectedOutput, actualOutput);
  }

  @Test
  @DisplayName("7. Test formatSpecialCharacters with special characters")
  public void testFormatSpecialCharactersWithSpecialCharacters() {
    String input = "Hello, World! :\"Hello\"";
    String expectedOutput = "Hello, World! :\"Hello\"";
    String actualOutput = Manager.formatSpecialCharacters(input);
    assertEquals(expectedOutput, actualOutput);
  }

  @Test
  @DisplayName("9. Test formatSpecialCharacters with empty string")
  public void testFormatSpecialCharactersWithEmptyString() {
    String input = "";
    String expectedOutput = "";
    String actualOutput = Manager.formatSpecialCharacters(input);
    assertEquals(expectedOutput, actualOutput);
  }

  @Test
  @DisplayName("10. Test afterDotUpperCase with single word")
  public void testAfterDotUpperCaseWithSingleWord() {
    String input = "hello";
    String expectedOutput = "hello";
    String actualOutput = Manager.afterDotUpperCase(input);
    assertEquals(expectedOutput, actualOutput);
  }

  @Test
  @DisplayName("11. Test afterDotUpperCase with multiple words")
  public void testAfterDotUpperCaseWithMultipleWords() {
    String input = "hello. world";
    String expectedOutput = "hello. World";
    String actualOutput = Manager.afterDotUpperCase(input);
    assertEquals(expectedOutput, actualOutput);
  }

  @Test
  @DisplayName("12. Test afterDotUpperCase with empty string")
  public void testAfterDotUpperCaseWithEmptyString() {
    String input = "";
    String expectedOutput = "";
    String actualOutput = Manager.afterDotUpperCase(input);
    assertEquals(expectedOutput, actualOutput);
  }

  @Test
  @DisplayName("13. Test afterDotUpperCase with no dot")
  public void testAfterDotUpperCaseWithNoDot() {
    String input = "hello";
    String expectedOutput = "hello";
    String actualOutput = Manager.afterDotUpperCase(input);
    assertEquals(expectedOutput, actualOutput);
  }

  @Test
  @DisplayName("14. Test afterDotUpperCase with multiple dots")
  public void testAfterDotUpperCaseWithMultipleDots() {
    String input = "hello. world. test";
    String expectedOutput = "hello. World. Test";
    String actualOutput = Manager.afterDotUpperCase(input);
    assertEquals(expectedOutput, actualOutput);
  }

  @Test
  @DisplayName("15. Test noSpaceQuotes with no quotes")
  public void testNoSpaceQuotesWithNoQuotes() {
    String input = "Hello World";
    String expectedOutput = "Hello World";
    String actualOutput = Manager.noSpaceQuotes(input);
    assertEquals(expectedOutput, actualOutput);
  }

  @Test
  @DisplayName("16. Test noSpaceQuotes with single quote")
  public void testNoSpaceQuotesWithSingleQuote() {
    String input = "Hello 'World'";
    String expectedOutput = "Hello 'World'";
    String actualOutput = Manager.noSpaceQuotes(input);
    assertEquals(expectedOutput, actualOutput);
  }

  @Test
  @DisplayName("17. Test noSpaceQuotes with double quotes")
  public void testNoSpaceQuotesWithDoubleQuotes() {
    String input = "Hello \"World\"";
    String expectedOutput = "Hello\"World\"";
    String actualOutput = Manager.noSpaceQuotes(input);
    assertEquals(expectedOutput, actualOutput);
  }

  @Test
  @DisplayName("18. Test noSpaceQuotes with multiple quotes")
  public void testNoSpaceQuotesWithMultipleQuotes() {
    String input = "Hello 'World' \"Test\"";
    String expectedOutput = "Hello'World'\"Test\"";
    String actualOutput = Manager.noSpaceQuotes(input);
    assertEquals(expectedOutput, actualOutput);
  }

  @Test
  @DisplayName("19. Test noSpaceQuotes with quotes and spaces")
  public void testNoSpaceQuotesWithQuotesAndSpaces() {
    String input = "Hello 'World'   \"Test\"";
    String expectedOutput = "Hello 'World'   \"Test\"";
    String actualOutput = Manager.noSpaceQuotes(input);
    assertEquals(expectedOutput, actualOutput);
  }

  @Test
  @DisplayName("20. Test noSpaceQuotes with empty string")
  public void testNoSpaceQuotesWithEmptyString() {
    String input = "";
    String expectedOutput = "";
    String actualOutput = Manager.noSpaceQuotes(input);
    assertEquals(expectedOutput, actualOutput);
  }

  @Test
  @DisplayName("21. Test firstUppercase with single lowercase word")
  public void testFirstUppercaseWithSingleLowercaseWord() {
    String input = "hello";
    String expectedOutput = "Hello";
    String actualOutput = Manager.firstUpercase(input);
    assertEquals(expectedOutput, actualOutput);
  }

  @Test
  @DisplayName("22. Test firstUppercase with single uppercase word")
  public void testFirstUppercaseWithSingleUppercaseWord() {
    String input = "HELLO";
    String expectedOutput = "HELLO";
    String actualOutput = Manager.firstUpercase(input);
    assertEquals(expectedOutput, actualOutput);
  }

  @Test
  @DisplayName("23. Test firstUppercase with mixed case word")
  public void testFirstUppercaseWithMixedCaseWord() {
    String input = "hElLo";
    String expectedOutput = "HElLo";
    String actualOutput = Manager.firstUpercase(input);
    assertEquals(expectedOutput, actualOutput);
  }

  @Test
  @DisplayName("24. Test firstUppercase with empty string")
  public void testFirstUppercaseWithEmptyString() {
    String input = "";
    String expectedOutput = "";
    String actualOutput = Manager.firstUpercase(input);
    assertEquals(expectedOutput, actualOutput);
  }

  @Test
  @DisplayName("25. Test firstUppercase with multiple words")
  public void testFirstUppercaseWithMultipleWords() {
    String input = "hello world";
    String expectedOutput = "Hello World";
    String actualOutput = Manager.firstUpercase(input);
    assertEquals(expectedOutput, actualOutput);
  }
}
