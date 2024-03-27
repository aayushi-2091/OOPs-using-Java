class Animal{
    public void eats(){
        System.out.println("eating");
    }
}
class Dog extends Animal{
    public void barks(){
        System.out.println("barking");
    }
}
public class single_inheritance {
    public static void main(String[] args) {
        Dog d=new Dog();
        d.barks();
        d.eats();
    }
}
