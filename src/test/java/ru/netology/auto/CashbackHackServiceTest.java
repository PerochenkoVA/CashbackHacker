package ru.netology.auto;


import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertEquals;


public class CashbackHackServiceTest {
    @org.junit.Test
    public void remain() {
        CashbackHackService service = new CashbackHackService();
        int amount = 800;
        int actual = service.remain(amount);
        int expected = 200;

        Assert.assertEquals(expected, actual);
    }
     @org.junit.Test
    public void calculateOneThousand(){
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;
        int actual = service.remain(amount);
        int expected =0;

        assertEquals(expected, actual);
    }
}
