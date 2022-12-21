//Определить класс Reader, хранящий такую информацию о пользователе библиотеки:

//    Методы (экземпляра, без слова static) takeBook(), returnBook().
//    Разработать программу, в которой создается массив объектов данного класса.
//    Перегрузить методы takeBook(), returnBook():
//    takeBook, который будет принимать количество взятых книг. Выводит на консоль сообщение "Петров В. В. взял 3 книги".
//    takeBook, который будет принимать переменное количество названий книг. Выводит на консоль сообщение "Петров В. В. взял книги: Приключения, Словарь, Энциклопедия".
//    takeBook, который будет принимать переменное количество (Тип... parameterName) объектов класса Book (создать новый класс, содержащий имя и автора книги). Выводит на консоль сообщение "Петров В. В. взял книги: Приключения, Словарь, Энциклопедия".
//    Аналогичным образом перегрузить метод returnBook(). Выводит на консоль сообщение "Петров В. В. вернул книги: Приключения, Словарь, Энциклопедия". Или "Петров В. В. вернул 3 книги".

import java.util.Arrays;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Reader reader1 = new Reader("Luca Modric",1000,Faculty.ECONOMICS, "01/10/1990","+375441111111");
        Reader reader2 = new Reader("Woicech Szensny",2000,Faculty.ARCHITECTURE, "02/02/1991","+375442222222");
        Reader reader3 = new Reader("Zinedine Zidane",3000,Faculty.COMPUTER_SCIENCE, "03/03/1987","+375443333333");
        Reader reader4 = new Reader("Salvador Dali",4000,Faculty.PSYCHOLOGY, "04/04/1934","+375444444444");
        Reader reader5 = new Reader("Serj Tankian",5000,Faculty.COMPUTER_SCIENCE, "05/05/1974","+375445555555");
        Reader[] readers = new Reader[]{reader1,reader2,reader3,reader4,reader5};
        System.out.println(Arrays.toString(readers));
    }

}