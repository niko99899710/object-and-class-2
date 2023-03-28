public class Main {

    public static void main(String[] args) {
        System.out.println("Hello world!");
        task_1_3_4_5();
        task_2_3_4();
        task_6_7();
    }

    public static void task_1_3_4_5() {
        System.out.println("Задание 1-3-4-5");
        Author author = new Author("Sarah", "J. Maas");
        Book book = new Book("The glass throne", author, 2012);
        System.out.print("Название книги: " + book.getName() + ", ");
        System.out.print(" Aвтор: " + book.getAuthor().getName());
        System.out.print(" год: " + book.age + ". " );
        book.setAge(2020);
        System.out.print(" (год: " + book.age + "). " );
        System.out.println();

        System.out.println(book);
    }

    public static void task_2_3_4() {
        System.out.println("Задание 2-3-4");
        Author sarah = new Author("Sarah", "Maas");
        System.out.print("Имя авторa - " + sarah.getName() + ", ");
        System.out.print(" Фамилия авторa - " + sarah.getSurname() + ". ");
        System.out.println();

        System.out.println(sarah);
    }

    public static void task_6_7() {
        System.out.println("Задание 6-7");
        Author author = new Author("Erin","Farron");
        Mimi mysticism = new Mimi ("Shadow Clan", author,2023);
        System.out.print("Название книги: " + mysticism.getNameBook() + ", ");
        System.out.print(" Автор: " + mysticism.getAuthor().getName() + ", ");
        System.out.print(" год: " + mysticism.ageBook + ". " );
        mysticism.setAgeBook(2022);
        System.out.print(" (год: " + mysticism.ageBook + "). " );
        System.out.println();

        Author author1 = new Author("Fuyui", "G");
        Mimi horror = new Mimi("Shiki", author);
        System.out.print("Название книги: " + horror.getNameBook() + ", ");
        System.out.print(" Автор: " + horror.getAuthor().getName() + ". ");
        System.out.println();
    }
}