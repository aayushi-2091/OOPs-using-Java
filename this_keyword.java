public class this_keyword {
    int a;
    void show(int a){
        this.a=a;
        System.out.println(a);
    }
    public static void main(String[] args) {
        this_keyword ob=new this_keyword();
        ob.show(10);
    }
}
