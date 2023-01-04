public class PersonTest {
    public static void main(String[] args) {
        MathTeacher teacher = new MathTeacher("Tom", 29, "University");
//        teacher.name = "Tom";
//        teacher.age = 29;
        teacher.walk();
//        teacher.eat();
//        teacher.sayHello();
//        teacher.teachMath();
//        teacher.school = "UW";

        System.out.println();

        Footballer footballer1 = new Footballer("Mike", 21, "Legia");
//        footballer1.name = "Mike";
//        footballer1.age = 21;
//        footballer1.footballClub = "Legia";
        footballer1.walk();
//        footballer1.eat();
        //footballer1.playFootball();
    }
}
