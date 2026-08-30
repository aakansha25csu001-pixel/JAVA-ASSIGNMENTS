package week4;

public class StringFundamentals {
    static boolean hasText(String value) {
        if (value == null) {
            return false;
        }
        if (value.isEmpty()) {
            return false;
        }

        for (int i = 0; i < value.length(); i++) {
            if (!Character.isWhitespace(value.charAt(i))) {
                return true;
            }
        }
        return false;
    }

    static String normalizeCourseCode(String code) {
        if (code == null) {
            return null;
        }
        return code.trim().toUpperCase();
    }
    static int countOccurrences(String text, char target) {
        if (text == null) {
            return 0;
        }

        int count = 0;

        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == target) {
                count++;
            }
        }

        return count;
    }
    static int lengthOfLastWord(String text) {
        if (text == null || text.isEmpty()) {
            return 0;
        }

        int i = text.length() - 1;
        while (i >= 0 && text.charAt(i) == ' ') {
            i--;
        }
        int length = 0;
        while (i >= 0 && text.charAt(i) != ' ') {
            length++;
            i--;
        }
        return length;
    }

    static void reverseString(char[] characters) {
        if (characters == null || characters.length <= 1) {
            return;
        }
        int left = 0;
        int right = characters.length - 1;

        while (left < right) {
            char temp = characters[left];
            characters[left] = characters[right];
            characters[right] = temp;
            left++;
            right--;
        }
    }
    public static void main(String[] args) {
        System.out.println("hasText(null): " + hasText(null));
        System.out.println("hasText(\"\"): " + hasText(""));
        System.out.println("hasText(\"   \"): " + hasText("   "));
        System.out.println("hasText(\"Java\"): " + hasText("Java"));

        System.out.println("Normalized: "+ normalizeCourseCode("  cs101  "));
        System.out.println("Normalized null: "+ normalizeCourseCode(null));

        System.out.println("Occurrences of 'a': "+ countOccurrences("Java Programming", 'a'));
        System.out.println("Occurrences in empty string: "+ countOccurrences("", 'a'));
        System.out.println("Occurrences in null: "+ countOccurrences(null, 'a'));
        System.out.println("Last word length: "+ lengthOfLastWord("Hello World"));
        System.out.println("Trailing spaces: "+ lengthOfLastWord("Hello World   "));
        System.out.println("One character: "+ lengthOfLastWord("A"));
        System.out.println("Empty: "+ lengthOfLastWord(""));
        System.out.println("Null: "+ lengthOfLastWord(null));
       char[] characters = {'h', 'e', 'l', 'l', 'o'};
        reverseString(characters);

        System.out.print("Reversed: ");
        for (char c : characters) {
            System.out.print(c);
        }
    }    
}
