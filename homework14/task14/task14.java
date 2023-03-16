import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> cell = new ArrayList<>();
        while (true) {
            Scanner input = new Scanner(System.in);
            System.out.print("Введите число: ");
            int x = input.nextInt();
            if (cell.size() < 3) {
                cell.add(x);
            } else {
                int idx = cell.indexOf(Collections.min(cell));
                cell.remove(idx);
                cell.add(idx, x);
            }
            System.out.println("Получившаяся ячейка: " + cell);
        }
    }

}
