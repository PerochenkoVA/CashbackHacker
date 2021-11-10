package ru.netology.auto;


import org.testng.Assert;
import org.testng.annotations.Test;


public class CashbackHackServiceTest {
    @Test
    public void remain() {
        CashbackHackService service = new CashbackHackService();
        int amount = 800;
        int actual = service.remain(amount);
        int expected = 200;

        Assert.assertEquals(actual, expected);
    }
}
/*
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CashbackHackServiceTest {

    @Test
    void remain() {
        CashbackHackService service = new CashbackHackService();
        int amount = 800;
        int actual = service.remain(amount);
        int expected =200;

        assertEquals (expected, actual);
    }
}
*/