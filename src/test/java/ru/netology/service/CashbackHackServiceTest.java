package ru.netology.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CashbackHackServiceTest {

    @Test
    void shouldReturn700IfAmountIs1300() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 1300;

        int actual = cashbackHackService.remain(amount);
        int expected = 700;

        assertEquals(expected, actual);
    }
}