package ru.netology.auto;


import org.junit.Assert;
import org.junit.jupiter.api.Test;


public class CashbackHackServiceTest {
    @org.junit.Test
    public void remain() {
        CashbackHackService service = new CashbackHackService();
        int amount = 800;
        int actual = service.remain(amount);
        int expected = 200;

        Assert.assertEquals(expected, actual);
    }
}
