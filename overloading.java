public class overloading {
    public int add(int a,int b){
        return a+b;
    }
    public int add(int a,int b,int c){
        return a+b+c;
    }
    public double add(double a,double b){
        return a+b;
    }
    public static void main(String args[]){
        overloading ob=new overloading();
        System.out.println(ob.add(1,2));
        System.out.println(ob.add(1,2,3));
        System.out.println(ob.add(1.2,2.3));
    }
}
