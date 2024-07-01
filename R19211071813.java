import java.util.*;

class R19211071813 {
    public static void main(String[] args) {
        int[] nums = { 7, -2, 9, -8, -6, -4, 10, -1 }; 
        int pos = 0, neg = 0, p = 0, n = 0;

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];

            if (num == -1) {
                break;             }

            if (num > 0) {
                pos++;
                p += num;
            } else if (num < 0) {
                neg++;
                n += num;
            }
        }

        System.out.println("Number of negative values: " + neg);
        System.out.println("Number of positive values: " + pos);
        System.out.println("Sum of negative values: " + n);
        System.out.println("Sum of positive values: " + p);

        float p1 = p / pos;
        float p2 =  n / neg ;
        System.out.println("Average of positive numbers: " + p1);
        System.out.println("Average of negative numbers: " + p2);
    }
}
