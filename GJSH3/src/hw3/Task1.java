package hw3;

//На вход приходят два ArrayList<Integer> напишите метод, который проверяет два массива на равенство.
// Нужно реализовать алгоритм, не использовать метод equals.

import java.util.ArrayList;
import java.util.Iterator;

public class Task1 {
    public boolean isEqualsIntegerArrayLists(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        if (list1.size() != list2.size()) {
            return false;
        } else {
            for (int i = 0; i < list1.size(); i++) {
                if (list1.get(i) != list2.get(i)) {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean isEqualsIntegerArrayListsIterator(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        if (list1.size() != list2.size()) {
            return false;
        } else {
            Iterator<Integer> iterator1 = list1.iterator();
            Iterator<Integer> iterator2 = list2.iterator();
            while (iterator1.hasNext()) {
                if (iterator1.next().compareTo(iterator2.next()) != 0) {
                    return false;
                }
            }
        }
        return true;
    }
}