import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        int mx = 0;
        String res = "";
        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                int l = j + 1 - i;
                if (isPal(s.substring(i, j + 1))) {
                    if (l > mx) {
                        mx = l;
                        res = s.substring(i, j + 1);
                    }
                }
            }
        }
        System.out.println(mx);
        System.out.println(res);

    }

    public static boolean isPal(String s) {
        String r = "";
        for(int i = 0; i < s.length(); i++) {
            r += s.charAt(s.length() - i - 1);
        }
        return r.equals(s);
    }

}
