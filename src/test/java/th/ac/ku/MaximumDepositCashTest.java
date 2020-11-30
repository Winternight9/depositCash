package th.ac.ku;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaximumDepositCashTest {
    @Test
    void deposit_Less_Than_Daily_Maximum_Deposit_Result_Should_Be_True(){
        boolean expectedResult = true;
        Agent agent = new Agent();
        float depositCash = 6000.00f;

        boolean actualResult = agent.checkMaximumDepositPerDay(depositCash);

        assertEquals(actualResult,expectedResult);
    }
    @Test
    void deposit_Equal_To_Daily_Maximum_Deposit_Result_Should_Be_True(){
        boolean expectedResult = true;
        Agent agent = new Agent();
        float depositCash = 50000.00f;

        boolean actualResult = agent.checkMaximumDepositPerDay(depositCash);

        assertEquals(actualResult,expectedResult);
    }
    @Test
    void deposit_More_Than_Daily_Maximum_Deposit_Result_Should_Be_True(){
        boolean expectedResult = false;
        Agent agent = new Agent();
        float depositCash = 51000.00f;

        boolean actualResult = agent.checkMaximumDepositPerDay(depositCash);

        assertEquals(actualResult,expectedResult);
    }
}
