package pr2.UML_num1;

public class fictitiousAssertAuthor {

    public static void main(String[] args) {
        test_Author();
        test_toString();
    }

    public static void test_Author() {
        {
            final var name = "J.K. Rowling";
            final var email = "rowling@gmail.com";
            final var gender = 'f';
            var a = new Author(name, email, gender);

            // Проверка имени
            if (name.equals(a.getName())) {
                System.out.println("Test 1: Name - Passed");
            } else {
                System.out.println("Test 1: Name - Failed");
            }

            // Проверка email
            if (email.equals(a.getEmail())) {
                System.out.println("Test 1: Email - Passed");
            } else {
                System.out.println("Test 1: Email - Failed");
            }

            // Проверка пола
            if (gender == a.getGender()) {
                System.out.println("Test 1: Gender - Passed");
            } else {
                System.out.println("Test 1: Gender - Failed");
            }
        }
        {
            final var name = "J.K. Rowling";
            final var email = "rowling@gmail.com";
            final var gender = 'x';
            final var targetGender = 'u';

            var a = new Author(name, email, gender);

            // Проверка имени
            if (name.equals(a.getName())) {
                System.out.println("Test 2: Name - Passed");
            } else {
                System.out.println("Test 2: Name - Failed");
            }

            // Проверка email
            if (email.equals(a.getEmail())) {
                System.out.println("Test 2: Email - Passed");
            } else {
                System.out.println("Test 2: Email - Failed");
            }

            // Проверка пола
            if (targetGender == a.getGender()) {
                System.out.println("Test 2: Gender - Passed");
            } else {
                System.out.println("Test 2: Gender - Failed");
            }
        }
        {
            final var name = "Arthur Conan Doyle";
            final var email = "doyle@heavens.god";
            final var gender = 'm';

            var a = new Author(name, email, gender);

            // Проверка имени
            if (name.equals(a.getName())) {
                System.out.println("Test 3: Name - Passed");
            } else {
                System.out.println("Test 3: Name - Failed");
            }

            // Проверка email
            if (email.equals(a.getEmail())) {
                System.out.println("Test 3: Email - Passed");
            } else {
                System.out.println("Test 3: Email - Failed");
            }

            // Проверка пола
            if (gender == a.getGender()) {
                System.out.println("Test 3: Gender - Passed");
            } else {
                System.out.println("Test 3: Gender - Failed");
            }
        }
    }

    public static void test_toString() {
        {
            var rowling = new Author("J.K. Rowling", "rowling@gmail.com", 'f');
            String expectedString = "J.K. Rowling (f) at rowling@gmail.com";
            String authorString = rowling.toString();

            // Проверка строки toString()
            if (expectedString.equals(authorString)) {
                System.out.println("Test 4: toString() - Passed");
            } else {
                System.out.println("Test 4: toString() - Failed");
            }
        }
        {
            var doyle = new Author("Arthur Conan Doyle", "doyle@heavens.god", 'm');
            String expectedString = "Arthur Conan Doyle (m) at doyle@heavens.god";
            String authorString = doyle.toString();

            // Проверка строки toString()
            if (expectedString.equals(authorString)) {
                System.out.println("Test 5: toString() - Passed");
            } else {
                System.out.println("Test 5: toString() - Failed");
            }
        }
    }
}