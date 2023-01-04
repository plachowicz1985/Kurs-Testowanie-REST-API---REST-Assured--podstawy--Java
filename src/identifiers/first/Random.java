package identifiers.first;

public class Random {
    public void testIdentifier() {

        //klasa w tej samej paczce nie ma dostępu do pól/metod private

        Parent parent = new Parent();

        System.out.println(parent.first);
        System.out.println(parent.second);
        System.out.println(parent.third);
        parent.firstMethod();
        parent.secondMethod();
        parent.thirdMethod();
    }
}
