package ru.netology.sqr;
public class Main {
    public static void main(String[] args) {
        SQRService service = new SQRService();
        System.out.println("Результат работы SQRService равен " + service.numFallingRange(200, 300));
    }
}