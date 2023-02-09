package ru.netology.sqr;

public class SQRService {
    int numSquares = 0;

    public int numFallingRange(int start, int end) {
        for (int сondition = 10; сondition <= 99; сondition++) {

            int square = сondition * сondition;
            //System.out.println("Если " + i + " умножить на " + i + " то получим " + square);
            if (square >= start && square <= end) {
                //System.out.println("!Совпадение " + square);
                numSquares++;
                //System.out.println("numSquares сейчас равен " + numSquares);

            }
        }
        return numSquares;
    }
}




