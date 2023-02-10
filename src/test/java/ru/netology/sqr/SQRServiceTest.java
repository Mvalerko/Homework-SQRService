package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;


public class SQRServiceTest {

    @ParameterizedTest

    @CsvFileSource(files="src/test/resources/SQRServiceTest.csv") //Указываем путь к csv файлу, который содержит
    // значения для прохождения автотестов
    // В параметры метода вносим из файла SQRServiceTest.csv


    public void testSQRServiceParam (int start, int end, int expected)  {
        //знакомим наш тестовый метод с классом SQRService
        SQRService service = new SQRService();
        // запускаем метод numFallingRange с параметрами из SQRServiceTest.csv. Полученный результат записываем в
        // actual
        int actual = service.numFallingRange(start, end);
        // полученный actual сверяем с expected из все того же SQRServiceTest.csv
        Assertions.assertEquals(expected, actual);
    }

}