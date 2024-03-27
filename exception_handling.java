public class exception_handling {
    public static void main(String[] args) {
        try{
            int i=50/0;
        }
        catch(ArithmeticException e){
            System.out.println(e);
        }
        finally{
            System.out.println("Block is executed.");
        }
        System.out.println("Rest of the code.");
    }
}
