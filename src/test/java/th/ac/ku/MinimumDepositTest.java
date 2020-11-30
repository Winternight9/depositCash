package th.ac.ku;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MinimumDepositTest {
    @Test
    void deposit_Less_Than_Minimum_Deposit_Result_Should_Be_False() {
        boolean expectedResult = false;
        Agent agent = new Agent();
        float depositCash = 50.00f;

        boolean actualResult = agent.checkMinimumDepositPerTime(depositCash,"Type1");

        assertEquals(actualResult,expectedResult);
    }
    @Test
    void deposit_Equal_To_Minimum_Deposit_Result_Should_Be_True() {
        boolean expectedResult = true;
        Agent agent = new Agent();
        float depositCash = 200.00f;

        boolean actualResult = agent.checkMinimumDepositPerTime(depositCash,"Type2");

        assertEquals(actualResult,expectedResult);
    }
    @Test
    void deposit_More_Than_Minimum_Deposit_Result_Should_Be_True() {
        boolean expectedResult = true;
        Agent agent = new Agent();
        float depositCash = 4000.00f;

        boolean actualResult = agent.checkMinimumDepositPerTime(depositCash,"Type1");

        assertEquals(actualResult,expectedResult);
    }
}