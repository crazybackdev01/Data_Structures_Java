package Array_ArrayList;

import java.util.Arrays;

public class ArrayInFunc {

    public static int doubleMoney(int money) {
        return money * 2;
    }

    public static int[] doubleArrayMoney(int[] money) {
        for (int i = 0; i < money.length; i++) {
            money[i] = doubleMoney(money[i]);
        }
        return money;
    }

    public static void main(String[] args) {
        /*
         * Cannot make a static reference to the non-static method doubleMoney(int) from
         * the type ArrayInFunc....If we don't use static keyword in the above method
         * then we get above error
         */
        int money = doubleMoney(3000);
        int[] friendsMoney = { 100, 200, 300, 400 };
        int[] doubledFriendsMoney = doubleArrayMoney(friendsMoney);
        System.out.println(money);
        System.out.println(Arrays.toString(doubledFriendsMoney));
    }
}
