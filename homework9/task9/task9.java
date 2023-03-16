import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String a = input.nextLine();
        String b = input.nextLine();
        int idx = a.lastIndexOf(b);
        System.out.println(idx == a.length() - b.length());

    }

}
