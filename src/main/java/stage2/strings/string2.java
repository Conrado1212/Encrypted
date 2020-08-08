package stage2.strings;

public class string2 {
    public static void main(String[] args) {
        String str1 = "aaabbcccdaa";
        String str2 = " ";

        for (int i = 0; i < str1.length(); i++) {
            char ch = str1.charAt(i);
            if (ch != str2.charAt(str2.length() - 1)) {
                str2 += ch;
                System.out.print(str2);
            }

        }
    }
}
