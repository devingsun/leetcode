import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums1 = {0};
        int[] nums2 = {1};
        int m = 0;
        int n = 1;
        solution.merge(nums1, m, nums2, n);
    }

    public void merge(int[] nums1, int m, int[] nums2, int n) {

        List<Integer> list = new ArrayList<>();
        for(int i = 0 ; i < m; i++) {
            list.add(nums1[i]);
        }
        for(int i = 0 ; i < n; i++) {
            list.add(nums2[i]);
        }

        Collections.sort(list);
        for (int i = 0; i < list.size(); i++) {
            nums1[i] = list.get(i);
        }
    }
}
