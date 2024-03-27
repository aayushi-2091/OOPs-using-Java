interface ABC{
    void print();
}
public class abstraction_interface implements ABC{
    public void print(){
        System.out.println("Hello");
    }
    public static void main(String[] args) {
        abstraction_interface ob=new abstraction_interface();
        ob.print();
    }
}
