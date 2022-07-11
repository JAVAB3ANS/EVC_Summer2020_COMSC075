package src;

public class ForEachExample {
    public static void main(String[] args) {
        String[] words = {"ant", "bee", "cat", "dog", "elk", "fox"};

        for (int i = 0; i < words.length; i++) {
            System.out.println(words[i]);
        }

        System.out.println("===================");

        for (String oneWord: words) {
            System.out.println(oneWord);
        }
    }
}