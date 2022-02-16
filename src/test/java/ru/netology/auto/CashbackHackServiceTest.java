package ru.netology.auto;


import static org.testng.AssertJUnit.assertEquals;


public class CashbackHackServiceTest {
    @org.testng.annotations.Test
    public void remain() {
        CashbackHackService service = new CashbackHackService();
        int amount = 800;
        int actual = service.remain(amount);
        int expected = 200;


        assertEquals(expected, actual);

    }
     @org.testng.annotations.Test
    public void calculateOneThousand(){
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;
        int actual = service.remain(amount);
        int expected =0;

        assertEquals(expected, actual);
    }

}

