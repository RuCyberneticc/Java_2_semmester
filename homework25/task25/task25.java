import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        String[] arr = s.split(" ");
        int[] arr2 = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arr2[i] = Integer.parseInt(arr[i]);
        }
        int m = arr2[0];
        int n = arr2[1];
        int sm = 0;
        for (int i = m; i <= n; i++) {
            boolean flag = true;
            for (int j = 2; j < arr2.length; j++) {
                if (i % arr2[j] != 0) {
                    flag = false;
                }
            }
            if (flag) {
                sm += i;
            }
        }
        System.out.println(sm);

    }

}
