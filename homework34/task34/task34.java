import java.util.*;
import java.math.*;

public class Main {
    public static void main(String[] args) {
        System.out.print("Введите веса: ");
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        String[] arr = s.split(" ");
        Map<String, Integer> mp = new HashMap<String, Integer>();
        for (int i = 0; i < arr.length; i++) {
            mp.put(arr[i], count(arr[i]));
        }
        mp.entrySet().stream().sorted(Map.Entry.<String, Integer>comparingByValue()).forEach(e -> System.out.print(e.getKey() + " "));

    }

    public static int count(String s) {
        int res = 0;

        for (int i = 0; i < s.length(); i++) {
            res += Integer.parseInt(String.valueOf(s.charAt(i)));
        }
        return res;
    }


}
