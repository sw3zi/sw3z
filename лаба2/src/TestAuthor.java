public class TestAuthor {
    public TestAuthor() {
    }

    public static void main(String[] args) {
        Author a1 = new Author("Nikita", "nikita.borisov.a@yandex.ru", 'M');
        System.out.println(a1);
        a1.setEmail("test123@yandex.ru");
        System.out.println(a1);
    }
}