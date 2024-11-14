package practice2;

public class RevStr {
    public static void countCharacters(String str) {
        int[] charCount = new int[256]; // Assumes ASCII character set

        // Increment count for each character in the string except spaces
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c != ' ') {
                charCount[c]++;
            }
        }

        // Print the characters and their counts
        for (int i = 0; i < charCount.length; i++) {
            if (charCount[i] > 0) {
                System.out.println((char) i + ": " + charCount[i]);
            }
        }
    }

    public static void main(String[] args) {
        String input = "hello world";
        countCharacters(input);
    }
}