import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        String strArr[] = str.split(" ");
        int nums[] = new int[strArr.length];
        for (int i = 0; i < strArr.length; i++) {
            nums[i] = Integer.parseInt(strArr[i]);
            // System.out.println(numArr[i]);
        }
        String result = getRanges(nums);
        System.out.println(result);
    }
    public static String getRanges(int[] nums) {
        ArrayList<String> ranges = new ArrayList<>();
        int start = nums[0];
        int end = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == end + 1) {
                end = nums[i];
            } else {
                if (start == end) {
                    ranges.add(String.valueOf(start));
                } else {
                    ranges.add(start + "-" + end);
                }
                start = nums[i];
                end = nums[i];
            }
        }
        if (start == end) {
            ranges.add(String.valueOf(start));
        } else {
            ranges.add(start + "-" + end);
        }
        return String.join(",", ranges);
    }
}
