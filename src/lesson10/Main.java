package lesson10;

public class Main {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Речення не вказано.");
            return;
        }

        String sentence = String.join(" ", args);


        int[] letterCount = new int[26];

        for (int i = 0; i < sentence.length(); i++) {
            char ch = Character.toLowerCase(sentence.charAt(i));
            if (ch >= 'a' && ch <= 'z') {
                letterCount[ch - 'a']++;
            }
        }

        for (char ch = 'a'; ch <= 'z'; ch++) {
            int count = letterCount[ch - 'a'];
            if (count > 0) {
                System.out.println("'" + ch + "': " + count);
            }
        }
    }
}

