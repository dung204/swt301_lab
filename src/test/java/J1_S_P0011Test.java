import org.junit.jupiter.api.Test;

import com.J1_S_P0011.Manager;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.DisplayName;

public class J1_S_P0011Test {
  @Test
  @DisplayName("1. Binary number with all 0s -> decimal")
  public void testConvertBinaryToDecimal1() {
    String binary1 = "0000";
    String expected1 = "0";
    String result1 = Manager.convertBinaryToDecimal(binary1);
    assertEquals(expected1, result1);
  }

  @Test
  @DisplayName("2. Binary number with all 1s -> decimal")
  public void testConvertBinaryToDecimal2() {
    String binary2 = "1111";
    String expected2 = "15";
    String result2 = Manager.convertBinaryToDecimal(binary2);
    assertEquals(expected2, result2);
  }

  @Test
  @DisplayName("3. Binary number with a mix of 0s and 1s -> decimal")
  public void testConvertBinaryToDecimal3() {
    String binary3 = "1010";
    String expected3 = "10";
    String result3 = Manager.convertBinaryToDecimal(binary3);
    assertEquals(expected3, result3);
  }

  @Test
  @DisplayName("4. Invalid binary number -> decimal")
  public void testConvertBinaryToDecimal4() {
    String binary4 = "1234";
    assertThrows(NumberFormatException.class, () -> {
      Manager.convertBinaryToDecimal(binary4);
    });
  }

  @Test
  @DisplayName("5. Decimal number 0 -> binary")
  public void testConvertDecimalToBinary1() {
    String decimal1 = "0";
    String expected1 = "0";
    String result1 = Manager.convertDecimalToBinary(decimal1);
    assertEquals(expected1, result1);
  }

  @Test
  @DisplayName("6. Decimal number 15 -> binary")
  public void testConvertDecimalToBinary2() {
    String decimal2 = "15";
    String expected2 = "1111";
    String result2 = Manager.convertDecimalToBinary(decimal2);
    assertEquals(expected2, result2);
  }

  @Test
  @DisplayName("7. Decimal number 10 -> binary")
  public void testConvertDecimalToBinary3() {
    String decimal3 = "10";
    String expected3 = "1010";
    String result3 = Manager.convertDecimalToBinary(decimal3);
    assertEquals(expected3, result3);
  }

  @Test
  @DisplayName("8. Invalid decimal number -> binary")
  public void testConvertDecimalToBinary4() {
    String decimal4 = "abc";
    assertThrows(NumberFormatException.class, () -> {
      Manager.convertDecimalToBinary(decimal4);
    });
  }

  @Test
  @DisplayName("9. Binary number with all 0s -> hexadecimal")
  public void testConvertBinaryToHexa1() {
    String binary1 = "0000";
    String expected1 = "0";
    String result1 = Manager.convertBinaryToHexa(binary1);
    assertEquals(expected1, result1);
  }

  @Test
  @DisplayName("10. Binary number with all 1s -> hexadecimal")
  public void testConvertBinaryToHexa2() {
    String binary2 = "1111";
    String expected2 = "F";
    String result2 = Manager.convertBinaryToHexa(binary2);
    assertEquals(expected2, result2);
  }

  @Test
  @DisplayName("11. Binary number with a mix of 0s and 1s -> hexadecimal")
  public void testConvertBinaryToHexa3() {
    String binary3 = "1010";
    String expected3 = "A";
    String result3 = Manager.convertBinaryToHexa(binary3);
    assertEquals(expected3, result3);
  }

  @Test
  @DisplayName("12. Invalid binary number -> hexadecimal")
  public void testConvertBinaryToHexa4() {
    String binary4 = "1234";
    assertThrows(NumberFormatException.class, () -> {
      Manager.convertBinaryToHexa(binary4);
    });
  }

  @Test
  @DisplayName("13. Hexadecimal number with all 0s -> binary")
  public void testConvertHexaToBinary1() {
    String hexa1 = "0000";
    String expected1 = "00000000";
    String result1 = Manager.convertHexaToBinary(hexa1);
    assertEquals(expected1, result1);
  }

  @Test
  @DisplayName("14. Hexadecimal number with all Fs -> binary")
  public void testConvertHexaToBinary2() {
    String hexa2 = "FFFF";
    String expected2 = "1111111111111111";
    String result2 = Manager.convertHexaToBinary(hexa2);
    assertEquals(expected2, result2);
  }

  @Test
  @DisplayName("15. Hexadecimal number with a mix of 0s and Fs -> binary")
  public void testConvertHexaToBinary3() {
    String hexa3 = "A0F";
    String expected3 = "101000001111";
    String result3 = Manager.convertHexaToBinary(hexa3);
    assertEquals(expected3, result3);
  }

  @Test
  @DisplayName("16. Invalid hexadecimal number -> binary")
  public void testConvertHexaToBinary4() {
    String hexa4 = "GHIJ";
    assertThrows(NumberFormatException.class, () -> {
      Manager.convertHexaToBinary(hexa4);
    });
  }

  @Test
  @DisplayName("17. Decimal number 0 -> hexadecimal")
  public void testConvertDecimalToHexa1() {
    String decimal1 = "0";
    String expected1 = "0";
    String result1 = Manager.convertDecimalToHexa(decimal1);
    assertEquals(expected1, result1);
  }

  @Test
  @DisplayName("18. Decimal number 15 -> hexadecimal")
  public void testConvertDecimalToHexa2() {
    String decimal2 = "15";
    String expected2 = "F";
    String result2 = Manager.convertDecimalToHexa(decimal2);
    assertEquals(expected2, result2);
  }

  @Test
  @DisplayName("19. Decimal number 10 -> hexadecimal")
  public void testConvertDecimalToHexa3() {
    String decimal3 = "10";
    String expected3 = "A";
    String result3 = Manager.convertDecimalToHexa(decimal3);
    assertEquals(expected3, result3);
  }

  @Test
  @DisplayName("20. Invalid decimal number -> hexadecimal")
  public void testConvertDecimalToHexa4() {
    String decimal4 = "abc";
    assertThrows(NumberFormatException.class, () -> {
      Manager.convertDecimalToHexa(decimal4);
    });
  }

  @Test
  @DisplayName("21. Hexadecimal number with all 0s -> decimal")
  public void testConvertHexaToDecimal1() {
    String hexa1 = "0000";
    int expected1 = 0;
    int result1 = Manager.convertHexaToDecimal(hexa1);
    assertEquals(expected1, result1);
  }

  @Test
  @DisplayName("22. Hexadecimal number with all Fs -> decimal")
  public void testConvertHexaToDecimal2() {
    String hexa2 = "FFFF";
    int expected2 = 65535;
    int result2 = Manager.convertHexaToDecimal(hexa2);
    assertEquals(expected2, result2);
  }

  @Test
  @DisplayName("23. Hexadecimal number with a mix of 0s and Fs -> decimal")
  public void testConvertHexaToDecimal3() {
    String hexa3 = "A0F";
    int expected3 = 2575;
    int result3 = Manager.convertHexaToDecimal(hexa3);
    assertEquals(expected3, result3);
  }

  @Test
  @DisplayName("24. Invalid hexadecimal number -> decimal")
  public void testConvertHexaToDecimal4() {
    String hexa4 = "GHIJ";
    assertThrows(NumberFormatException.class, () -> {
      Manager.convertHexaToDecimal(hexa4);
    });
  }
}
