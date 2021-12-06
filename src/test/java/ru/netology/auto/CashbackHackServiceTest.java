package ru.netology.auto;


import static org.junit.Assert.assertEquals;
import org.testng.annotations.Test;


public class CashbackHackServiceTest {
    @Test
    public void remain() {
        CashbackHackService service = new CashbackHackService();
        int amount = 800;
        int actual = service.remain(amount);
        int expected = 200;

        assertEquals(actual, expected);
    }
}
