public class Array {
    public static void main(String[] args) {
        try {
            int[] numbers = {1, 2, 3};
            int a = 4;
            int b = numbers[a];
            System.out.println("Value at a " + a + ": " + b);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Array index out of bounds");
        } finally {
            System.out.println("Exception handling completed.");
        }
    }
}
