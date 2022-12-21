import java.util.Arrays;

//Определить класс Reader, хранящий такую информацию о пользователе библиотеки:
//
//1. ФИО,
//2. номер читательского билета,
//3. факультет,
//4. дата рождения,
//5. телефон.
//6. Методы (экземпляра, без слова static)  takeBook(), returnBook().
//7. Разработать программу, в которой создается массив объектов данного класса.
//8. Перегрузить методы takeBook(), returnBook():
//- takeBook, который будет принимать количество взятых книг. Выводит на консоль сообщение "Петров В. В. взял 3 книги".
//- takeBook, который будет принимать переменное количество названий книг.
// Выводит на консоль сообщение "Петров В. В. взял книги: Приключения, Словарь, Энциклопедия".
//- takeBook, который будет принимать переменное количество (Тип... parameterName)
// объектов класса Book (создать новый класс, содержащий имя и автора книги).
// Выводит на консоль сообщение "Петров В. В. взял книги: Приключения, Словарь, Энциклопедия".
//9. Аналогичным образом перегрузить метод returnBook().
// Выводит на консоль сообщение "Петров В. В. вернул книги: Приключения, Словарь, Энциклопедия".
// Или  "Петров В. В. вернул 3 книги".

public class Main {
    public static void main(String[] args) {
        Reader modric = new Reader("Luca Modric", 1000, Faculty.ECONOMICS,
                "01/10/1990", "+375441111111");
        Reader szensny = new Reader("Woicech Szensny", 2000, Faculty.ARCHITECTURE,
                "02/02/1991", "+375442222222");
        Reader zidane = new Reader("Zinedine Zidane", 3000, Faculty.COMPUTER_SCIENCE,
                "03/03/1987", "+375443333333");
        Reader dali = new Reader("Salvador Dali", 4000, Faculty.PSYCHOLOGY,
                "04/04/1934", "+375444444444");
        Reader tankian = new Reader("Serj Tankian", 5000, Faculty.COMPUTER_SCIENCE,
                "05/05/1974", "+375445555555");

        Book adventure = new Book("Adventure", "A.A.Earth");
        Book dictionary = new Book("Dictionary", "A.A.Science");
        Book encyclopedia = new Book("Encyclopedia", "A.A.Oracle");

        Reader[] readers = new Reader[]{modric, szensny, zidane, dali, tankian};

        for (Reader reader : readers) {
            reader.getAllReaderInformation();
        }
        System.out.println();

        System.out.println(Arrays.toString(readers));
        System.out.println();

        modric.takeBook(4);
        szensny.takeBook(encyclopedia);
        zidane.takeBook(adventure, dictionary);
        dali.takeBook(dictionary, adventure, new Book("Harry Hotter", "J.K.Rowling"));
        System.out.println();

        tankian.returnBook(2);
        dali.returnBook(adventure);
        modric.returnBook(dictionary, encyclopedia);
        tankian.returnBook(adventure, dictionary, new Book("Harry Hotter", "J.K.Rowling"));
    }
}