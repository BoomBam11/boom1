package practice2;

public class RemoveSpacr {
    public static void main(String[] args) {
        String str = "Hello World! This is Java.";
        String result = "";

        // Iterate over each character in the string
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            // If the character is not a space, add it to the result
            if (c != ' ') {
                result =result+ c;
            }
        }

        System.out.println("Without spaces: " + result);
    }
}
