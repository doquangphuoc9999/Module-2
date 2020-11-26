public class BabyDog extends Dog{
    int luongSua;

    public int getLuongSua() {
        return luongSua;
    }

    public void setLuongSua(int luongSua) {
        this.luongSua = luongSua;
    }
    public BabyDog(String name,int luongSua){
        //super.setName(name);
        super(name);
        this.luongSua=luongSua;
    }
    public void inRA(){
        System.out.println("tên chua cho con:"+this.getName()+"  luong sua:"+this.luongSua);
    }

//    public void eat() {
//        System.out.println("an chao");
//    }

    public void buSua(){
        System.out.println("bu sua");
    }
    public void buSua(Dog mama){
        System.out.println("bu sua tu me" + mama.getName());
    }
    public void buSua(String suahop){
        System.out.println("bu sua tu sua hop" + suahop);
    }
    public void bark() {
        System.out.println("oang oang");
    }

    public static void main(String[] args) {
        BabyDog babyDog = new BabyDog("ka",15);
        Dog babaydog2 = new BabyDog("ki",12);
        Dog daddyDog = new Dog();
        Dog mamaDog = new Dog("To");
        babyDog.inRA();


//        daddyDog.bark();
////        daddyDog.eat();
//
//
//        babyDog.bark();
////        babyDog.eat();
//        babaydog2.bark();
//        babyDog.buSua("ong tho");
//        babyDog.buSua(mamaDog);
    }
}
