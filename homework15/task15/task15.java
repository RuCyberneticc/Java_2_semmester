import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        String[] words;
        words = s.split(" ");
        HashSet<String> st = new HashSet<String>();
        for (int i = 0; i < words.length; i++) {
            st.add(words[i]);
        }
        for (String i: st) {
            System.out.print(i + " ");
        }
    }

}
