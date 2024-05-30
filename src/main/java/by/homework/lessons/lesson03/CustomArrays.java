package by.homework.lessons.lesson03;

import java.util.Random;

/**
 * @author ppuchinsky
 */
public class CustomArrays {

    private int[] nums = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

    int[][] nums2 = {{0, 1, 2}, {3, 4, 5}, {6, 7, 8}};


    public void fillAndPrintDoubleArray() {
        fillDoubleArray();


        for (int i = 0; i < nums2.length; i++) {
            for (int j = 0; j < nums2[i].length; j++) {
                System.out.print(nums2[i][j] + "|");
            }
            System.out.println();
        }
    }

    public void fillAndPrintDoubleArrayReverse() {
        fillDoubleArray();


        for (int i = nums2.length - 1; i >= 0; i--) {
            for (int j = nums2[i].length - 1; j >= 0; j--) {
                System.out.print(nums2[i][j] + "|");
            }
            System.out.println();
        }
    }

    private void fillDoubleArray() {
        for (int i = 0; i < nums2.length; i++) {
            for (int j = 0; j < nums2[i].length; j = j + 3) {
                nums2[i][j] = new Random().nextInt();
            }
        }
    }

    public void fillAndPrintArray() {
        fill();

        for (int num : nums) {
            System.out.println("Number: " + num);
        }
    }

    public void fillAndPrintArrayReverse() {
        fill();

        for (int i = nums.length - 1; i >= 0; i--) {
            System.out.println("Number: " + nums[i]);
        }
    }

    private void fill() {
        int num = 1;
        for (int i = 0; i < nums.length; i = i + 2) {
            nums[i] = new Random().nextInt();
        }
    }
}
