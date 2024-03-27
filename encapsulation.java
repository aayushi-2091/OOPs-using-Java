class Person{
    private int age;
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age=age;
    }
}
public class encapsulation {
    public static void main(String[] args) {
        Person p=new Person();
        p.setAge(19);
        System.out.println("Age: "+p.getAge());
    }
}
