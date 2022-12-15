package hw3;

//На вход методу приходят два ArrayList<Integer> и целое число num.
//Проверьте, что число num встречается в обоих массивах одинаковое кол-во раз.

import java.util.ArrayList;
import java.util.Iterator;

public class Task2 {
    public boolean isContainNumberEqualsAmountTimesIterator(int num, ArrayList<Integer> list1, ArrayList<Integer> list2) {
        Iterator<Integer> iterator1 = list1.iterator();
        Iterator<Integer> iterator2 = list2.iterator();
        int amount1 = 0;
        int amount2 = 0;
        while (iterator1.hasNext()) {
            if (iterator1.next() == num) {
                amount1++;
            }
        }
        while (iterator2.hasNext()) {
            if (iterator2.next() == num) {
                amount2++;
            }
        }
        return amount1 == amount2;
    }

    public boolean isContainNumberEqualsAmountTimes(int num, ArrayList<Integer> list1, ArrayList<Integer> list2) {
        int amount1 = 0;
        int amount2 = 0;
        for (int number1 : list1) {
            if (number1 == num) {
                amount1++;
            }
        }
        for (int number2 : list2) {
            if (number2 == num) {
                amount2++;
            }
        }
        return amount1 == amount2;
    }
}