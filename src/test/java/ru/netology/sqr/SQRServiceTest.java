package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;


public class SQRServiceTest {

    @ParameterizedTest
//    @CsvSource({
//            "150,5000,true",
//            "50,5000,false"
//    })
    @CsvFileSource(files="src/test/resources/SQRServiceTest.csv")
    public void testRegisteredUnderLimit(int start, int end, int expected) {
        SQRService service = new SQRService();

        //int expected = 150;
        int actual = service.numFallingRange(start, end);

        Assertions.assertEquals(expected, actual);
    }

//    @Test
//    public void testUnregisteredUnderLimit() {
//        BonusService service = new BonusService();
//
//        int expected = 50;
//        int actual = service.calcBonus(5_000, false);
//
//        Assertions.assertEquals(expected, actual);
//    }
}