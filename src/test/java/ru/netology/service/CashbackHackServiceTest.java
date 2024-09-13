package ru.netology.service;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

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
    public void shouldReturn1000IfAmountIs0() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 0;

        int actual = cashbackHackService.remain(amount);
        int expected = 1000;

        assertEquals(actual, expected);
    }

}