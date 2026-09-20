package college.util;
public class TextUtils {
    private static int count = 0;
    private TextUtils() {
    }
    public static String normalizeName(String name) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Name cannot be empty");
        }
        name = name.trim();
        StringBuilder result = new StringBuilder();
        boolean space = false;
        for (int i = 0; i < name.length(); i++) {
            char ch = name.charAt(i);
            if (ch == ' ') {
                if (!space) {
                    result.append(' ');
                    space = true;
                }
            } 
            else {
                result.append(ch);
                space = false;
            }
        }
        String text = result.toString().toLowerCase();
        StringBuilder finalResult = new StringBuilder();
        boolean capitalize = true;
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (capitalize && ch != ' ') {
                finalResult.append(Character.toUpperCase(ch));
                capitalize = false;
            } else {
                finalResult.append(ch);
            }
            if (ch == ' ') {
                capitalize = true;
            }
        }
        count++;
    }
    public static int getCount() {
        return count;
    }
}