class A{
    final void atmpin(){
        System.out.println(1234);
    }
}
class B extends A{
    @Override
    void atmpin(){                     //final method cannot be overridden
        System.out.println(1234);
    }
}
public class final_method {
    public static void main(String[] args) {
        B ob=new B();
        ob.atmpin();
    }
}
