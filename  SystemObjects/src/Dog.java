public class Dog {

    public final void eat() {
        System.out.println("an thit phuoc");
    }
    public void bark(){
        System.out.println("Gâu gâu");
    }
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public Dog(String name){
        this.name= name;
    }
    public Dog(){}

}
