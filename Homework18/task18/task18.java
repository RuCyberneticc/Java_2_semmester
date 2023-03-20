import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        String[] nums = s.split(" ");
        int mx = 0;
        int idx = -1;
        for (int i = 0; i < nums.length; i++) {
            if (Integer.parseInt(nums[i]) > mx) {
                mx = Integer.parseInt(nums[i]);
                idx = i;
            }
        }
        String[] nums1 = new String[idx];
        String[] nums2 = new String[nums.length - (idx + 1)];
        for (int i = 0; i < idx; i++) {
            nums1[i] = nums[i];
        }
        for (int i = 0; i < (nums.length) - (idx + 1); i++) {
            nums2[i] = nums[i + idx + 1];
        }

        for (String num1: nums1) {
            System.out.print(num1 + " ");
        }
        System.out.println();

        for (String num2: nums2) {
            System.out.print(num2 + " ");
        }


    }

}
