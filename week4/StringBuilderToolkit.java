package week4;
public class StringBuilderToolkit {

    static String reverse(String text) {
        if (text == null) {
            return null;
        }
    StringBuilder sb = new StringBuilder(text);
        return sb.reverse().toString();
    }

    static String repeat(String text, int count) {
        if (text == null) {
            return null;
        }

        if (count < 0) {
            throw new IllegalArgumentException("Count cannot be negative");
        }
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < count; i++) {
      sb.append(text);
        }
        return sb.toString();
    }
    static String joinWords(String[] words, String separator) {
        if (words == null) {
            return null;
        }
        if (separator == null) {
            separator = "";
        }
       StringBuilder sb = new StringBuilder();

    for (int i = 0; i < words.length; i++) {
    if (words[i] != null) {
      sb.append(words[i]);
    }
     if (i < words.length - 1) 
        {
                sb.append(separator);
        }
        }
        return sb.toString();
    }

    static String removeCharacterAt(String text, int index) {
        if (text == null) {
            return null;
        }

        if (index < 0 || index >= text.length()) {
            throw new IndexOutOfBoundsException("Invalid index");
        }
       StringBuilder sb = new StringBuilder(text);
        sb.deleteCharAt(index);
     return sb.toString();
    }
    static String replaceCharacterAt(String text, int index, char replacement) {
        if (text == null) {
            return null;
        }

    if (index < 0 || index >= text.length()) {
            throw new IndexOutOfBoundsException("Invalid index");
        }
      StringBuilder sb = new StringBuilder(text);
        sb.setCharAt(index, replacement);
         return sb.toString();
    }

    static String buildNumberedList(String[] items) {
        if (items == null) {
            return null;
        }
      StringBuilder sb = new StringBuilder();
        for (int i = 0; i < items.length; i++) {
            sb.append(i + 1);
            sb.append(". ");
         if (items[i] != null) {
                sb.append(items[i]);
            }
            if (i < items.length - 1) {
                sb.append("\n");
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
     System.out.println("Reverse: " + reverse("Java"));
     System.out.println("Repeat: " + repeat("Hi ", 3));
     String[] words = {"Java", "Python", "C++"};
        System.out.println("Join: " + joinWords(words, " | "));
    System.out.println("Remove: "+ removeCharacterAt("Hello", 1));
   System.out.println("Replace: " + replaceCharacterAt("Hello", 1, 'a'));
    String[] items = {"Learn Java", "Practice", "Solve problems"};
        System.out.println("Numbered List:");
        System.out.println(buildNumberedList(items));
        System.out.println("Reverse empty: " + reverse(""));
        System.out.println("Repeat zero: " + repeat("Java", 0));
        System.out.println("Reverse null: " + reverse(null));
        System.out.println("Join null: " + joinWords(null, ", "));
        StringBuilder builder = new StringBuilder("Hello");

     String result = builder.toString();
     builder.append(" World");
     System.out.println("Builder: " + builder);
    System.out.println("String result: " + result);
    }
}

