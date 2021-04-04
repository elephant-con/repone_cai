package com.caipiso.eurka;

public class Tye {

    public static void main(String[] args) {
       int[] nums1 ={1,2,3,6,7,9,0,0,0};int[] nums2 ={2,5,6};
        merge(nums1,6,nums2,3);
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m - 1, p2 = n - 1;
        int tail = m + n - 1;
        int cur;
        while (p1 >= 0 || p2 >= 0) {
            if (p1 == -1) {
                cur = nums2[p2--];
            } else if (p2 == -1) {
                cur = nums1[p1--];
            } else if (nums1[p1] > nums2[p2]) {
                cur = nums1[p1--];
            } else {
                cur = nums2[p2--];
            }
            System.out.print(cur);

            nums1[tail--] = cur;
        }
        System.out.println();

        for (int i = 0; i < nums1.length; i++) {
        System.out.print(nums1[0]);

        }

    }


}
