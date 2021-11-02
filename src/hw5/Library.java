package hw5;

public class Library {
    public static void main (String[] args) {
     Book book1 = new Book();
     Book book2 = new Book();
     Book book3 = new Book();
     book1.setName("Словарь");
     book2.setName("Энциклопедия");
     book3.setName("Роман");

     book1.setAuthor("Сидоров");
     book2.setAuthor("Петров");
     book3.setAuthor("Николаенко");

     book1.setDate("1980г");
     book2.setDate("1984г");
     book3.setDate("1990г");

     System.out.println(book1.getName());
     System.out.println(book2.getName());
     System.out.println(book3.getName());


     Reader user1 = new Reader();
     Reader user2 = new Reader();
     Reader user3 = new Reader();
     user1.setUser("Петр");
     user2.setUser("Николай");
     user3.setUser("Евгений");

     user1.setNumber ("1");
     user2.setNumber ("2");
     user3.setNumber ("3");

     System.out.println(user1.getUser());
     System.out.println(user2.getUser());
     System.out.println(user3.getUser());






  }

}