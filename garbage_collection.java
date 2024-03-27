public class garbage_collection {
    protected void finalize(){
        System.out.println("Garbage is collected.");
    }
    public static void main(String[] args) {
        garbage_collection ob=new garbage_collection();
        ob=null;
        System.gc();
    }
}
