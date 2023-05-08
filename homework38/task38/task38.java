import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите текст:");
        String text = scanner.nextLine();
        String[] sentences = text.split("(?<=[.!?])\\s*");
        for (String sentence : sentences) {
            String[] words = sentence.split("\\s+");
            StringBuilder result = new StringBuilder();
            for (String word : words) {
                String firstLetter = word.substring(0, 1);
                String restOfWord = word.substring(1);
                result.append(restOfWord).append(firstLetter).append("ауч ");
            }
            System.out.print(result.toString().trim());
            System.out.print(sentence.charAt(sentence.length() - 1));
            System.out.println();
        }
    }
}
