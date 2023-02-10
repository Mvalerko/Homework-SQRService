package ru.netology.sqr;

public class SQRService {
    int numSquares = 0; //Заранее объявляем переменную, в которую запишем количество совпадений по результатам работы на
    //шего перебора. Переменная объявляется сразу после объявления класса, что бы ее содержимое не обнулялось после
    //каждой итерации цикла

    //Объявляем метод, который будет принимать в качестве параметров два значения. Диапазон между ними и будет условием
    // перебора
    public int numFallingRange(int start, int end) {
        //цикл for будет идти от 10 до 99 с шагом в единицу и находить корень каждого числа
        // если включить вывод println, то в консоль пойдет информация о том, что считает и находит цикл
        for (int сondition = 10; сondition <= 99; сondition++) {
            int square = сondition * сondition;
            //System.out.println("Если " + сondition + " умножить на " + сondition + " то получим " + square);
            // Если square попадает в диапазон параметров
            if (square >= start && square <= end) {
                //System.out.println("!Совпадение " + square);
                numSquares++;
                //System.out.println("numSquares сейчас равен " + numSquares);

            }
        }
        return numSquares;
    }
}




