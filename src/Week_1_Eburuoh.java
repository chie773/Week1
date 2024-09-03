import java.util.ArrayList;

public class Week_1_Eburuoh {
    public static void main(String[] args) {
        int[] nums = {2, 7};
        int target = 9;
        sum(nums, target);
    }
    public static void sum(int[] nums, int target) {
        ArrayList<Integer> newList = new ArrayList<>();

        if (nums.length < 2) {
            System.out.println("not enough numbers");
        } else {
            for (int i = 0; i < nums.length - 1; i++) {
                for (int j = i + 1; j < nums.length; j++) {
                    if (nums[i] + nums[j] == target) {
                        newList.add(i);
                        newList.add(j);
                        break;
                    }
                }
            }
            System.out.println(newList);
        }
    }
}