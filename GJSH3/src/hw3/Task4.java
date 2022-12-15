package hw3;

//На вход приходт ArrayList<Integer> удалите из него четные числа

import java.util.ArrayList;
import java.util.Iterator;

public class Task4 {
    public ArrayList<Integer> removeAllEvenNumbers(ArrayList<Integer> list) {
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            if (iterator.next() % 2 == 0) {
                iterator.remove();
            }
        }
        return list;
    }

    public ArrayList<Integer> removeAllEvenNumbersLambda(ArrayList<Integer> list) {
        list.removeIf(integer -> integer % 2 == 0);
        return list;
    }
}