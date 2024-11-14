package practice2;


public class WithOutThirdNum {
    public static void main(String[] args) {
        int a = 5;
        int b = 3;
        
        System.out.println("Before swapping: a = " + a + ", b = " + b);

        // Swap without a third variable
        a = a + b; // a now becomes 8 (5 + 3)
        b = a - b; // b becomes 5 (8 - 3)
        a = a - b; // a becomes 3 (8 - 5)

        System.out.println("After swapping: a = " + a + ", b = " + b);
    }
}
