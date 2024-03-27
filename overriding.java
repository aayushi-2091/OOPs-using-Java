class Shape{
    void draw(){
        System.out.println("drawing");
    }
}
class Square extends Shape{
    @Override
    void draw(){
        super.draw();
        System.out.println("square");
    }
}
public class overriding {
    public static void main(String[] args) {
        Square ob=new Square();
        ob.draw();
    }
}
