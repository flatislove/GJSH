import hw3.Task1;
import hw3.Task2;
import hw3.Task3;
import hw3.Task4;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        list1.add(5);
        list1.add(3);
        list1.add(2);
        list1.add(4);
        list1.add(1);

        list2.add(5);
        list2.add(3);
        list2.add(2);
        list2.add(4);
        list2.add(1);

        Task1 task1 = new Task1();
        System.out.println("Task1");
        System.out.println(task1.isEqualsIntegerArrayLists(list1, list2));
        System.out.println(task1.isEqualsIntegerArrayListsIterator(list1, list2) + "\n");

        Task2 task2 = new Task2();
        System.out.println("Task2");
        System.out.println(task2.isContainNumberEqualsAmountTimesIterator(2, list1, list2));
        System.out.println(task2.isContainNumberEqualsAmountTimes(2, list1, list2) + "\n");

        ArrayList<Integer> list3 = new ArrayList<>();
        list3.add(10);
        list3.add(4);
        list3.add(5);
        list3.add(6);
        list3.add(7);
        list3.add(2);
        list3.add(2);
        list3.add(9);

        Task3 task3 = new Task3();
        System.out.println("Task3");
        ArrayList<Integer> list4 = new ArrayList<>(list3);
        System.out.println(list3);
        System.out.println(task3.sortEvenNumberInListSublist(list3));
        System.out.println(task3.sortEvenNumberInList(list4) + "\n");

        Task4 task4 = new Task4();
        System.out.println("Task4");
        ArrayList<Integer> list5 = new ArrayList<>(list3);
        System.out.println(list3);
        System.out.println(task4.removeAllEvenNumbersLambda(list5));
        System.out.println(task4.removeAllEvenNumbers(list3));
    }
}