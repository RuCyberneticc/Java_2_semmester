import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        double sqr = Math.sqrt(number);
        int mn = (int) sqr;
        int mx = mn + 1;
        if (Math.abs(number - mn * mn) >= Math.abs(number - mx * mx)) {
            System.out.println(mx);
        } else {
            System.out.println(mn);
        }

    }

}
