import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.J1_S_P0051.Manager;

public class J1_S_P0051Test {
    @Test
    @DisplayName("1. Test BMIStatus with normal weight")
    public void testBMIStatus_NormalWeight() {
      double bmi = 22.5;
      String expectedStatus = "Standard.";
      String actualStatus = Manager.BMIStatus(bmi);
      assertEquals(expectedStatus, actualStatus);
    }
    
    @Test
    @DisplayName("2. Test BMIStatus with underweight")
    public void testBMIStatus_Underweight() {
      double bmi = 18.0;
      String expectedStatus = "Under-standard.";
      String actualStatus = Manager.BMIStatus(bmi);
      assertEquals(expectedStatus, actualStatus);
    }
    
    @Test
    @DisplayName("3. Test BMIStatus with overweight")
    public void testBMIStatus_Overweight() {
      double bmi = 27.8;
      String expectedStatus = "Overweight.";
      String actualStatus = Manager.BMIStatus(bmi);
      assertEquals(expectedStatus, actualStatus);
    }
    
    @Test
    @DisplayName("4. Test BMIStatus with obese")
    public void testBMIStatus_Obese() {
      double bmi = 35.2;
      String expectedStatus = "Fat-should lose weight";
      String actualStatus = Manager.BMIStatus(bmi);
      assertEquals(expectedStatus, actualStatus);
    }

    @Test
    @DisplayName("5. Test BMIStatus with very obese")
    public void testBMIStatus_VeryObese() {
      double bmi = 40.0;
      String expectedStatus = "Very fat - should lose weight immediately";
      String actualStatus = Manager.BMIStatus(bmi);
      assertEquals(expectedStatus, actualStatus);
    }
}
