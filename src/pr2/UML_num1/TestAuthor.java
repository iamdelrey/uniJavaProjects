package pr2.UML_num1;

public class TestAuthor {
    public static void main(String[] args) {
        Author author1 = new Author("Jack London", "jlondon@gmail.com", 'm');
        System.out.println(author1);

        Author author2 = new Author("Jane Austen", "jane_austen@feeling.com", 'f');
        System.out.println(author2);
    }
}