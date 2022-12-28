public class Footballer extends Person{

    //pole
    public String footballClub;

    public Footballer(String name, int age, String footballClub) {
        super(name, age);
        System.out.println("Jestem w konstruktorze footballer");
        this.footballClub = footballClub;
    }

    public void playFootball() {
        System.out.println("I'm playing football for " + footballClub + ". My name is "+name+" and I have "+age);
    }
}
