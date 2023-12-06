package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;


public class RestMonthTest {
    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/Params.csv")
    public void test(int expected, int income, int expense, int threshold) {
        RestMonth servise = new RestMonth();
        int actual = servise.restMonth(income, expense, threshold);
        Assertions.assertEquals(expected, actual);
    }

}
