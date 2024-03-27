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
class Puppy extends Dog{
    public void weeps(){
        System.out.println("weeping");
    }
}
public class multilevel_inheritance {
    public static void main(String[] args) {
        Puppy p=new Puppy();
        p.weeps();
        p.barks();
        p.eats();
}
}