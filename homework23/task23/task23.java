import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int a = input.nextInt();
        int b = input.nextInt();
        int sm = 0;
        for (int i = 1; i <= n; i++) {
            if ((i % a == 0) || (i % b == 0)) {
                sm += i;
            }
        }
        System.out.println(sm);
        
    }

}
