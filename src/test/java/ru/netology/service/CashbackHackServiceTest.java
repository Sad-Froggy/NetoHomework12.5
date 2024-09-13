package ru.netology.service;

import org.testng.annotations.Test;
import static org.testng.AssertJUnit.assertEquals;

public class CashbackHackServiceTest {

    @Test
    public void shouldReturn700IfAmountIs1300() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 1300;

        int actual = cashbackHackService.remain(amount);
        int expected = 700;

        assertEquals(actual, expected);
    }

    @Test
    public void shouldReturn999IfAmountIs1() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 1;

        int actual = cashbackHackService.remain(amount);
        int expected = 999;

        assertEquals(actual, expected);
    }

    @Test
    public void shouldReturn0IfAmountIs1000() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 1000;

        int actual = cashbackHackService.remain(amount);
        int expected = 0;

        assertEquals(actual, expected);
    }

}