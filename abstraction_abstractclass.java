abstract class A{
    abstract int num();
}
class B extends A{
    int num(){
        return 7;
    }
}
class C extends A{
    int num(){
        return 8;
    }
}
public class abstraction_abstractclass {
    public static void main(String[] args) {
        B ob=new B();
        System.out.println(ob.num());
        C obj=new C();
        System.out.print(obj.num());
    }
}
