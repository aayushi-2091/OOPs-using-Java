class A{
    int a=10;
}
public class superkeyword extends A {
    int b=20;
    void show(){
        System.out.println(b);
        System.out.println(super.a);
    }
    public static void main(String[] args) {
        superkeyword ob=new superkeyword();
        ob.show();
    }
}
