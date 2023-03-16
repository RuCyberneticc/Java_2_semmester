import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String a = input.nextLine();
        String word = del_vowel(a);
        System.out.println(word);

    }

    public static String del_vowel(String word){
        String res = "";
        char[] vowels = new char[]{'a', 'e', 'u', 'i', 'o', 'y', 'а', 'е', 'ё', 'у', 'ы', 'о', 'э', 'я', 'и', 'ю'};
        for (int i = 0; i < word.length(); i++) {
            char local = word.charAt(i);
            boolean flg = false;
            for (char j: vowels) {
                if (j == local) {
                    flg = true;
                    break;
                }
            }
            if (!flg) {
                res += local;
            }
        }
        return res;
    }

}
