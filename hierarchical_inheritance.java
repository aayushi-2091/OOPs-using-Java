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
class Cat extends Animal{
    public void meows(){
        System.out.println("meowing");
    }
}
public class hierarchical_inheritance {
    public static void main(String[] args) {
        Cat p=new Cat();
        p.meows();
        //p.barks();
        p.eats();
}
}