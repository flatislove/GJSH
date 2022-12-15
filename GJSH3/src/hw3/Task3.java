package hw3;

//На вход приходит ArrayList<Integer>. Отсортируйте в нем только четные числа.

import java.util.ArrayList;
import java.util.Collections;

public class Task3 {
    public ArrayList<Integer> sortEvenNumberInList(ArrayList<Integer> list) {
        int pointer = 0;
        int rightBorder = list.size();
        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < rightBorder; i++) {
                if (list.get(i) < list.get(pointer) && list.get(i) % 2 == 0) {
                    int tmp = list.get(i);
                    list.set(i, list.get(pointer));
                    list.set(pointer, tmp);
                    pointer = i;
                    isSorted = false;
                } else if (list.get(i) > list.get(pointer) && list.get(i) % 2 == 0) {
                    pointer = i;
                }
            }
            rightBorder = pointer;
            pointer = 0;
        }
        return list;
    }

    public ArrayList<Integer> sortEvenNumberInListSublist(ArrayList<Integer> list) {
        ArrayList<Integer> sublist = new ArrayList<>();
        for (int number : list) {
            if (number % 2 == 0) {
                sublist.add(number);
            }
        }
        Collections.sort(sublist);
        int pointer = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 == 0) {
                list.set(i, sublist.get(pointer));
                pointer++;
            }
        }
        return list;
    }
}