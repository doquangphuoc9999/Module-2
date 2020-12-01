package Demo;

public class Main extends Person{
    public Main(int age) {
        super(age);
    }

    public static void main(String[] args) {
        Person person = new Person(15);

        person.say();

    }
}
