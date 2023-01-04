package identifiers.second;

import identifiers.first.Parent;

public class Child extends Parent {
    //klasa potomna w tej innej paczce nie ma dostępu do pól/metod private oraz deafult (czyli bez identyfikatora)
    public void testIdentifier() {
        System.out.println(first);
        System.out.println(third);
        firstMethod();
        thirdMethod();

    }
}
