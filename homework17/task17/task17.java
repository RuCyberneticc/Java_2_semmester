import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        int num = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                num++;
            } else if (s.charAt(i) == ')') {
                num--;
            }
            if (num < 0) {
                System.out.println(false);
                return;
            }
        }
        if (num == 0) {
            System.out.println(true);
            return;
        }
        System.out.println(false);
        return;

    }
