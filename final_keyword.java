class final_keyword{
    public static void main(String[] args) {
        final int A=10;
        System.out.println(A);
        A++;            //final variable cannot be reinitialised.
        System.out.println(A);
    }
}