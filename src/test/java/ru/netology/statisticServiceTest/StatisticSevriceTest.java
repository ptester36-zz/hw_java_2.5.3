package ru.netology.statisticServiceTest;

import org.junit.jupiter.api.Test;
import ru.netology.statisticService.StatisticSevrice;

import static org.junit.jupiter.api.Assertions.*;

class StatisticSevriceTest {

    @Test
    void findMax() {
        StatisticSevrice sevrice = new StatisticSevrice();

        long [] incomesInBillions = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};
        long expected = 12;

        long actual = sevrice.findMax(incomesInBillions);

                assertEquals (expected, actual);
    }

    @Test
    void findMaxTwo() {
        StatisticSevrice sevrice = new StatisticSevrice();

        long [] incomesInBillions = {7, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};
        long expected = 12;

        long actual = sevrice.findMax(incomesInBillions);

        assertEquals (expected, actual);
    }
}