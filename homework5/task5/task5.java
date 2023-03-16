import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        String[] arr = str.split(" ");
        int res = 0;
        for (String i: arr) {
            res += Integer.parseInt(i) * Integer.parseInt(i);
        }
        System.out.println(res);
    }

}
