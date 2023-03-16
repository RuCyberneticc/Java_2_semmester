import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String word = "Hello";
        char letter = 'l';
        System.out.println(str_count(word, letter));
    }

    public static int str_count(String a, char b) {
        int res = 0;
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) == b) {
                res++;
            }
        }
        return res;
    }

}
