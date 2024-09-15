public class P88 {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] nums3 = new int[m];
        for (int c = 0; c < m; c++) {
            nums3[c] = nums1[c];
        }

        while (m != 0 || n != 0) {
            if (m == 0) {
                nums1[nums1.length - m - n] = nums2[nums2.length - n];
                n--;
                continue;
            }
            
            if (n == 0) {
                nums1[nums1.length - m - n] = nums3[nums3.length - m];
                m--;
                continue;
            }

            if (nums2[nums2.length - n] < nums3[nums3.length - m]) {
                nums1[nums1.length - m - n] = nums2[nums2.length - n];
                n--;
                continue;
            } else {
                nums1[nums1.length - m - n] = nums3[nums3.length - m];
                m--;
                continue;
            }
            

        }

        for (int c = 0; c < nums1.length; c++) {
            System.out.print(nums1[c] + ", ");
        }
    }

    public static void main(String[] args) {
        int[] arr1 = {1,2,3,0,0,0};
        int[] arr2 = {2,5,6};
        merge(arr1, 3, arr2, 3);
    }
}