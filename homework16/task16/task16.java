import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        int up = 0;
        int low = 0;
        for (int i = 0; i < s.length(); i++) {
            if (Character.isUpperCase(s.charAt(i))) {
                up++;
            } else {
                low++;
            }
        }
        if (up > low) {
            s = s.toUpperCase();
        } else {
            s = s.toLowerCase();
        }
        System.out.println(s);
    }

}
