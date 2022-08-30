public class Main {
    public static void main(String[] args) {
        Author a1 = new Author("Питер", "Уоттс");
        Author a2 = new Author("Курт", "Воннегут");
        Book b1 = new Book("Рифтеры", a1, 2014);
        Book b2 = new Book("Колыбель для кошки", a2, 1963);
        System.out.println(a1);
        System.out.println(a2);
        System.out.println(b1);
        System.out.println(b2);
        b2.setYear(2015);
        System.out.println(b2);
        System.out.println(a1.equals(a2));
        Author a3 = a2;
        System.out.println(a2.equals(a3));
        System.out.println(b1.equals(b2));
        Book b3 = b2;
        System.out.println(b2.equals(b3));
        System.out.println(a1.hashCode());
        System.out.println(a2.hashCode());
        System.out.println(b1.hashCode());
        System.out.println(b2.hashCode());
    }
}
