public class copy_constructor {
    int a;
    copy_constructor(){
        a=10;
        System.out.println(a);
    }
    copy_constructor(copy_constructor ref){
        a=ref.a;
        System.out.println(a);
    }
    public static void main(String[] args) {
        copy_constructor ob=new copy_constructor();
        copy_constructor ob1=new copy_constructor(ob);
    }
}
