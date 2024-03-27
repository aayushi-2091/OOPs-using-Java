//to show multiple inheritance not possible with class
class A{
    public void message(){
        System.out.println("hello");
    }
}
class B{
    public void message(){
        System.out.println("welcome");
    }
}
public class multiple_inheritance extends A, B{  //consider we can write like this
    public static void main(String[] args) {
        multiple_inheritance p=new multiple_inheritance();
        p.message();
}
// this code will have error...