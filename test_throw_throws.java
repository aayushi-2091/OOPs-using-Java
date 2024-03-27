public class test_throw_throws {
    public static void validateAge(int age) throws ArithmeticException { // throws is used to indicate what exception type may be
                                                                         //thrown by a method.
        if (age < 18) {
            throw new ArithmeticException("Person not eligible"); //throw is used to throw an exception for a method.
        } else {
            System.out.println("Eligible");
        }
    }

    public static void main(String[] args) {
        validateAge(15);
    }
}
