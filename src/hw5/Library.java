package hw5;

public class Library {
 public static void main(String[] args) {
  Reader reader1 = new Reader("Петров В.В.", 1, "Экономика", "21.10.1999", "+806711111");
  Reader reader2 = new Reader("Иванов И.И.", 2, "Международное Право", "11.11.1997", "+806722222");
  Reader reader3 = new Reader("Сидоров А.А.", 3, "Программирование", "05.04.2005", "+806733333");
  Reader[] readers = {reader1, reader2, reader3};

  Book book1 = new Book("Словарь", "Иванов", "(1985г.)");
  Book book2 = new Book("Энциклопедия", "Гройс", "(2021.)");
  Book book3 = new Book("Автостопом по Галактике", "Дуглас Адамс", "(1979г.)");
  Book[] books = {book1, book2, book3};

  printReaders(readers);
  printBooks(books);

  reader1.takeBook(3);
  reader2.takeBook("Словарь, Иванов", "Энциклопедия, Гройс", "Автостопом по Галактике, Дуглас Адамс" );
  reader3.takeBook(book1, book2,book3);

  reader1.returnBook(3);
  reader2.returnBook("Автостопом по Галактике, Дуглас Адамс", "Словарь, Иванов", "Энциклопедия, Гройс");
  reader3.returnBook(book1,book2,book3);
 }

 private static void printBooks(Book[] books) {
  System.out.println("Список книг:");
  for (Book book : books) {
   System.out.println(book.getInfo());
  }
  System.out.println();
 }

 private static void printReaders(Reader[] readers) {
  System.out.println("Список читателей:");
  for (Reader reader : readers) {
   System.out.println( reader.getInfo());
  }
  System.out.println();
 }
}
